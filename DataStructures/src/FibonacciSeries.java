import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit = scan.nextInt();
        iterativeMethod(limit);


    }

    private static void iterativeMethod(int N){
        int f=0, s=1, count=2, sum;

        System.out.println(f);
        System.out.println(s);

        while(count<N){
            sum = f+s;
            f=s;
            s=sum;
            System.out.println(sum);
            count++;
        }
    }

    private static void recursiveMethod(){
        
    }
}
