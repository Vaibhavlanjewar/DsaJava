public class Queue_array{
    static class Queue {
        int[] arr;
        int size;
        int rear, front; // Added front for clarity, though not used in this simple implementation

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = 0; // Initialize front
        }

        // isEmpty
        public boolean isEmpty() {
            return rear == -1;
        }

        // add
        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full ");
                return; // Added return to avoid proceeding when queue is full
            }
            rear++;
            arr[rear] = data;
        }

        // remove
        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            int frontElement = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--; // Decrement rear as we remove an element
            return frontElement;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }

}