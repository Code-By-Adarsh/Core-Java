class thread10 extends Thread{
    public void run(){
        while (true){
            System.out.println("Good morning");
        }
    }
}
class thread11 extends Thread{
    public void run(){
        while (true){
            try{
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }

            System.out.println("Welcome");
        }
    }
}
class thread12 extends Thread{
    public void run(){
        System.out.println("I am thread12.");
    }
}
class thread13 extends Thread{
    public void run(){
        System.out.println("I am thread13.");
    }
}
public class Practice_set_13 {
    public static void main(String[] args) {
        //1)
        /*
        thread10 t1 = new thread10();
        thread11 t2 = new thread11();
        t1.start();
        t2.start();
         */

        //2)
        /*
        thread10 t1 = new thread10();
        thread11 t2 = new thread11();
        t1.start();
        t2.start();
         */

        //3)
        /*
        thread12 t1 = new thread12();
        thread12 t2 = new thread12();
        t1.start();
        t2.start();
        //t1.setPriority(20);
        System.out.println("The priority of t1 is : "+t1.getPriority());
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println("The priority of t2 is : "+t2.getPriority());
         */

        //4)
        /*
        thread13 t1 = new thread13();
        t1.start();
        System.out.println("The state of t1 is : "+t1.getState());
         */

        //5)
        thread13 t1 = new thread13();
        t1.start();
        System.out.println("The refference of current thread is : "+Thread.currentThread().getState());

    }
}

