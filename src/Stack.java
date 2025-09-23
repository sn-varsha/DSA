public class Stack {

    private int[] arr = new int[5];
    int top;
    int size;

    public Stack(){
        size = arr.length;
        top = -1;
    }
    public void push(int data){
//        top++;
        if(++top<size)
            arr[top] = data;
    }

    public void printStack(){
        for(int n : arr){
            System.out.print(n+" ");
        }
        System.out.println();
    }

    public int pop() {
        if(top>-1) return arr[top--];
        else System.out.println("Stack underflow");
        return 0;
    }

    public int peek() {
        return arr[top];
    }
}
