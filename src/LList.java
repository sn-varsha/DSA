//import java.util.LinkedList;

public class LList {

    public static void main(String[] args){

        LinkedList nums = new LinkedList();

        nums.add(5);
        nums.add(9);
        nums.add(6);

        nums.addFirst(7);

        nums.delete(9);

//        System.out.println(nums.get(2));
//        nums.peek();
//
//        System.out.print(nums);

        nums.printValues();

    }
}
