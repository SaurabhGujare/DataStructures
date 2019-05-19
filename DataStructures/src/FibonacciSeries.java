import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit = scan.nextInt();
        System.out.println();
        iterativeMethod(limit);
        System.out.println("\n\n");
        System.out.print(f+","+s);
        recursiveMethod(limit-2);
    }

    private static void iterativeMethod(int N){
        int f=0, s=1, count=2, sum;

        System.out.print(f+", ");

        while(count<N){
            sum = f+s;
            f=s;
            s=sum;
            System.out.print(", "+sum);
            count++;
        }
    }


    static int sum=0, f=0, s=1;

    private static void recursiveMethod(int N){
        if(N>0){
            sum = f+s;
            f=s;
            s=sum;
            System.out.print(", "+sum);
            recursiveMethod(N-1);

        }


    }
}
