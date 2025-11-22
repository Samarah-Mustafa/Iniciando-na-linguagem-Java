public class OperadoresLogicos {
    public static void main(String[] args) {
        int a, b;
        a = 4;
        b = 8;

        System.out.println(a > b); // 
        System.out.println(a > b || a < b); 
        System.out.println(b == 8 && a > b);
        System.out.println(!(a > b));
    }
}

