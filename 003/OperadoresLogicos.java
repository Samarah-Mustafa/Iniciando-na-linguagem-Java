public class OperadoresLogicos {// Operadores Lógicos: && AND (E), || OR (OU), ! NOT (NÃO)
    public static void main(String[] args) {
        int a, b;
        a = 4;
        b = 8;

        System.out.println(a > b); // false - não é maior que b.
        System.out.println(a > b || a < b); // (OR) true - embora a não seja maior que b, a é menor que b.
        System.out.println(b == 8 && a > b);// (AND)false - b é igual a 8, mas a não é maior que b.
        System.out.println(!(a > b));// (NOT) true - a expressão (a > b) é false, e o operador ! inverte para true.
    }
}
