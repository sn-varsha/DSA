public class Recursion {

    public  static void main(String[] args){

        int result = fact(3);
        System.out.print(result);
    }

    public static int fact(int i){

        if(i!=0) return i*fact(i-1);

        return 1;
    }
}
