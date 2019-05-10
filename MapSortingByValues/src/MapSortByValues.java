import java.util.*;

public class MapSortByValues {
    public static void sortMapByValues(){
         Map<String, Double> treeMap = new TreeMap<String, Double>();

        treeMap.put("Vaishali",11223.32);
        treeMap.put("Akshay",43.23);
        treeMap.put("Shubham",67.54);
        treeMap.put("Payal",99.99);

        //Get the set of the entries
        Set<Map.Entry<String,Double>> treeSet = treeMap.entrySet();

        //Iterate that set for display
        //Using Iterator

        //Get Iterator object
        Iterator it = treeSet.iterator();

        //Loop it through
        System.out.println("Display the Map using Iterator");
        while(it.hasNext()){
            System.out.println(it.next());
        }

        treeMap.put("Akshay", treeMap.get("Akshay")+1000);


        //Using For each
        System.out.println("\n\nDisplay the Map using For Each");
        for(Map.Entry<String, Double> entry: treeSet){
            System.out.println(entry.getKey()+":= "+entry.getValue());
        }

        //*****************************************************************************

        //sort map by its values

        //Step1: Convert Entry Set into list
        ArrayList<Map.Entry<String, Double>> list = new ArrayList<Map.Entry<String, Double>>(treeMap.entrySet());

        //Step2: Use sort method to sort
        list.sort(new MyComp());
        System.out.println("\n\nSorted List Is:->\n"+list);

        //create a new LinkedHashMap and store Sorted set elements in it
        Map<String, Double> sortedMap = new LinkedHashMap<String, Double>();
        for(Map.Entry<String, Double> entry: list){
            sortedMap.put(entry.getKey(),entry.getValue());
        }

        System.out.println("\n\nSorted Map Is:->\n"+sortedMap);

    }

}
