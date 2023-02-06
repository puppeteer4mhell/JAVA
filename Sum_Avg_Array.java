//Write a program to find the sum and average of array elements in Java
import java.util.Scanner;
public class Sum_Avg_Array 
{
    public static void main(String[] args)
    {
        int n, sum=0, i;
        double avg;
        int arr[]=new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements you want to enter: ");
        n=sc.nextInt();
        System.out.println("Enter elements in the array: ");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        avg=(double)sum/n;
        System.out.println("Sum of elements in array: "+sum);
        System.out.println("Avg of elements in array: "+avg);
        sc.close();
    }
}