public class Thredder {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                public void run() {
                    try {
                        Thread.sleep(1000);
                        System.out.println("Thread " + Thread.currentThread().getName() + " is done");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        System.out.println("Program ended!");
    }
}
