public class NewThread extends Thread {
    Thread th;

    NewThread() {
        th = new Thread(this, "child Thread");
        System.out.println("New Thread: " + th);
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Child Thread" + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException ex) {
            System.out.println(ex.toString());
        }
    }

}
