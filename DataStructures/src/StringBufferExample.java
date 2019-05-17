public class StringBufferExample {
    public static void main(String[] args){
        StringBuffer strBuff = new StringBuffer("Java is a widely used programming language");

        System.out.println(strBuff);

        strBuff.replace(0,4,"C++");
        System.out.println(strBuff);

        strBuff.insert(0,"Java and ");
        System.out.println(strBuff);

        strBuff.append("s");
        System.out.println(strBuff);


    }
}
