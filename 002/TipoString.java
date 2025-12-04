public class TipoString {
    public static void main(String[] args) {
        
        String saudacao = "Olá, Mundo!";
        String nome = "João";
        
        System.out.println(saudacao.length()); // Saída: 11
        System.out.println(saudacao.contains("Mundo")); // Saída: true
        System.out.println(saudacao.concat(" Seja bem-vindo!")); // Saída: Olá, Mundo! Seja bem-vindo!
        System.out.println(saudacao.equals(nome)); // Saída: false
        System.out.println(saudacao.substring(3)); // Saída: , Mundo!
        System.out.println(saudacao.replace(saudacao, nome));   // Saída: João
    


        /*funções e métodos para manipular strings em Java.
        -Obtendo o comprimento de uma string com length().
        -Verificando se uma string contém outra string com contains().
        -Concatenando strings com concat().
        -Comparando strings com equals().
        -Extraindo uma substring de uma string com substring().
        -Substituindo uma substring por outra com replace(). */
    }
}