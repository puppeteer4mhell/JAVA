import java.util.*; //Scanner class for user input
class Palindrome
{
    boolean isPalindrome(int n)
    {
        int rem, rev=0, temp;
        temp=n;
        while(n!=0)
        {
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
       if(rev==temp)
            return true;
        else
            return false;
    }
   public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        //sc is the object of scanner class
        System.out.println("Enter the number:");
        n = sc.nextInt();
        Palindrome o=new Palindrome();
        if(o.isPalindrome(n)) 
        {
            System.out.println("It is a palindrome number");
        }
        else
        {
            System.out.println("It is not a palindrome number");
        }
        sc.close();
    }
}