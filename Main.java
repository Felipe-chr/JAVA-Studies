import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Informe seu nome: ");
        var nome = scanner.next();
        System.out.println("Você é emancipado (s/n):");
        var ehEmancipado = scanner.next().equalsIgnoreCase("S");
        
        var podeDirigir = (idade >= 18)||(idade >=16&& ehEmancipado);
        var mensagem = podeDirigir ?
            nome + ", você pode dirigir.":
            nome + ", você não pode dirigir.";
            System.out.println(mensagem);
            scanner.close();
    }
}