public class Matriz {
    public static void main(String[] args) {
        int[][] dados = new int[3][3];

        for (int i = 0; i < 3; i++) { // controla as linhas
            for (int j = 0; j < 3; j++) { // controla as colunas
                dados[i][j] = j;
            }
        }

        // Imprimir a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(dados[i][j] + " ");
            }
            System.out.println();
        }
    }
}