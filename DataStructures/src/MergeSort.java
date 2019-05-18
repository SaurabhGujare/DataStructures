import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] unsortedArray = new int[]{6,7,3,5,1,9,10};

        System.out.println("Unsorted Array-> "+ Arrays.toString(unsortedArray));
        mergesort(unsortedArray,0,unsortedArray.length-1);
        System.out.println("Sorted Array-> "+ Arrays.toString(unsortedArray));
    }

    public static void mergesort(int[] list, int lowIndex, int highIndex){
        //base condition
        if(lowIndex==highIndex)return;

        if(lowIndex<highIndex){
         //get the mid index to part the list equally
         int midIndex = (lowIndex+highIndex)/2;
         System.out.println(midIndex);

         //create a left list and sort
         mergesort(list,lowIndex,midIndex );

         //create a right list and sort
         mergesort(list,midIndex+1,highIndex);

         //Merge both the sorted list into ine sorted list
         merge(list,lowIndex,midIndex,highIndex);

        }

    }

    public static void  merge(int[] list, int lowIndex, int midIndex, int highIndex){

        //Find sizes of two sub-arrays to be merged
        int n1 = midIndex-lowIndex+1;
        int n2 = highIndex-midIndex;

        //Create a temp arrays
        int[] left = new int[n1];
        int[] right = new int[n2];

        //Copy data to temp arrays
        for(int i=0;i<n1;i++)
            left[i]=list[lowIndex+i];
        for(int j=0;j<n2;j++)
            right[j]=list[midIndex+1+j];

        //start comparing and merging
        int k=0, i=0, j=0;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                list[k]=left[i];
                i=i+1;
            }else{
                list[k]=right[j];
                j=j+1;
            }
            k=k+1;
        }
        if(i<n1){
            list[k]=left[i];
            k=k+1;
            i=i+1;
        }
        if(j<n2){
            list[k]=left[j];
            k=k+1;
            j=j+1;
        }
    }
}
