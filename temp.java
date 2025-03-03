import java.util.*;

public class temp {

    static void square(int num)
    {
        num=num*num;
        System.out.println("square="+num);
    }
    
   static void cube(int num)
    {
        System.out.println("cube="+num*num*num);
    }

    static void factorial(int num)
    {
        int fact=1;
        for(int i=1; i<=num; i++)
        {
            fact=i*fact;
        }
        System.out.println("factor of given number="+fact);
    }

    static void factors(int num)
    {
        for(int i=1; i<=num; i++)
        {
            if(num%i==0)
            {
                System.out.println(i);
            }
        
        }
    }

   static void odd_even(int num)
    {
        if(num%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        while(true)
        {
            System.out.println("1:square ");
            System.out.println("2:cube ");
            System.out.println("3:factorial ");
            System.out.println("4:factors ");
            System.out.println("5:odd/even ");
            System.out.println("6:exit");
            System.out.print("Enter your choice: ");
            int ch=sc.nextInt();
            switch(ch)
            {
               case 1:
                        square(num);
                        break;

                case 2:
                        cube(num);
                        break;

                case 3:
                        factorial(num);
                        break;

                case 4:
                        factors(num);
                        break;

                case 5:
                        odd_even(num);
                        break;

                
               

                case 6:
                        // System.exit(1);
                        break;
            }
        }

       
    }

}
