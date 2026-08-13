import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Insira um número de 1 a 7: ");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
            case 7:
                System.out.println("Fim de semana.");
                break;

            case 2:
                System.out.println("Segunda.");
                break;
            case 3:
                System.out.println("Terça.");
                break;
            case 4:
                System.out.println("Quarta.");
                break;
            case 5:
                System.out.println("Quinta.");
                break;
            case 6:
                System.out.println("Sexta.");
                break;
            default:
                System.out.println("Insira um número válido: ");
                break;
        }

        var message = switch (option) {
            case 1, 7 -> {
                var day = option == 1 ? "Domingo" : "Sábado";
                yield String.format("Hoje é %s, fim de semana!!!", day);
            }
            case 2    -> "Segunda.";
            case 3   -> "Terça.";
            case 4    -> "Quarta.";
            case 5    -> "Quinta.";
            case 6    -> "Sexta.";
            default   -> "Insira um número válido.";
        };
        System.out.println(message);
        scanner.close();
    }
}
