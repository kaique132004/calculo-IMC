import java.util.Scanner;

public class aula_mauricio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var out = System.out;

        try {
            out.println("Digite sua altura (em metros): ");
            double altura = scanner.nextDouble();

            out.println("Digite seu peso (em quilogramas): ");
            double peso = scanner.nextDouble();

            double imc = peso / (altura * altura);

            String imc_format = String.format("%.2f", imc);

            if (imc >= 40) {
                out.println("Obesidade grau III: " + imc_format);
            } else if (imc >= 35) {
                out.println("Obesidade grau II: " + imc_format);
            } else if (imc >= 30) {
                out.println("Obesidade grau I: " + imc_format);
            } else if (imc >= 25) {
                out.println("Levemente acima do peso: " + imc_format);
            } else if (imc >= 18.6) {
                out.println("Peso Ideal: " + imc_format);
            } else {
                out.println("Abaixo do peso: " + imc_format);
            }
        } catch (Exception e) {
            out.println("Erro ao ler entrada: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
