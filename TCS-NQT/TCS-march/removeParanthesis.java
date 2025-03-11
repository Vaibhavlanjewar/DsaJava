

public class removeParanthesis {

    public static String removep(String s) {
        StringBuilder sb = new StringBuilder();

        int cnt = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (cnt > 0)
                    sb.append(ch);

                 cnt++;   
            } else if (ch == ')') {
                cnt--;
               if(cnt>0) sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String args[]) {
        String s = "(()())(())";
        System.out.println(removep(s));
    }
}
