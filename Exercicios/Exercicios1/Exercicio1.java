import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com o seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Entre com o ano que nasceu: ");
        int ano_nas = teclado.nextInt();
        System.out.print("Entre com o ano atual: ");
        int ano_atual = teclado.nextInt();
        String idade = Integer.toString(ano_atual - ano_nas);
        System.out.println(nome + " possui " + (ano_atual - ano_nas) + " anos.");

    }
}