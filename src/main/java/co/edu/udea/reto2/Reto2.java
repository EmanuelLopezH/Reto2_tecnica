package co.edu.udea.reto2;

import java.util.Scanner;

public class Reto2 {
    static String op;
    static int plato1, plato2, dim;
    static int pinones[] = new int[12];
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {      
        // variables del problema
        sumCuadrada();
        variables ();
        
        
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
            System.out.println("Si");
        }
    }
    
    /**
 *
 * @author WilmarOS
 */

    public static void variables (){
        System.out.println("= = = = = = = = = = = = = = = = =");
        System.out.println(" Desarrollos posibles de una BMT ");
        System.out.println("= = = = = = = = = = = = = = = = =");
        System.out.println("");
        llenarPlatos();
        llenarPinones();
        llenarDimensiones();
    }

   
    public static void llenarPlatos(){
        /*se solicita los # de dientes para los platos
        en ambos caso se debe dar un valor no tiene en cuenta 
        el valor nulo
        */
        System.out.print("Ingrese el # de dientes del primer plato: ");
        plato1 = scan.nextInt();
        System.out.print("Ingrese el # de dientes del segundo plato: ");
        plato2 = scan.nextInt();
        System.out.println("");
    }
   
    public static void llenarPinones(){
        //aca se utiliza array para almacenar los datos
        int aux;
        System.out.println("Ingrese el numero de dientes de los 12 piñones");
        for(int i = 0; i < pinones.length; i++){
            System.out.print("Piñon " + (i+1) + ": ");
            aux = scan.nextInt();
            pinones[i] = aux;
        }
        System.out.println("");
    }
   
    public static void llenarDimensiones(){
        /*
        el usuarios escoge entre tres opciones
        para hacer el calculo 
        */
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
        
    }
}


