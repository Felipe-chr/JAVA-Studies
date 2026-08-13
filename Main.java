import java.util.Scanner;

public class Main {
private final static String welcomeMessage = "Olá, informe seu nome";
    public static void main(String[] args){
var scanner = new Scanner(System.in);
System.out.println(welcomeMessage);
String name = scanner.next();
System.out.println("informe sua idade");
int age = scanner.nextInt();
System.out.printf("Olá %s sua idade é %s", name, age);

    }
    
}