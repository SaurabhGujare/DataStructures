
import java.util.*;

class MyComp implements Comparator<Map.Entry<String,Double>>{
    public int compare(Map.Entry<String,Double> a, Map.Entry<String,Double> b){
        return a.getValue()<b.getValue()?1:-1;
    }
}
//class MyComp implements Comparator<String>{
//    public int compare(String a, String b){
//        return ;
//    }
//}

public class main {

    public static void main(String[] args){
        //
        MapSortByValues.sortMapByValues();
    }
}

