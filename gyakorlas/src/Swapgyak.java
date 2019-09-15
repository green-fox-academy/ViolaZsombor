public class Swapgyak {
    public static void main(String[] args) {
        int a = 123;
        int b = 526;

        System.out.println("before swap a: " +a);
        System.out.println("before swap b: "+b);

        int c = a; //c=123
         a = b; //a=526
         b = c; //b=123

        System.out.println("after swap a: " +a);
        System.out.println("after swap b: " +b);

    }
}
