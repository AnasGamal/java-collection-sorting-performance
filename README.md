# Java Performance Comparison: Array, ArrayList, and Vector

This Java program compares the performance of sorting an array, an ArrayList, and a Vector. It generates 50 million random numbers and adds them to each data structure, then sorts them using the `Arrays.sort()` and `Collections.sort()` methods. The time taken for each operation is measured using `System.currentTimeMillis()`.

## How to Use

1. Clone the repository to your local machine.
2. Navigate to the directory containing the `Main.java` file.
3. Compile the program using the following command: 

    ```
    javac Main.java
    ```
    
4. Run the program using the following command:

    ```
    java Main
    ```
    
5. The program will output the time taken to add elements and sort each data structure.

## Results

On my machine, the program produced the following results:

Time to add elements to array: 765 milliseconds
Time to sort array: 5715 milliseconds
Time to add elements to array list: 2298 milliseconds
Time to sort array list: 35913 milliseconds
Time to add elements to vector: 3158 milliseconds
Time to sort vector: 34966 milliseconds

As expected, adding elements to an array is the fastest, followed by a vector, and then an ArrayList. Sorting an array is also the fastest, followed by a vector, and then an ArrayList. The difference in speed is more pronounced when adding elements than when sorting, but in both cases, the ArrayList is significantly slower than the other data structures.

## Conclusion

This program demonstrates the performance differences between an array, an ArrayList, and a Vector in Java. If you need to perform many add and remove operations, the ArrayList and Vector may be useful, but if you need to perform many iterations or sorting operations, an array is generally faster.
