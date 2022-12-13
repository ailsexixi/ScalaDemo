/**
 * @author 1111358@cecdat.com
 * @version 1.0.0
 */
public class ThreadTest {

    public static void main(String[] args) {
        Dog dog = new Dog();
        //dog.start(); //这里不能调用 start 方法
        //创建了 Thread 对象，把 dog 对象(实现了 Runnable )，放入了 Thread
        Thread thread = new Thread(dog);
        thread.start();
        System.out.println("jiefajbfak");
    }
}



class Dog implements Runnable { //通过实现Runnable接口来实现

    int count =  0;

    @Override
    public void run() { //普通方法
        while (true) {
            System.out.println("你好，兮动人-" + (++count) + Thread.currentThread().getName());

            //休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10) {
                break;
            }
        }
    }
}
