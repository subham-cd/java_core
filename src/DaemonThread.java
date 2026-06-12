public class DaemonThread extends Thread{
    private int limit;

    public DaemonThread(int limit,String name){
        super(name);
        this.limit = limit;
    }
    @Override
    public void run(){
        String name = Thread.currentThread().getName();
        for (int c = 1; c <= limit; c++) {
            System.out.println(name + ":"+c);

        }
    }

    public static void main(String[] args) {
        DaemonThread d1 = new DaemonThread(25,"first");
        DaemonThread d2 = new DaemonThread(50,"second");
        DaemonThread d3 = new DaemonThread(100,"third");
        DaemonThread d4 = new DaemonThread(500000,"Daemon");
        d4.setDaemon(true);

        d1.start();
        d2.start();
        d3.start();
        d4.start();

    }
}
