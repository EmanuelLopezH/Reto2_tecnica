package co.edu.udea.reto2;

import java.util.Scanner;

public class Reto2 {

    public static void main(String[] args) {      
        sumCuadrada();
    }
    
    static public void sumCuadrada(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero positivo");
        int num = entrada.nextInt();
        
        int sum = 0;
        int res = 0;
        String suma = "";
        
        for (int i = 1; i <= num; i++){
            res = (2 * i - 1);
            sum += res;
            suma += res + "+";
            System.out.println(i + "^2 = " + suma + " = " + sum);
        }
    }
    
}
