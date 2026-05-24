import java.util.LinkedList;
import java.util.Queue;

// Shared Resource
class BoundedBuffer {
    private Queue<Integer> queue = new LinkedList<>();
    private int capacity;

    public BoundedBuffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == capacity) {
            System.out.println("Buffer full. Producer waiting...");
            wait();
        }

        queue.add(value);
        System.out.println("Produced: " + value);

        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            System.out.println("Buffer empty. Consumer waiting...");
            wait();
        }

        int value = queue.poll();
        System.out.println("Consumed: " + value);

        notifyAll();
        return value;
    }
}

// Producer Thread
class Producer implements Runnable {
    private BoundedBuffer buffer;

    public Producer(BoundedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        int value = 1;
        try {
            while (true) {
                buffer.produce(value++);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

// Consumer Thread
class Consumer implements Runnable {
    private BoundedBuffer buffer;

    public Consumer(BoundedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            while (true) {
                buffer.consume();
                Thread.sleep(800);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

// Main Class
public class BoundedProducerConsumer {
    public static void main(String[] args) {
        BoundedBuffer buffer = new BoundedBuffer(5);

        Thread producer1 = new Thread(new Producer(buffer));
        Thread consumer1 = new Thread(new Consumer(buffer));

        producer1.start();
        consumer1.start();
    }
}
