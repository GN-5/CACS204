class SyncDemo {
  public static void main(String[] args) {
    Callme target = new Callme();
    Caller ob1 = new Caller(target, "Hello");
    Caller ob2 = new Caller(target, "Synchronized");
    Caller ob3 = new Caller(target, "World");

    // starting.
    ob1.th.start();
    ob2.th.start();
    ob3.th.start();

    // waiting to end
    try {
      ob1.th.join();
      ob2.th.join();
      ob3.th.join();
    } catch (InterruptedException e) {
      System.out.println("Interrupted");
    }
  }
}