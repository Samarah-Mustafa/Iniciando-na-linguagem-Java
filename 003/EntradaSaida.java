import java.util.Scanner; /*Importando a biblioteca Scanner do Java para entrada de dados,
sempre no topo, antes da declaração da classe.*/

public class EntradaSaida {//declaração da classe pública chamada EntradaSaida
    public static void main(String[] args) { //serve como ponto de entrada do programa
        System.out.println("Olá! ");//exibe a mensagem "Olá!" no console
        System.out.println("Informe seu nome:");//exibe a mensagem "Informe seu nome:" no console

        String palavra; //declaração da variável do tipo String
        Scanner entrada = new Scanner(System.in); //criação do objeto Scanner para ler a entrada do usuário
        palavra = entrada.next();//lê a próxima palavra digitada pelo usuário

        System.out.println("Palavra digitada: " + palavra);//exibe a palavra digitada pelo usuário

        entrada.close(); // Boa prática: fechar o Scanner após o uso.
    }
}