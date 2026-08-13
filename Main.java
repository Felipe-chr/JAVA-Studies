import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Insira seu salário bruto: ");
        double salario = scanner.nextDouble();
        System.out.println("Insira seu bebefício: ");
        double ben = scanner.nextDouble();
        double imposto=0;
        if(salario>2500.0){
            imposto=salario*0.15;
        }
        else if(salario>1100.0){
            imposto=salario*0.1;
        }
        else if(salario<1100.0){
            imposto=salario*0.05;
        }
        else{
           System.out.printf("Salário de %.2f não é permitido.", salario);
        }
            salario=(salario-imposto)+ben;
            System.out.printf("\nSalário: %.2f", salario);
            scanner.close();
    }
}
