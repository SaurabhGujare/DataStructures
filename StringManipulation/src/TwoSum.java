import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args){
        int[] array = {7,11,15,7,2};
        final int TARGET = 9;

        System.out.println("Array:-> ");

        for(int i=0;i<array.length;i++){
            System.out.println(i+":-> "+array[i]);
        }

        System.out.println("Output:->");

        for(int index: solution(array, TARGET)){
            System.out.print(index+" ");
        }
    }

    public static int[] solution(int[] array, int target){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0;i<array.length;i++){
            int complement = target- array[i];
            while(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(array[i],i);
        }
        return null;
    }
}
