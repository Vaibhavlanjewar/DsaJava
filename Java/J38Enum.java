enum Status {
    Running, Failed, Pending, Success;
}

public class J38Enum {
    public static void main(String args[]) {
        int i = 5;
        Status s = Status.Running;
        System.out.println(s); // Running
        System.out.println(s.ordinal()); // 0 rth

        Status s1 = Status.Success;
        // System.out.println(s1); //Success

        Status[] s2 = Status.values(); // its an arr
        // System.out.println(s2[3]);

        for (Status a : s2) {
            System.out.println(a + " : " + a.ordinal());
        }
        /*
         * Running
         * 0
         * Running : 0
         * Failed : 1
         * Pending : 2
         * Success : 3
         */

    }

}
