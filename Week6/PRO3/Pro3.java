package PRO3;
public class Pro3 {
    public static void main(String[] args) {
        
        Queue queue = new Queue();

        for (int i = 0; i < 20; i++) {
            queue.enqueue(i + 1);
        }

        int queueSize = queue.getSize();

        for (int i = 0; i < queueSize; i++) {
            System.out.printf("%d \n", queue.dequeue());
        }
    }
}
