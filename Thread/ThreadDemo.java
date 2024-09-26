public class ThreadDemo {
    public static void main(String args[]) {
        Thread th = Thread.currentThread();
        System.out.println(th);

        NewThread nth = new NewThread();
        nth.start();

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            System.out.println(ex.toString());
        }
    }
}