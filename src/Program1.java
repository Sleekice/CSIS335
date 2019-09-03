/* Author: Peter Tiewah.
   Due Date: 09.02.2019
   Submission Date: 09.02.2019
 */
import java.util.Scanner;
public class Program1
{
    public static void main (String[]args)
    {
        //Code of Java for loop
        int num;


        Scanner sc = new Scanner (System.in);

        System.out.println ("enter how many numbers to cal  avg");

        num = sc.nextInt ();

        //for (int i = 0; i < n; i++)

        int add = 0;
        int mult = 1;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        if (num == 0)
        {

            System.out.println("No number Will be Entered");
        }
        else{
            for (int i = 0; i < num; i++) {
                System.out.printf("Enter the numbers: ");
                int b = sc.nextInt();
                if (b > largest) {
                    largest = b;
                }
                if (b < smallest) {
                    smallest = b;
                }
                add += b;
                mult *= b;
            }
                //System.out.print(i);
                //System.out.print(num);
            }
            System.out.printf("Largest: ");
            System.out.println(largest);
            System.out.printf("Smallest: ");
            System.out.println(smallest);
            System.out.printf("Sum: ");
            System.out.println(add);
            System.out.printf("Product: ");
            System.out.println(mult);

            if (num <2){
                System.out.printf("Error: Cannot get average for less than 2 numbers: ");
            }
            else {
                System.out.printf("Average: ");
                System.out.println(add / num);   // Average

            }


    }
}
