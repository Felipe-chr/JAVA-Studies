public class Main {

    public static void main(String[] args){
        var value1 = 6;
        var bynary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro numero da operação %s (representação binária) %s \n", value1, bynary1);
        var value2 = 5;
        var bynary2 = Integer.toBinaryString(value2);
        System.out.printf("Segundo numero da operação %s (representação binária) %s \n", value2, bynary2);
        var result = value1 | value2;
        var bynaryResult = Integer.toBinaryString(result);
        System.out.printf(" %s | %s = %s \" (representação binária: %s)\n", value1, value2, result, bynaryResult);
        /*
        0 = false
        1 = true
        110 || 101
         \ 111 /  

        */
        var value3 = 6;
        var bynary3 = Integer.toBinaryString(value3);
        System.out.printf("Primeiro numero da operação %s (representação binária) %s \n", value3, bynary3);
        var value4 = 5;
        var bynary4 = Integer.toBinaryString(value4);
        System.out.printf("Segundo numero da operação %s (representação binária) %s \n", value4, bynary2);
        var result2 = value3 & value4;
        var bynaryResult2 = Integer.toBinaryString(result2);
        System.out.printf(" %s & %s = %s \" (representação binária: %s)\n", value3, value4, result2, bynaryResult2);
        /*
        0 = false
        1 = true
        110 && 101
         \ 100 /  

        */
        var value5 = 6;
        var bynary5 = Integer.toBinaryString(value5);
        System.out.printf("Primeiro numero da operação %s (representação binária) %s \n", value5, bynary5);
        var value6 = 5;
        var bynary6 = Integer.toBinaryString(value6);
        System.out.printf("Segundo numero da operação %s (representação binária) %s \n", value6, bynary6);
        var result3 = value5 ^ value6;
        var bynaryResult3 = Integer.toBinaryString(result3);
        System.out.printf(" %s ^ %s = %s \" (representação binária: %s)\n", value5, value6, result3, bynaryResult3);
        /*
        0 = false
        1 = true
        110 ^ 101
         \ 011 /  
        ^ (XOR): efetua comparação bit por bit, e retorna true/1 se diferente, e false/0 se igual
        */
        var value7 = 6;
        var bynary7 = Integer.toBinaryString(value7);
        System.out.printf("Primeiro numero da operação %s (representação binária) %s \n", value7, bynary7);
        var result4 = ~value7;
        var bynaryResult4 = Integer.toBinaryString(result3);
        System.out.printf(" ~%s = %s \" (representação binária: %s)\n", value7, result4, bynaryResult4);
        /*
        0 = false
        1 = true
        110 é na verdade 000000000000000000000000000110
        então o ~ disso: 111111111111111111111111111001
        */
        var value8 = 6;
        var bynary8 = Integer.toBinaryString(value8);
        System.out.printf("Primeiro numero da operação %s (representação binária) %s \n", value8, bynary8);
        var value9 = 2;
        var bynary9 = Integer.toBinaryString(value9);
        System.out.printf("Segundo numero da operação %s (representação binária) %s \n", value9, bynary9);
        var result5 = value8 << value9;
        var bynaryResult5 = Integer.toBinaryString(result5);
        System.out.printf(" %s << %s = %s \" (representação binária: %s)\n", value8, value9, result5, bynaryResult5);
        /*
        0 = false
        1 = true
        110 << 2
        \     /
         01100  
        << (SHIFT OPERATOR left):Vai empurrar o numero em bits para o lado que a flecha aponta
                                a distancia empurrada será a do segundo numero.
        >>(O SHIFT OPERATOR  right) verifica se o numero é negativo
        >>> é o equivalente ao <<
        
                                */
    }
}