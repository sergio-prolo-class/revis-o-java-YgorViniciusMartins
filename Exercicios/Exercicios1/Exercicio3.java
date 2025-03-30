import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com a quantidade de alunos: ");
        int n_alunos = teclado.nextInt();
        System.out.print("Entre com a nota dos alunos separadas por espaço: ");
        teclado.nextLine();
        String notas = teclado.nextLine();

        String[] vet_notas = notas.split(" ");
        String notas0_2 = "0 − 2    | ";
        String notas3_5 = "3 − 5    | ";
        String notas6_8 = "6 − 8    | ";
        String notas9_10 = "9 − 10   | ";

        for (int i = 0; i < n_alunos; i++) {
            int nota = Integer.parseInt(vet_notas[i]);
            if(nota <= 2){
                notas0_2 += "*";
            } else if (nota <= 5){
                notas3_5 += "*";
            } else if (nota <= 8) {
                notas6_8 += "*";
            } else {
                notas9_10 += "*";
            }
        }

        System.out.println(notas0_2);
        System.out.println(notas3_5);
        System.out.println(notas6_8);
        System.out.println(notas9_10);
    }
}