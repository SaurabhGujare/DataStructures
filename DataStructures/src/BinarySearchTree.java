public class BinarySearchTree {

    public static void main(String[] args){
        Node root = new Node(10);
        root.insert(5);
        root.insert(15);
        root.insert(8);
        //root.insert(9);
        //root.insert(10);

        if(checkHeightBalance(root)!=-1){
            System.out.println("\nCheck if 8 is present in Tree: "+ root.contains(8));
            System.out.println("\nCheck if 80 is present in Tree: "+ root.contains(80));

            System.out.println("\nBinary Search Tree Elements:->");
            root.printInOrder();

            System.out.println("\n\nTree is balanced");
        }else{
            System.out.println("Tree is Not balanced");
        }

    }

    public static int checkHeightBalance(Node node){
        //Step1
        if(node==null){
            return 0;
        }

        //Step2
        int leftHeight = checkHeightBalance(node.left);
        if(leftHeight==-1){
            return -1;
        }

        //Step3
        int rightHeight = checkHeightBalance(node.right);
        if(rightHeight==-1){
            return -1;
        }

        if(Math.abs(leftHeight-rightHeight)>1){
            return -1;
        }

        return (1+Math.max(leftHeight,rightHeight));
    }


}

