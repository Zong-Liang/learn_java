package learnjava_09;

//交替打印100
public class AlternatePrintNumber {
    public static void main(String[] args) {
        PrintNumber pn = new PrintNumber();

        Thread t1 = new Thread(pn, "线程1");
        Thread t2 = new Thread(pn, "线程2");

        t1.start();
        t2.start();

    }
}


class PrintNumber implements Runnable {
    private int number = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                notify(); //唤醒被wait()的线程

                if (number < 101) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println(Thread.currentThread().getName() + "：" + number);
                    number++;

                    try {
                        wait(); //线程一旦执行此方法，就进入等待状态，同时释放同步监视器的调用
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    break;
                }
            }
        }
    }
}
