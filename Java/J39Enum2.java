
enum Status {
    Running, Failed, Pending, Success;
}

public class J39Enum2 {
    public static void main(String[] args) {
        Status s = Status.Pending;

        System.out.println(s.getClass().getSuperclass());
        // class java.lang.Enum
        switch (s) {
            case Running:
                System.out.println("All good");
                break;
            case Failed:
                System.out.println("Try again");
                break;
            case Pending:
                System.out.println("please wait");
                break;
            default:
                System.out.println("Done");
        }

        if (s == Status.Running) {
            System.out.println("All good");
        } else if (s == Status.Pending) {
            System.out.println("Try again");
        } else {
            System.out.println("Done");
        }
        // Try again

    }
}
