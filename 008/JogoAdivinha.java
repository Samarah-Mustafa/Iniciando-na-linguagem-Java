/*Criando um jogo de adivinhação em Java. O programa gera um número aleatório
entre 0 e 100 e pede ao usuário para adivinhar qual é esse número. Se o usuário acertar,
ele recebe uma mensagem de parabéns; caso contrário, o programa revela o número correto.*/

import java.util.Scanner;
import java.util.Random;// Importa a classe Random para gerar números aleatórios

public class JogoAdivinha {
    public static void main(String[] args) {
        Random gerador = new Random(); // Cria um objeto da classe Random
        int x = gerador.nextInt(100);

        /*A estrutura try-with-resources garante que o Scanner será fechado
        automaticamente.*/
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Adivinhe o número que estou pensando");
            int numero = entrada.nextInt();

            if (numero == x) {
                System.out.println("Parabéns! Você adivinhou o número.");
            } else {
                System.out.println("Que pena! Você errou. O número que pensei foi " + x);
            }
        } // A 'entrada' é fechada aqui automaticamente.
    }
}