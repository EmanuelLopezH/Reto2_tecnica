package co.edu.udea.reto2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Reto2 {
    static String op;
    static double plato1, plato2, dim;
    static double pinones[] = new double[12];
    static Scanner scan = new Scanner(System.in);

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
            try {
                int num = entrada.nextInt();
                switch (num) {
                    case 1:
                        sumCuadrada();
                        break;
                    case 2:
                        numPrimos();
                        break;
                    case 3:
                        llenarPlatos();
                        llenarPinones();
                        llenarDimensiones();
                        calculo();
                        break;
                    case 4:
                        break loop;
                    default:
                        break;
                }
            } catch(InputMismatchException e){
                
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
    
    public static void llenarPlatos(){
        System.out.print("Ingrese el # de dientes del primer plato: ");
        plato1 = scan.nextInt();
        boolean continuar = false;
        while(!continuar){
            System.out.println("Desea ingresar el # de dientes del segundo plato?");
            System.out.println(" > 1. Si");
            System.out.println(" > 2. No");
            int opt = scan.nextInt();
            switch(opt){
                case 1:
                    System.out.print("Ingrese el # de dientes del segundo plato: ");
                    plato2 = scan.nextInt();
                    continuar = true;
                    break;
                case 2:
                    plato2 = 0;
                    continuar = true;
                    break;
                default:
                    System.out.println("Has ingresado una opción invalida");
            }
            System.out.println("");
        }
    }
   
    public static void llenarPinones(){
        int aux;
        System.out.println("Ingrese el numero de dientes de los 12 piñones");
        for(int i = 0; i < pinones.length; i++){
            System.out.print("Piñon " + (i+1) + ": ");
            aux = scan.nextInt();
            pinones[i] = aux;
        }
        //System.out.println("");
    }
   
    public static void llenarDimensiones(){
        int aux;
        System.out.println("Dimensiones de las llantas");
        System.out.println(" > 1. 29x2.1");
        System.out.println(" > 2. 29x2.2");
        System.out.println(" > 3. 29x2.3");
        System.out.print("Escriba el número de la dimensión correspondiente:");
        aux = scan.nextInt();
        
        switch(aux){
            case 1:
                dim = 2288;
                break;
            case 2:
                dim = 2298;
                break;
            case 3:
                dim = 2326;
                break;
        }
    }
    
    public static void calculo(){
        for (int i = 0; i < pinones.length; i++) {
            double avanza;
            avanza = (plato1/pinones[i])*dim;
            System.out.println("Plato 1: piñon # " + (i+1) + " Avanza: "+ avanza + " mm");
        }
        System.out.println("");
        for (int i = 0; i < pinones.length; i++) {
            double avanza;
            avanza = (plato2/pinones[i])*dim;
            System.out.println("Plato 2: piñon # " + (i+1) + " Avanza: "+ avanza + " mm");
        }
    }
}
