class cylinder{
    private int radius;
    private int height;

    public cylinder(int a,int b){
        this.radius = a;
        this.height = b;
    }
    public void setRadius(int x){
        radius = x;
    }
    public void setHeight(int y){
        height = y;
    }
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
    public int volume(){
        int ans = 22*radius*radius*height;
        return ans/7;
    }
    public int total(){
        int ans1 = 2*22*radius*(radius+height);
        return ans1/7;
    }
}
class rectangle{
    private int length;
    private int breadth;

    public rectangle(){
        length = 4;
        breadth = 5;
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
}
class sphere{
    private int r;
    private int h;

    public void setR(int x){
        r = x;
    }
    public void setH(int y){
        h = y;
    }
    public int getR(){
        return r;
    }
    public int getH(){
        return h;
    }
}
public class Practice_set_9 {
    public static void main(String[] args) {
        // 1)
        /*
        cylinder c1 = new cylinder();
        c1.setHeight(3);
        c1.setRadius(5);
        System.out.println(c1.getHeight());
        System.out.println(c1.getRadius());
         */

        // 2)
        /*
        cylinder c1 = new cylinder();
        c1.setRadius(7);
        c1.setHeight(7);
        System.out.println("Volume: "+c1.volume());
        System.out.println("Total surface area: "+c1.total());
         */

        // 3)
        /*
        cylinder c1 = new cylinder(5,4);
        System.out.println("Radius: "+c1.getRadius());
        System.out.println("Height: "+c1.getHeight());
         */

        // 4)
        /*
        rectangle r1 = new rectangle();
        System.out.println("Breadth: "+r1.getBreadth());
        System.out.println("Length: "+r1.getLength());
         */

        // 5)
        sphere s1 = new sphere();
        s1.setR(5);
        s1.setH(4);
        System.out.println("Radius: "+s1.getR());
        System.out.println("Height: "+s1.getH());

    }
}
