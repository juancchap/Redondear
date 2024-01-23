
package redondear;
import java.util.Scanner;
public class Redondear {

    public static void main(String[] args) {
        
       //Declaracion de variables
       double redondo;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe un numero en decimal :");
        redondo=entrada.nextDouble();
       long resultado = Math.round(redondo);
       
        System.out.println("El redondeo de : "+resultado);
       
        
          //Declaracion de variables
      // double redondo = 4.56;
       //long resultado = Math.round(redondo);
       
//        System.out.println("El redondeo de 4.56 es : "+resultado);
    }
    
}
