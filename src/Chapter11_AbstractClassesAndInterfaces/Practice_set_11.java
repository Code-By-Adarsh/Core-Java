package Chapter11_AbstractClassesAndInterfaces;

abstract class Pen{
    abstract void write();
    abstract void refill();
}
class Pen1 extends Pen{
    public void write(){
        System.out.println("Writing.....");
    }
    public void refill(){
        System.out.println("Refilling.....");
    }
}
class FountainPen extends Pen{
    public void write(){
        System.out.println("Writing.....");
    }
    public void refill(){
        System.out.println("Refilling.....");
    }
    public void changeNib(){
        System.out.println("Changing.....");
    }
}
interface BaiscAnimal{
    void eat();
    void sleep();
}
class Monkey{
    public void jump(){
        System.out.println("Jumping.....");
    }
    public void bite(){
        System.out.println("Biting.....");
    }
}
class Human extends Monkey implements BaiscAnimal{
        @Override
        public void eat(){
            System.out.println("Eating.....");
        }
        @Override
        public void sleep(){
            System.out.println("Sleeping");
        }
}
abstract class telephone{
   abstract void ring();
}
class smartphone extends telephone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void takephoto(){
        System.out.println("click.....");
    }
}
//6)
interface tvremote{
    void changechannel();
    void stop();
}
interface smartRemote extends tvremote{
    void sense();
    void run();
}
class tv implements tvremote{
    public void changechannel(){
        System.out.println("Changing.....");
    }
    public void stop(){
        System.out.println("Stopped....");
    }
}
public class Practice_set_11 {
    public static void main(String[] args) {
        //1)
        /*
        Chapter11_AbstractClassesAndInterfaces.Pen1 p = new Chapter11_AbstractClassesAndInterfaces.Pen1();
        p.refill();
        p.write();
         */

        //2)
        /*
        Chapter11_AbstractClassesAndInterfaces.FountainPen f = new Chapter11_AbstractClassesAndInterfaces.FountainPen();
        f.changeNib();
        f.refill();
        f.write();
         */

        //3)
        /*
        Chapter11_AbstractClassesAndInterfaces.Human h = new Chapter11_AbstractClassesAndInterfaces.Human();
        h.eat();
        h.bite();
        h.sleep();
        h.jump();
         */

        //4)
        /*
        Chapter11_AbstractClassesAndInterfaces.telephone t = new Chapter10_Inheritence.Chapter11_AbstractClassesAndInterfaces.smartphone();
        t.ring();
        //t.takephoto();---->Not allowed.
         */

        //5)
        /*
        Chapter11_AbstractClassesAndInterfaces.Monkey m = new Chapter11_AbstractClassesAndInterfaces.Human();
        m.bite();
        m.jump();
         */

        //6)
        //above

        //7)
        tv t = new tv();
        t.changechannel();
        t.stop();
    }
}

