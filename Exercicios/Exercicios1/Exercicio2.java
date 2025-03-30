public class Exercicio2 {
    public static void main(String[] args) {
        float prj_1 = Float.parseFloat(args[0]);
        float prj_2 = Float.parseFloat(args[1]);
        float participacao = Float.parseFloat(args[2]);
        float[] pesos = {2, 3};

        float cf = Math.round(((prj_1 * pesos[0] + prj_2 * pesos[1]) / (pesos[0] + pesos[1])) * 0.9 + participacao * 0.1);

        if(cf >= 6 ){
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
    }
}