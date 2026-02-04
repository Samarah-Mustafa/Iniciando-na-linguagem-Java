import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> estados = new ArrayList<>();

        estados.add("São Paulo");
        estados.add("Rio de Janeiro");
        estados.add("Minas Gerais");
        estados.add("Bahia");

        System.out.println(estados);

        estados.remove(2);

        System.out.println(estados);

        estados.contains("Bahia");
        System.out.println(estados.contains("Bahia"));
    }
}