class thread3 implements Runnable{
    public void run(){
        int i = 1;
        while (i<=5){
            System.out.println("I am thread 3.");
            i++;
        }
    }
}
class thread4 implements Runnable{
    public void run(){
        int i = 1;
        while (i<=5){
            System.out.println("I am thread 4.");
            i++;
        }
    }
}
public class Thread_using_Runnable_interface {
    public static void main(String[] args) {
        thread3 bullet1 = new thread3();
        Thread gun1 = new Thread(bullet1);
        thread4 bullet2 = new thread4();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}

