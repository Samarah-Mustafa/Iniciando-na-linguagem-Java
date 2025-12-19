public class EstruturaRepeticaoAninhada {//construindo a tabuada de 1 a 10
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {//primeiro laço para o primeiro número da tabuada
            for (int j = 0; j <= 10; j++) {//segundo laço para o segundo número da tabuada
                System.out.println(i + " x " + j + " = " + (i * j));//imprimindo o resultado da multiplicação
                if (j == 10) {//condição para imprimir uma linha separadora após cada tabuada
                    System.out.println("---------------------");//imprimindo a linha separadora
                }
            }
        }

    }
}