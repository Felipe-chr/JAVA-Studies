import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("\nInsira sua idade: ");
        var idade1 = scanner.nextInt();
        System.out.println("\nInsira sua idade: ");
        var idade2 = scanner.nextInt();
        int result =  Math.abs(idade1 - idade2);
        System.out.printf("\nA diferença entre as idades é: %d", result);
        scanner.close();
    }
}
