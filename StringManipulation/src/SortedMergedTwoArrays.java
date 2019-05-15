import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortedMergedTwoArrays {
    public static void main(String[] args){
        System.out.println("\nsortTraditional:->");
        sortTraditional();
        System.out.println("\nsortModern:->");
        sortModern();

    }

    private static void sortTraditional(){

        int[] arr1={22,55,66,2,44,12};
        int[] arr2={4,23,54,20,33,11};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int[] merge = new int[arr1.length+arr2.length];

        int i=0,j=0,k=0;

        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<arr2[j]){
                merge[k++]=arr1[i++];
            }else{
                merge[k++]=arr2[j++];
            }
        }
        while(i<arr1.length){
            merge[k++]=arr1[i++];
        }

        while(j<arr2.length){
            merge[k++]=arr2[j++];
        }
        System.out.println("arr1:-> "+Arrays.toString(arr1));
        System.out.println("arr2:-> "+Arrays.toString(arr2));
        System.out.println("Output:-> "+Arrays.toString(merge));

    }

    private static void sortModern(){
        Integer[] arr1={22,55,66,2,44,12};
        Integer[] arr2={4,23,54,20,33,11};

        List<Integer> list1 = Arrays.asList(arr1);
        List<Integer> list2 = Arrays.asList(arr2);

        List<Integer> newList = new ArrayList<Integer>(list1);
        newList.addAll(list2);


        Collections.sort(newList);

        System.out.println(Arrays.toString(newList.toArray()));


    }

}
