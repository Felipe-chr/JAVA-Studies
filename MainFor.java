import java.util.Scanner;

public class MainFor {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        
        for(int i = 1; i<=30; i++){
            if(i%2==0) continue;
            System.out.println(i);
        }
        System.out.println("=================");
        for(int i = 1; i<=30; i++){
            if(i==18) break;
            System.out.println(i);
        }

    }
}
