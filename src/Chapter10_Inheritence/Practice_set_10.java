package Chapter10_Inheritence;

/*
class circle{
    public int radius;
    public circle(){
        System.out.println("");
    }
    public circle(int r){
        radius = r;
        System.out.println("The radius of circle is : "+radius);
    }
}
class Chapter9_AccessModifiersAndConstructor.cylinder extends circle{
    public int height;
    public Chapter9_AccessModifiersAndConstructor.cylinder(int cr, int h){
        //super(cr);
        radius = cr;
        height = h;
        System.out.println("The radius of Chapter9_AccessModifiersAndConstructor.cylinder is : "+radius);
        System.out.println("The height of Chapter9_AccessModifiersAndConstructor.cylinder is : "+height);
    }
}
*/
/*
class Chapter9_AccessModifiersAndConstructor.rectangle{
    public int length;
    public int breadth;
    public Chapter9_AccessModifiersAndConstructor.rectangle(int a,int b){
        length = a;
        breadth = b;
    }
    public void showArea(){
        int area = length*breadth;
        System.out.printf("The area of length %d and breadth %d of Chapter9_AccessModifiersAndConstructor.rectangle is : %d",length,breadth,area);
    }
}
class cuboid extends Chapter9_AccessModifiersAndConstructor.rectangle{
    public int height;
    public cuboid(int a,int b,int c){
        super(a,b);
        height = c;
    }
    public void showArea(){
        int area1 = length*breadth*height;
        System.out.printf("The area of length %d , breadth %d and height %d of cuboid is : %d",length,breadth,height,area1);
    }
}
 */
public class Practice_set_10 {
    public static void main(String[] args) {
        // 1)
        //circle c1 = new circle(10);
        //Chapter9_AccessModifiersAndConstructor.cylinder c2 = new Chapter9_AccessModifiersAndConstructor.cylinder(20,30);

        // 2)
        /*
        Chapter9_AccessModifiersAndConstructor.rectangle r = new Chapter9_AccessModifiersAndConstructor.rectangle(10,20);
        r.showArea();
        System.out.println(" ");
        cuboid c = new cuboid(2,3,4);
        c.showArea();
         */

        // 3)
        //create a method for area and volume in problem 1.


        // 4)
        //create a method for area and volume in problem 2 and also defined getters and setters.
    }
}
