import java.util.Scanner;

public class EstruturaRepeticaodoWhile {
    public static void main(String[] args) {
        int opcao;// diferente de while, não precisa inicializar a variável
        do {
            System.out.println("Digite um valor ou 99 para sair");
            Scanner entrada = new Scanner(System.in);
            opcao = entrada.nextInt();
        } while (opcao != 99);//while verifica a condição após a execução do bloco
    }
}
//doWhile é usado quando precisamos que o bloco de código seja executado pelo menos uma vez,