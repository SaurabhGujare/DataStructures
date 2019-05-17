import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FirstNPrimeNumbers {

    public static void main(String[] args){
        final int LIMIT=10;
        int count=0, num=2, status=1;
        List<Integer> primeNumbers = new ArrayList<>();


        while(count<LIMIT){
            for(int i=2;i<num/2;i++){
                if(num%i==0){
                    status=0;
                    break;
                }
            }
            if(status!=0){
                primeNumbers.addAll(Collections.singleton(num));
                count+=1;
            }
            num+=1;
            status=1;

        }
        System.out.println(primeNumbers);

    }

    public static void internetCode()
    {
        int n;
        int status = 1;
        int num = 3;
        //For capturing the value of n
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        //The entered value is stored in the var n
        n = scanner.nextInt();
        if (n >= 1)
        {
            System.out.println("First "+n+" prime numbers are:");
            //2 is a known prime number
            System.out.println(2);
        }

        for ( int i = 2 ; i <=n ;  )
        {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
            {
                if ( num%j == 0 )
                {
                    status = 0;
                    break;
                }
            }
            if ( status != 0 )
            {
                System.out.println(num);
                i++;
            }
            status = 1;
            num++;
        }
    }
}
