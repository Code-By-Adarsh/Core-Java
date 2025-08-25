import java.util.ArrayDeque;
import java.util.ArrayList;

public class Array_deque {
    public static void main(String[] args) {
        //constructor details:
        //ArrayDeque():
        ArrayDeque<Integer> a1 = new ArrayDeque<>(); //with an initial capacity to hold sufficient 16 elements.
        a1.add(501);
        a1.add(502);
        a1.add(503);
        //ArrayDeque(int numElement):
        //ArrayDeque<Integer> a2 = new ArrayDeque<>(30); with an initial capacity to hold sufficient 30 elements.
        //ArrayDeque(Collection<? extends E> c):
        //here c is from anything like arraylist,linkedlist,hashset but with same datatype.
        ArrayDeque<Integer> a3 = new ArrayDeque<>(a1);
        a3.add(601);
        a3.add(602);
        a3.add(603);


        //method details:
        //addFirst:
        //Inserts the specified element at the front of this deque.
        a3.addFirst(600);

        //addLast:
        //Inserts the specified element at the end of this deque and this method is equivalent to add(E).
        a3.addLast(604);

        //addAll:
        //Adds all the elements in the specified collection at the end of this deque, as if by calling addLast(E) on
        // each one, in the order that they are returned by the collection's iterator.
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(700);
        a3.addAll(l1);

        //offerFirst:
        //Inserts the specified element at the front of this deque.
        boolean b = a3.offerFirst(400);
        //System.out.println(b);  -->true


        //key differences(addFirst vs offerFirst):
        /*
        Agar element add ho gaya ✅ → kuch return nahi karta (void).
        Agar space nahi hai to element add karne ke time Exception (IllegalStateException) throw karega ❌.
        Strict method hai → ya to add hoga ya exception.

        Agar element add ho gaya ✅ → true return karega.
        Agar space nahi hai ❌ → false return karega (exception nahi throw karega).
        Safe method hai.
         */

        //offerLast:
        //Inserts the specified element at the end of this deque.
        boolean b1 = a3.offerLast(701);

        //removeFirst:
        //Retrieves and removes the first element of this deque. This method differs from pollFirst only in that it
        //throws an exception if this deque is empty.
        a3.removeFirst();

        //removeLast:
        //Retrieves and removes the last element of this deque. This method differs from pollLast only in that it
        //throws an exception if this deque is empty.
        a3.removeLast();

        //pollFirst:
        //Retrieves and removes the first element of this deque, or returns null if this deque is empty.
        a3.pollFirst();

        //pollLast:
        //Retrieves and removes the last element of this deque, or returns null if this deque is empty.
        a3.pollLast();

        //getFirst:
        //Retrieves, but does not remove, the first element of this deque. This method differs from peekFirst only in
        //that it throws an exception if this deque is empty.
        //System.out.println(a3.getFirst());

        //getLast:
        //Retrieves, but does not remove, the last element of this deque. This method differs from peekLast only in
        //that it throws an exception if this deque is empty.
        //System.out.println(a3.getLast());

        //peekFirst:
        //Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.
        //System.out.println(a3.peekFirst());

        //peekLast:
        //Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty.
        //System.out.println(a3.peekLast());

        //removeFirstOccurrence:
        //Removes the first occurrence of the specified element in this deque (when traversing the deque from head to
        //tail). If the deque does not contain the element, it is unchanged. More formally, removes the first element
        //such that o.equals(e) (if such an element exists). Returns true if this deque contained the specified
        //element (or equivalently, if this deque changed as a result of the call).
        a3.add(601);
        //boolean b2 = a3.removeFirstOccurrence(601);
        //System.out.println(b2);

        //removeLastOccurrence:
        //Removes the last occurrence of the specified element in this deque (when traversing the deque from head to
        //tail). If the deque does not contain the element, it is unchanged. More formally, removes the last element
        //such that o.equals(e) (if such an element exists). Returns true if this deque contained the specified
        //element (or equivalently, if this deque changed as a result of the call).
        //boolean b3 = a3.removeLastOccurrence(601);
        //System.out.println(b3);

        //add:
        //Inserts the specified element at the end of this deque.
        //This method is equivalent to addLast(E).
        a3.add(700);

        //offer:
        //Inserts the specified element at the end of this deque.
        //This method is equivalent to offerLast(E).
        a3.offer(701);

        //remove:
        //Retrieves and removes the head of the queue represented by this deque. This method differs from poll() only
        //in that it throws an exception if this deque is empty.
        //This method is equivalent to removeFirst().
        a3.remove();

        //poll:
        //Retrieves and removes the head of the queue represented by this deque (in other words, the first element of
        //this deque), or returns null if this deque is empty.
        //This method is equivalent to pollFirst().
        a3.pollFirst();

        //element:
        //Retrieves, but does not remove, the head of the queue represented by this deque. This method differs from
        //peek only in that it throws an exception if this deque is empty.
        //This method is equivalent to getFirst().
        a3.element();

        //peek:
        //Retrieves, but does not remove, the head of the queue represented by this deque, or returns null if this
        //deque is empty.
        //This method is equivalent to peekFirst().
        a3.peek();

        //push:
        //Pushes an element onto the stack represented by this deque. In other words, inserts the element at the
        //front of this deque.
        //This method is equivalent to addFirst(E).
        a3.push(100);

        //pop:
        //Pops an element from the stack represented by this deque. In other words, removes and returns the first
        //element of this deque.
        //This method is equivalent to removeFirst().
        a3.pop();

        //size:
        //Returns the number of elements in this deque.
        a3.size();

        //isEmpty:
        //Returns true if this deque contains no elements.
        a3.isEmpty();
        System.out.println(a3);
    }
}