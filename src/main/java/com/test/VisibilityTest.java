package com.test;

public class VisibilityTest {

    // Try running this with and without the 'volatile' keyword
    private static  boolean stopRequested = false;

    public static void main(String[] args) throws InterruptedException {

        Thread workerThread = new Thread(() -> {
            int i = 0;
            while (!stopRequested) {
                i++;
                // Without volatile, this loop might never end because
                // the thread caches 'stopRequested' as false.
            }
            System.out.println("Worker thread stopped at count: " + i);
        });

        workerThread.start();

        // Let the worker thread run for a second
        Thread.sleep(1000);

        System.out.println("Main thread requesting stop...");
        stopRequested = true; // Update the shared flag

        System.out.println("Main thread finished.");
    }
}
