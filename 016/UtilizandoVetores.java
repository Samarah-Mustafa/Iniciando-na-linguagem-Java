public class UtilizandoVetores {
    public static void main(String[] args) {
        int[] passarosPorDia = { 2, 5, 0, 7, 4, 1, 3, 0, 2, 5, 0, 1, 3, 1 };

        int totalPassaros = 0;
        int passarosPrimeiraSemana = 0;
        int passarosSegundaSemana = 0;

        for (int i = 0; i < 14; i++) {
            totalPassaros = totalPassaros + passarosPorDia[i];
        }
        System.out.println("Total de passaros nas duas semanas: " + totalPassaros);

        for (int i = 0; i < 7; i++) {
            passarosPrimeiraSemana = passarosPrimeiraSemana + passarosPorDia[i];
        }
        System.out.println("Passaros na primeira semana: " + passarosPrimeiraSemana);

        for (int i = 7; i < 14; i++) {
            passarosSegundaSemana = passarosSegundaSemana + passarosPorDia[i];
        }
        System.out.println("Passaros na segunda semana: " + passarosSegundaSemana);
    }
}