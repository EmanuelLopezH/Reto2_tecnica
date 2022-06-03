package co.edu.udea.reto2;

import java.util.Scanner;

public class Reto2 {

    public static void main(String[] args) {
        loop : while (true){
            Scanner entrada = new Scanner(System.in);
            System.out.println("Dijite un número del 1 al 4");
            System.out.println("1. Cuadrado de un número por suma de números"
                    + " impares");
            System.out.println("2. Primeros N primos y su suma");
            System.out.println("3. Desarrollo de una MTB");
            System.out.println("4. Salir");
            System.out.print("-> ");
            int num = entrada.nextInt();
            try{
            switch(num){
                case 1:
                    sumCuadrada();
                    break;
                case 2:
                    numPrimos();
                    break;
                case 4:
                    break loop;
                default:
                    break;
            }
            } catch(Exception e){
                System.out.println("error" + e);
            }
            
                
                    
        }
    }
    
    static public void sumCuadrada(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero positivo");
        int num = entrada.nextInt();
        
        int sum = 0;
        int res;
        String suma = "";
        
        for (int i = 1; i <= num; i++){
            res = (2 * i - 1);
            sum += res;
            suma += res + "+";
            System.out.println(i + "^2 = " + suma + " = " + sum);
        }
    }
    
    static public void numPrimos(){
        Scanner entrada = new Scanner(System.in);       
        System.out.print("Ingrese un número entero positivo: ");
        int n = entrada.nextInt();
        int m = n;
        int i;
        int num = 0;
        int suma  = 0;
        int a;
        String primo = "";
        
        while(m > 0){
            num += 1;
            a = 1;
            i = 0;
            while(a <= num){
                if(num % a == 0){
                    i += 1;
                }
                a += 1;               
            }
            if (i == 2){
                    primo += num + ", ";
                    suma += num;
                    m -= 1;
                }           
        }
        System.out.println(primo);
        System.out.println("La suma de los " + n + " primeros números primos es: " + suma);        
}
}
