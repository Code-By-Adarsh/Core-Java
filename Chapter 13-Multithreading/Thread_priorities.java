class thread7 extends Thread{
    public thread7(String name){
        super(name);
    }
    public void run(){
        System.out.println("Thank you "+this.getName());
    }
}
public class Thread_priorities {
    public static void main(String[] args) {
        thread7 t1 = new thread7("Roni1");
        thread7 t2 = new thread7("Roni2");
        thread7 t3 = new thread7("Roni3");
        thread7 t4 = new thread7("Roni4 (VIP)");
        thread7 t5 = new thread7("Roni5 (IMP)");
        t4.setPriority(Thread.MAX_PRIORITY);
        t5.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        System.out.println("The priority of t1 is : "+t1.getPriority());
        System.out.println("The priority of t2 is : "+t2.getPriority());
        System.out.println("The priority of t3 is : "+t3.getPriority());
        System.out.println("The priority of t4 is : "+t4.getPriority());
        System.out.println("The priority of t5 is : "+t5.getPriority());

    }
}

