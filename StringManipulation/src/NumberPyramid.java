import java.util.Scanner;

public class NumberPyramid {

    public static void main(String[] args){
        int noOfRows;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the no of rows you want!");
        noOfRows = sc.nextInt();
        System.out.println(" ");

        System.out.println("Pattern1");
        pattern1(noOfRows);

        System.out.println("\n\nPattern2");
        pattern2(noOfRows);

        System.out.println("\n\nPattern3");
        pattern3(noOfRows);

        System.out.println("\n\nPattern4");
        pattern4(noOfRows);

        System.out.println("\n\nPattern5");
        pattern5(noOfRows);


    }

    static void pattern1(int noOfRows){
        int rowCount =1;

        //iterate inversely over the row numbers
        for(int i=noOfRows;i>0;i--){

            //add spaces equal to the highest number of row(i) and decrease beginning of each row
            for(int j=0;j<i;j++){

                System.out.print(" ");

            }

            //Then print rowcount number rowcount times at the end of each row
            for(int k=0;k<rowCount;k++){

                System.out.print(rowCount+" ");

            }

            System.out.println("");

            //increment the rowcount
            rowCount++;

        }

    }

    static void pattern2(int noOfRows){
        int rowCount=1;

        for(int i=noOfRows;i>0;i--){
            //add spaces
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            //print number
            for(int j=1;j<=rowCount;j++){
                System.out.print(j+" ");
            }

            System.out.println(" ");
            rowCount++;
        }
    }

    static void pattern3(int noOfRows){
        int rowCount=1;

        for(int i=noOfRows;i>0;i--){
            //add spaces
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            //print number
            for(int j=1;j<=rowCount;j++){
                System.out.print("* ");
            }

            System.out.println(" ");
            rowCount++;
        }
    }

    static void pattern4(int noOfRows){
        int rowCount=1;

        for(int i=noOfRows;i>0;i--){
            //add spaces
            for(int j=0;j<i*2;j++){
                System.out.print(" ");
            }

            //print number
            for(int j=1;j<=rowCount;j++){
                System.out.print(j+" ");
            }

            //print number
            for(int j=rowCount-1;j>=1;j--){
                System.out.print(j+" ");
            }

            System.out.println(" ");
            rowCount++;
        }
    }

    static void pattern5(int noOfRows){
        int rowCount=noOfRows;

        for(int i=0;i<noOfRows;i++){
            //add spaces
            for(int j=0;j<i*2;j++){
                System.out.print(" ");
            }

            //print number
            for(int j=1;j<=rowCount;j++){
                System.out.print(j+" ");
            }

            //print number
            for(int j=rowCount-1;j>=1;j--){
                System.out.print(j+" ");
            }

            System.out.println(" ");
            rowCount--;
        }
    }
}
