package PRO3;
public class Queue {
        private int[] elements;
        private int size;
    
        public Queue() {
            elements = new int[8];
        }
    
        public boolean empty() {
            return size == 0;
        }
    
        public int getSize() {
            return size;
        }
    
        public void enqueue(int value) {
            if (size >= elements.length) {
                int[] temp = new int[elements.length * 2];
                System.arraycopy(elements, 0, temp, 0, elements.length);
                elements = temp;
            }
            elements[size] = value;
            size++;
        }
    
        public int dequeue() {
            int[] temp = new int[elements.length - 1];
            int num = elements[0];
    
            System.arraycopy(elements, 1, temp, 0, elements.length - 1);
            elements = temp;
            size--;
            return num;
        }
    
}
