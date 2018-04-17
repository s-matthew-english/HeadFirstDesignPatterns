class Geek implements Runnable {
  public void run() {
    Lock();
  }

  public void Lock() {
    System.out.println(Thread.currentThread().getName());
    synchronized(this) {
      System.out.println("in block " + Thread.currentThread().getName());
      System.out.println("in block " + Thread.currentThread().getName() + " end");
    }
  }

  public static void main(String[] args) {
    Geek g0 = new Geek();
    Thread t1 = new Thread(g0);
    Thread t2 = new Thread(g0);
    Geek g6 = new Geek();
    Thread t3 = new Thread(g6);
    t1.setName("t1");
    t2.setName("t2");
    t3.setName("t3");
    t1.start();
    t2.start();
    t3.start();
  }
}
