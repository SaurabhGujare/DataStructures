//Write a java program to reverse a string?

public class ReverseAString {

    public static void main(String[] args){
        String inputStr = "Saurabh";

        reverseStringUsingCharArray(inputStr);
        reverseStringUsingStringBuffer(inputStr);
        System.out.println("\nFrom Recursive Method: \n"+recursiveMethod(inputStr));
    }

    private static void reverseStringUsingCharArray(String inputStr){
        String outputStr="";
        if(inputStr.length()>1){
            char[] charArray = inputStr.toCharArray();

            for(int i=charArray.length-1;i>=0;i--){
                outputStr=outputStr+charArray[i];
            }
        }
        System.out.println("\nInside reverseStringUsingCharArray():\n"+outputStr);
    }

    private static void reverseStringUsingStringBuffer(String inputStr){
        StringBuffer strInput = new StringBuffer(inputStr);
        System.out.println("\nInside reverseStringUsingStringBuffer():\n"+strInput.reverse());
    }

    private static String recursiveMethod(String str){
        if(null==str||str.length()<=1){
            return str;
        }
        return recursiveMethod(str.substring(1))+str.charAt(0);
    }
}
