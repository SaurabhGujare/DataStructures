public class SwapValues {

    public static void main(String[] args){
        int x=6;
        int y=9;

        System.out.println("Before Swapping: \nX= "+x+" || Y= "+y);

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("After Swapping: \nX= "+x+" || Y= "+y);

    }
}
