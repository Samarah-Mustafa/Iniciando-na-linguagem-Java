import java.util.Scanner;

public class EstruturaMultiplaEscolha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Cadastrar aluno");
        System.out.println("2 - Cadastrar notas");
        System.out.println("3 - Listar alunos e notas");

        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Cadastrar aluno");
                break;
            case 2:
                System.out.println("Cadastrar notas");
                break;
            case 3:
                System.out.println("Listar alunos e notas");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente");
                break;
        }
    }
}