import java.util.*; //Scanner class for user input
class Prime
{
    static boolean isPrime(int n)
    {
        int i;
        if(n<2)
            return false; 
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
   public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        //sc is the object of scanner class
        System.out.println("Enter the number:");
        n = sc.nextInt();
        if(isPrime(n)) //isPrime() return true or false 
        {
            System.out.println("It is a prime number");
        }
        else
        {
            System.out.println("It is not a prime number");
        }
        sc.close();
    }
}
