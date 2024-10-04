import java.util.*;

public class SpeedOfTrainTcs2k24 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sot = sc.nextInt();
        int Lb = 400;
        int Lt = 400;
        int d = Lb + Lt;
        if(sot>=1 && sot<=200){
            int time=d/sot;
            time=time*18/5;
            System.out.println(time);
        }
    }
}
