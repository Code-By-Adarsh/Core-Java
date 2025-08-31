import java.util.ArrayList;
class MyGeneric<T1>{
    int val;
    private T1 t1;
    public MyGeneric(int val,T1 t1){
        this.val=val;
        this.t1=t1;
    }
    public void setVal(int val){
        this.val = val;
    }
    public int getVal(){
        return val;
    }
    public void setT1(T1 t1){
        this.t1 =t1;
    }
    public T1 getT1(){
        return t1;
    }
}
public class Java_generic {
    public static void main(String[] args) {
        /*
        ArrayList<Integer> arrayList = new ArrayList<>();
        //arrayList.add("Adarsh");
        arrayList.add(55);
        arrayList.add(70);
        int a = (int) arrayList.get(0);
        System.out.println(a);
         */

        MyGeneric<String> mg = new MyGeneric<>(18,"Adarsh");
        String str = mg.getT1();
        System.out.println(str);
        int a = mg.getVal();
        System.out.println(a);
    }
}