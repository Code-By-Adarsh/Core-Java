class thread8 extends Thread{
    public void run(){
        int i = 1;
        while (i<=5){
            System.out.println("I am thread8.");
            //3)interrupt() method:
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
class thread9 extends Thread{
    public void run(){
        int i = 1;
        while (i<=5){
            System.out.println("I am thread9.");
            i++;
        }
    }
}
public class Thread_methods {
    public static void main(String[] args) {
        thread8 t1 = new thread8();
        thread9 t2 = new thread9();
        //1)start() method:
        t1.start();

        //2)join() method:
//        try{
//            t1.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        t2.start();
    }
}

