class SharedQueue {
    private boolean available = false;

    synchronized void produce() {
        try {
            while (available) {
                wait();
            }
            System.out.println("Producing item...");
            available = true;
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void consume() {
        try {
            while (!available) {
                wait();
            }
            System.out.println("Consuming item...");
            available = false;
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadCommunicationExample {
    public static void main(String[] args) {
        SharedQueue queue = new SharedQueue();

        Thread producer = new Thread(queue::produce);
        Thread consumer = new Thread(queue::consume);

        producer.start();
        consumer.start();
    }
}

