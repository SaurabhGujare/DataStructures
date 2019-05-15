import java.util.ArrayList;
import java.util.List;

public class DuplicateCharacters {
    public static void main(String[] args){
        String str = new String("Sakkett");
        char[] strChars = str.toCharArray();
        List<String> list = new ArrayList<String>();

        for(int i=0;i<strChars.length;i++){
            if(!list.contains(Character.toString(strChars[i]))){
                list.add(Character.toString(strChars[i]));
            }
        }
        System.out.println(list);
    }
}
