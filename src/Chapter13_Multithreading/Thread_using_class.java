package Chapter13_Multithreading;

class thread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<10){
            System.out.println("I am Chapter13_Multithreading.thread1.");
            System.out.println("I am happy.");
            i++;
        }
    }
}
class thread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<10){
            System.out.println("I am Chapter13_Multithreading.thread2.");
            System.out.println("I am sad.");
            i++;
        }
    }
}
public class Thread_using_class {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start();
        t2.start();

    }
}

