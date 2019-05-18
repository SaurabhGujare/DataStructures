import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args){
        int[] unsortedArray = new int[]{6,7,3,5,1,9,10};

        System.out.println("Unsorted Array-> "+ Arrays.toString(unsortedArray));

        System.out.println("Sorted Array-> "+ Arrays.toString(getSortedArray(unsortedArray)));


    }

    private static int[] getSortedArray(int[] unsortedArray){

        int temp = 0;

        for(int i=0;i<unsortedArray.length-1;i++){
            for(int j=1;j<unsortedArray.length-i;j++){
                if(unsortedArray[j]<unsortedArray[j-1]){
                    temp=unsortedArray[j];
                    unsortedArray[j]=unsortedArray[j-1];
                    unsortedArray[j-1]=temp;
                }
            }

        }

        return unsortedArray;

    }
}
