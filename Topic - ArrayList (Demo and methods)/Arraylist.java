import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(3);

        l2.add(04);
        l2.add(05);
        l2.add(06);
        l2.add(07);
        //---------------------->add method:
        l1.add(51);
        l1.add(52);
        l1.add(53);
        l1.add(54);
        l1.add(55);
        //------------------>add with index method:
        l1.add(0,56);
        //----------------------->addAll method:
        l1.addAll(l2);
        //------------------>with index:
        //l1.addAll(0,l2);

        //---------------->clear method:
        //l1.clear();

        //------------------>contains method:
        System.out.println("Is 52 present in l1: "+l1.contains(52));

        //----------------->indexof method:
        System.out.println("The value 5 present at index in l1 is : "+l1.indexOf(5));
        //lastindexof method.

        //---------------->set method:
        l1.set(2,500);

        //------------------->remove method:
        l1.remove(3);

        /*
        for (int i=0; i<l1.size();i++){
            //---------------->get method:
            System.out.println(l1.get(i));
        }
         */
    }
}
