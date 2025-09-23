//import java.util.Stack;

public class StackWorking {

    public static void main(String[] args){

        Stack nums = new Stack();
        nums.push(10);
        nums.push(20);
        System.out.println(nums.pop());
        nums.push(30);
        nums.push(40);
        System.out.println(nums.peek());
        nums.push(50);
        nums.push(60);
        nums.push(70);


//        nums.pop(10);

//        System.out.print(nums);
        nums.printStack();

    }
}
