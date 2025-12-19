import java.util.Scanner;

public class EstruturaRepeticaoWhile {
    public static void main(String[] args) {
        int opcao = 0;// Variável do meu ponto de partida.
        
        while (opcao != 99) {// Enquanto a variável "opcao" for diferente de 99, o bloco de código será executado.   
        System.out.println("Digite um número qualquer ou 99 para sair."); //A condição de parada é o número 99.
        Scanner entrada = new Scanner(System.in);
        opcao = entrada.nextInt(); // Lê o valor digitado pelo usuário.

    }
 }
}
/* Estrutura de repetição while
- Enquanto a condição for verdadeira, o bloco de código será executado.*/