public class Metodo {
    public static int somar(int a, int b) {//método somar
        return a + b;
    }
 public static void main(String[] args) {
       int total = Metodo.somar(10,50);//Chamada do método somar
         System.out.println("Total: " + total);//Imprime o resultado
    }
}