import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        //Constructor details:
        //HashSet():
        //Constructs a new, empty set; the backing HashMap instance has default initial capacity (16) and load factor
        //(0.75).
        HashSet<Integer> h1 = new HashSet<>();
        h1.add(10);
        h1.add(20);
        h1.add(30);
        System.out.println(h1);

        //HashSet(int initialCapacity):
        //Constructs a new, empty set; the backing HashMap instance has the specified initial capacity and default load
        //factor (0.75).

        //HashSet(int initialCapacity, float loadFactor):
        //Constructs a new, empty set; the backing HashMap instance has the specified initial capacity and the specified
        //load factor.

        //HashSet(Collection<? extends E> c):
        //Constructs a new set containing the elements in the specified collection.

        //Methods details:

        //iterator():
        //Returns an iterator over the elements in this set. The elements are returned in no particular order.
        /*
        Iterator<Integer> i1 = h1.iterator();
        while (i1.hasNext()){
            Integer i2 = i1.next();
            System.out.println(i2);
        }
         */

        //size()-public int size():
        //Returns the number of elements in this set (its cardinality).
        //System.out.println(h1.size());

        //isEmpty-public boolean isEmpty():
        //Returns true if this set contains no elements.
        //System.out.println(h1.isEmpty());

        //contains()-public boolean contains(Object o):
        //Returns true if this set contains the specified element. More formally, returns true if and only if this set
        //contains an element e such that Objects.equals(o, e).
        //System.out.println(h1.contains(50));

        //add()-public boolean add(E e):
        //Adds the specified element to this set if it is not already present. More formally, adds the specified element
        //e to this set if this set contains no element e2 such that Objects.equals(e, e2). If this set already
        //contains the element, the call leaves the set unchanged and returns false.
        System.out.println(h1.add(40));
        //System.out.println(h1);
        //System.out.println(h1.add(40));

        //remove()-public boolean remove(Object o)
        //Removes the specified element from this set if it is present. More formally, removes an element e such that
        //Objects.equals(o, e), if this set contains such an element. Returns true if this set contained the element
        //(or equivalently, if this set changed as a result of the call). (This set will not contain the element once
        //the call returns.)
        System.out.println(h1.remove(50));

        //clear()-public void clear():
        //Removes all of the elements from this set. The set will be empty after this call returns.
        //h1.clear();

        //clone()-public Object clone():
        //Returns a shallow copy of this HashSet instance: the elements themselves are not cloned.

        //spliterator()-public Spliterator<E> spliterator():
        //Creates a late-binding and fail-fast Spliterator over the elements in this set.
        //The Spliterator reports Spliterator.SIZED and Spliterator.DISTINCT. Overriding implementations should document
        //the reporting of additional characteristic values.
        System.out.println(h1);

        //toArray():

        //newHashSet():

    }
}
