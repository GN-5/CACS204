class Caller implements Runnable {
    String msg;
    Callme target;
    Thread th;

    public Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        th = new Thread(this);
    }

    public void run() {
        target.call(msg);
    }
}