public class BackgroundJob {
    public static void main(String[] args) {
        // Runnable task
        Runnable backgroundTask = () -> {
            System.out.println("Background job started...");
            try {
                Thread.sleep(2000); // simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("✅ Background job completed!");
        };

        // Running the task in a separate thread
        Thread thread = new Thread(backgroundTask);
        thread.start();

        System.out.println("Main thread is free to do other work...");
    }
}
