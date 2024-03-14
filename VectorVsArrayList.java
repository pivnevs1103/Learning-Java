/* Since ArrayList and Vectors are very similar in functionality, the purpose of this is to test
and compare them to each other and see which one is faster and more superior.
Result: ArrayList are far more superior and faster and should be used majority if not all of the times
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorVsArrayList {
    public static void main(String[] args) throws InterruptedException {

        // Number of values that are going to be added to ArrayList and Vector
        int size = 1_000_000;
        List<Integer> arrayList = new ArrayList<>();

        // Using this I will time exactly how long it will take to add a million elements
        long start = System.currentTimeMillis();

        // Adding the million items to my ArrayList
        for(int i = 0; i < size; i++){
            arrayList.add(i);
        }

        // Capturing the system time after adding a million items
        long end = System.currentTimeMillis();

        // Printing out the difference to see how long it takes
        System.out.println("Added " + size + " elements to ArrayList and it took : " +
                (end - start) + " milliseconds");

        // Now we are doing the same thing but to a Vector now
        List<Integer> vector = new Vector<>();

        start = System.currentTimeMillis();
        for(int i = 0; i < size; i++){
            vector.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Added " + size + " elements to Vector and it took : " +
                (end - start) + " milliseconds");
 /* Based on the result it can be seen that the arrayList is much faster than vector
at adding values to itself in a single thread environment. Now we are going to run
the same test except that it will be two threads trying to add elements to both vector
and ArrayList */

        // First lets do it with an ArrayList
        List<Integer> multiThreadList = new ArrayList<>();
        start = System.currentTimeMillis();

        // Thread one and two will add a million times to our ArrayList at the same time
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multiThreadList.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multiThreadList.add(i);
            }
        });
        // Starting both of the Threads and joining them together
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        end = System.currentTimeMillis();
        System.out.println("Added " + size + " elements to our ArrayList using a multithreaded way" +
                " and it took : " + (end - start) + " milliseconds");
        System.out.println("Size of the ArrayList " + multiThreadList.size());



        // Now we do the same thing but with a Vector
        List<Integer> multiThreadVector = new Vector<>();
        start = System.currentTimeMillis();

        // Thread one and two will add a million times to our ArrayList at the same time
        t1 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multiThreadVector.add(i);
            }
        });

        t2 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multiThreadVector.add(i);
            }
        });
        // Starting both of the Threads and joining them together
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        end = System.currentTimeMillis();
        System.out.println("Added " + size + " elements to our Vector using a multithreaded way" +
                " and it took : " + (end - start) + " milliseconds");
        System.out.println("Size of the Vector " + multiThreadVector.size());


        /* As can been seen by the results the Array list is still faster  but not so much, however
        sometimes you get an outOfBounce exception with the array List which is a bit concerning.
        As well as it can be seen that while the vector has 2 million items in its array the ArrayList
        does not. So while, yes the ArrayList perform its task faster, its unfortunately not getting
        all the 2 million elements that I would expect from the two threads and thats because operations
        on the ArrayList are not synchronized(not thread safe).
         */


        // By adding collections.synchronizedList and passing through the ArrayList it makes it thread safe.
        // It creates a wrapper around my arrayList and makes it automatically syncronized, however it does
        // make it slower and very similar speeds to Vector
        List<Integer> multiThreadListSafe = Collections.synchronizedList(new ArrayList<>());
        start = System.currentTimeMillis();

        // Thread one and two will add a million times to our ArrayList at the same time
        Thread st1 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multiThreadListSafe.add(i);
            }
        });

        Thread st2 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multiThreadListSafe.add(i);
            }
        });
        // Starting both of the Threads and joining them together
        st1.start();
        st2.start();
        st1.join();
        st2.join();

        end = System.currentTimeMillis();
        System.out.println("Added " + size + " elements to our ArrayList using a safe multithreaded way" +
                " and it took : " + (end - start) + " milliseconds");
        System.out.println("Size of the ArrayList " + multiThreadListSafe.size());

    }
}