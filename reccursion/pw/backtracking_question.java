import java.util.ArrayList;
import java.util.Arrays;

public class backtracking_question {
    public static void main(String[] args) {
        // System.out.println(count_ways_in_maze(3,3));

        // print the path in list
        // ArrayList<String>ans=new ArrayList<>();
        // ans=path("",3,3);
        // ans=pathDiagonal("",3,3);
        // System.out.println(ans);

        // boolean [][]maze={
        // {true,true,true},
        // {true,false,true},
        // {true,true,true}
        // };
        // mazePathRestrict("", maze, 0, 0);

        boolean[][] maze1 = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };
        // allPath("", maze1, 0, 0);

        // print arr and path of maze
        int[][] path = new int[maze1.length][maze1[0].length];
        allPathCountPrint("", maze1, 0, 0, path, 0);

    }

    static int count_ways_in_maze(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = count_ways_in_maze(r - 1, c);
        int right = count_ways_in_maze(r, c - 1);
        return left + right;
    }

    static ArrayList<String> path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (r > 1) {
            ans.addAll(path(p + 'D', r - 1, c));
        }
        if (c > 1) {
            ans.addAll(path(p + 'R', r, c - 1));
        }
        return ans;
    }

    static ArrayList<String> pathDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (r > 1 && c > 1) {
            ans.addAll(pathDiagonal(p + 'D', r - 1, c - 1));
        }
        if (r > 1) { // vertical
            ans.addAll(pathDiagonal(p + 'V', r - 1, c));
        }
        if (c > 1) {
            // right
            ans.addAll(pathDiagonal(p + 'R', r, c - 1));
        }
        return ans;
    }

    // r c starts from 0,0
    public static void mazePathRestrict(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }

        if (r < maze.length - 1) { // down
            mazePathRestrict(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) { // right
            mazePathRestrict(p + 'R', maze, r, c + 1);
        }
    }

    public static void allPath(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        // i am considering this block in my path
        maze[r][c] = false;

        if (r < maze.length - 1) { // down
            allPath(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) { // right
            allPath(p + 'R', maze, r, c + 1);
        }

        if (r > 0) { // up
            allPath(p + 'U', maze, r - 1, c);
        }

        if (c > 0) { // left
            allPath(p + 'L', maze, r, c - 1);
        }

        // this line is where the function will over
        // so beforee the function gets removed also changes that were made by that
        // function

        maze[r][c] = true;
    }

    public static void allPathCountPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }
        // i am considering this block in my path
        maze[r][c] = false;
        path[r][c] = step; // for backtracking

        if (r < maze.length - 1) { // down
            allPathCountPrint(p + 'D', maze, r + 1, c, path, step + 1);
        }
        if (c < maze[0].length - 1) { // right
            allPathCountPrint(p + 'R', maze, r, c + 1, path, step + 1);
        }

        if (r > 0) { // up
            allPathCountPrint(p + 'U', maze, r - 1, c, path, step + 1);
        }

        if (c > 0) { // left
            allPathCountPrint(p + 'L', maze, r, c - 1, path, step + 1);
        }

        // this line is where the function will over
        // so beforee the function gets removed also changes that were made by that
        // function

        maze[r][c] = true;
        path[r][c] = 0; // for backtracking
    }

}
