public class UtilizandoMatrizes {
    public static void main(String[] args) {
        // Declaração e inicialização de uma matriz 2D
        int[][] matriz = {
            {9, 8, 7},
            {5, 3, 2},
            {6, 6, 7}
        };

        int[] maiorPorLinha = new int[3];
        int[] menorPorColuna = new int[3];

        for(int i = 0; i < 3; i++) 
            maiorPorLinha[i] = 0;

        for(int i = 0; i < 3; i++) 
            menorPorColuna[i] = 10;

        // Encontrar o maior valor na linha 0
        for(int i = 0; i < 3; i++)
            if(matriz[0][i] > maiorPorLinha[0])
                maiorPorLinha[0] = matriz[0][i];
       
        // Encontrar o maior valor na linha 1
        for(int i = 0; i < 3; i++)
            if(matriz[1][i] > maiorPorLinha[1]) 
                maiorPorLinha[1] = matriz[1][i];

        // Encontrar o maior valor na linha 2
        for(int i = 0; i < 3; i++)
            if(matriz[2][i] > maiorPorLinha[2])
                maiorPorLinha[2] = matriz[2][i];

        // Encontrar o menor valor na coluna 0
        for(int i = 0; i < 3; i++)
            if(matriz[i][0] < menorPorColuna[0])
                menorPorColuna[0] = matriz[i][0];

        // Encontrar o menor valor na coluna 1
        for(int i = 0; i < 3; i++)
            if(matriz[i][1] < menorPorColuna[1])
                menorPorColuna[1] = matriz[i][1];

        // Encontrar o menor valor na coluna 2
        for(int i = 0; i < 3; i++)
            if(matriz[i][2] < menorPorColuna[2])
                menorPorColuna[2] = matriz[i][2];
        
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++) {
                if (maiorPorLinha[i] == menorPorColuna[j]) {
                    System.out.println("Ponto de Sela " + maiorPorLinha[i]);


                }            
        }  
    } 
}         