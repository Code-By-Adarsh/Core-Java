class thread5 extends Thread{
    public thread5(String name){
        super(name);
    }
    public void run(){
        int i = 1;
        while (i<=3){
            System.out.println("I am thread5.");
            i++;
        }
    }
}
class thread6 implements Runnable{
    public thread6(String name){
        super();
    }
    public void run(){
        int i = 1;
        while (i<=3){
            System.out.println("I am thread6.");
            i++;
        }
    }
}
public class Thread_consructor {
    public static void main(String[] args) {
        thread5 t1 = new thread5("Adarsh");
        thread5 t2 = new thread5("Roni");
        t1.start();
        t2.start();
        System.out.println("The ID of thread5 is : "+t1.getId());
        System.out.println("The name of thread5 is : "+t1.getName());
        System.out.println("The class of thread5 is : "+t1.getClass());
        System.out.println("The ID of thread5 is : "+t2.getId());
        System.out.println("The name of thread5 is : "+t2.getName());
        System.out.println("The class of thread5 is : "+t2.getClass());


        System.out.println("\n\nExample of constructor using Runnable interface:");
        thread6 t3 = new thread6("Ayush");
        Thread t = new Thread(t3);
        t.start();
        System.out.println("The ID of thread6 is : "+t.getId());
        System.out.println("The name of thread6 is : "+t.getName());
        System.out.println("The class of thread6 is : "+t.getClass());
    }
}
