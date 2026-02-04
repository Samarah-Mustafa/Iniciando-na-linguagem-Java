import java.util.ArrayList;

public class UtilizandoArrays {
    public static void main(String[] args) {
        ArrayList<String> bandas = new ArrayList<>();
        
        bandas.add("Linkin Park");
        bandas.add("Imagine Dragons");
        bandas.add("Coldplay");

        System.out.println("Lista de bandas famosas: " + bandas);

    
        bandas.add(bandas.indexOf("Coldplay"), "My Chemical Romance"); // Adiciona antes de Coldplay

        System.out.println("Lista atualizada de bandas famosas: " + bandas);
        }
}   