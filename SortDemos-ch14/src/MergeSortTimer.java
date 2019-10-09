import java.util.Scanner;

/**
   This program measures how long it takes to sort an
   array of a user-specified size with the merge
   sort algorithm.
 */
public class MergeSortTimer
{  
    public static void main(String[] args)
    {  
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = in.nextInt();

        // Construct random array

        for(int i = 0 ; i<= 9; i++)
        {
        int[] a = ArrayUtil.randomIntArray(n*i, 10000);

        // Use stopwatch to time merge sort

        StopWatch timer = new StopWatch();

        timer.start();
        MergeSorter.sort(a);
        timer.stop();

        System.out.println("Elapsed time: " 
                + timer.getElapsedTime() + " milliseconds");
        }
    }
}


