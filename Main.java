import java.util.*;

public class Main {
        public static void main(String[] args){

            int[] array = new int[50000000];
            ArrayList<Integer> arrayList = new ArrayList<>();
            Vector<Integer> vector = new Vector<>();
            Random rand = new Random();
            long arrX = System.currentTimeMillis();

            // add random numbers from 0 to 50000000 to array
            for(int x = 0; x < 50000000; x++) {
                int numRand = rand.nextInt(Integer.MAX_VALUE);
                array[x] = numRand;
            }
            long arrY = System.currentTimeMillis();
            System.out.println("Time to add elements to array: "+(arrY-arrX) + " milliseconds");
            // sort array
            long sortArrX = System.currentTimeMillis();
            Arrays.sort(array);
            long sortArrY = System.currentTimeMillis();
            System.out.println("Time to sort array: "+(sortArrY-sortArrX) + " milliseconds");

            // add random numbers from 0 to 50000000 to arraylist
            long arrListX = System.currentTimeMillis();
            for(int x = 0; x < 50000000; x++) {
                int numRand = rand.nextInt(Integer.MAX_VALUE);
                arrayList.add(numRand);
            }
            long arrListY = System.currentTimeMillis();
            System.out.println("Time to add elements to array list: "+(arrListY-arrListX) + " milliseconds");
            //sort arraylist
            long sortArrListX = System.currentTimeMillis();
            Collections.sort(arrayList);
            long sortArrListY = System.currentTimeMillis();
            System.out.println("Time to sort array list: "+(sortArrListY-sortArrListX) + " milliseconds");
            // add random numbers from 0 to 50000000 to vector
            long vecX = System.currentTimeMillis();
            for(int x = 0; x < 50000000; x++) {
                int numRand = rand.nextInt(Integer.MAX_VALUE);
                vector.add(numRand);
            }
            long vecY = System.currentTimeMillis();
            System.out.println("Time to add elements to vector: "+(vecY-vecX) + " milliseconds");

            // sort vector
            long sortVecX = System.currentTimeMillis();
            Collections.sort(vector);
            long sortVecY = System.currentTimeMillis();
            System.out.println("Time to sort vector: "+(sortVecY-sortVecX) + " milliseconds");

        }
}
