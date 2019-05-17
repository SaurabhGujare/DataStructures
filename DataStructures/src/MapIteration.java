import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteration {
    public static void main(String[] args){
        HashMap<Integer, String> hashMap = new HashMap<Integer,String>();

        System.out.println("\nUsing while loop");
        hashMap.put(1,"Saurabh");
        hashMap.put(2,"Gaurao");
        hashMap.put(3,"Shubham");
        hashMap.put(4,"Ninad");
        Iterator it = hashMap.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println("Key:= "+entry.getKey()+", Value:="+entry.getValue());
        }

        System.out.println("\nUsing for loop");
        for(Map.Entry entry: hashMap.entrySet()){
            System.out.println("Key:= "+entry.getKey()+", Value:="+entry.getValue());
        }


    }
}
