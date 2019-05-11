public class RemoveWhiteSpaces {

    public static void main(String[] args){
        String str  = "   dsfdf     ";

        System.out.println("Input String: |"+str+"|");
        System.out.println("Output1: |"+str.trim()+"|");
        System.out.println("Output2: |"+method1(str)+"|");
    }

    static StringBuffer method1(String str){
        StringBuffer outputStr = new StringBuffer();
        char[] arr  =str.toCharArray();

        for(char ele: arr){
           if(ele != ' '){
               outputStr.append(ele);
            }
        }
    return outputStr;
    }
}
