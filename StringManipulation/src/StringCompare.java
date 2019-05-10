public class StringCompare {

    public static void main(String[] args){
        String s1="Sachin";
        String s2="SACHIN";
        String s3="Sachin";
        String s4 = new String("Sachin");
        String s5 = "Ratan";
        String s6="SACHINTYUTIUY";

        System.out.println("s1=Sachin\ns2=SACHIN\ns3=Sachin\ns4= new String(Sachin)\ns5=Ratan\nString s6=SACHINTYUTIUY\n\n");
        System.out.println("s1.eqauls(s2): "+s1.equals(s2));
        System.out.println("s1.equalsIgnoreCase(s2): "+s1.equalsIgnoreCase(s2));
        System.out.println("s1.equals(s4): "+s1.equals(s4));
        System.out.println("\n");
        System.out.println("(s1==s2): "+(s1==s2));
        System.out.println("(s1==s3): "+(s1==s3));
        System.out.println("(s1==s4): "+(s1==s4));
        System.out.println("\n");
        System.out.println("(s1.compareTo(s5): "+(s1.compareTo(s5)));
        System.out.println("(s5.compareTo(s1): "+(s5.compareTo(s1)));
        System.out.println("(s1.compareTo(s2): "+(s1.compareTo(s2)));
        System.out.println("(s1.compareTo(s6): "+(s1.compareTo(s6)));
        System.out.println("(s1.compareTo(s3): "+(s1.compareTo(s3)));
        System.out.println("(s1.compareTo(s2): "+(s1.compareToIgnoreCase(s2)));

        String str1 = "Java is a language widely used in Programing world";
        String replacedStr1 = str1.replace("Java","C++");
        System.out.println("\n\nstr1: "+str1+"\nreplacedStr1: "+replacedStr1);


    }
}
