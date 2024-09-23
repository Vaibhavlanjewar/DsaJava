// class A extends Thread {
//     public void run() {

//     }
// }

// class B extends Thread {
//     public void run() {
//         for (int i = 1; i <= 100; i++) {
//             System.out.println("Thread2 :" + i);
//             try {
//                 Thread.sleep(100);
//             } catch (InterruptedException e) {

//                 e.printStackTrace();
//             }
//         }
//     }
// }

public class J50RunnablevsThread {
    public static void main(String args[]) {
        Runnable obj1 = () -> {
            for (int i = 1; i <= 100; i++) {
                System.out.println("Thread1 :" + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }
        };
        Runnable obj2 = () -> {
            for (int i = 1; i <= 100; i++) {
                System.out.println("Thread2 :" + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
