import java.util.Scanner;

public class Ejercicios {
    
   public static void main(String[] args) {
      
       int numero;
       
       Scanner input = new Scanner(System.in);
       
       System.out.println("Ingrese un numero entre el 0 y el 9.999");
       numero = input.nextInt();
       
       
       int contador= 1;
       int control=10;
               
               
         while(control <= numero) {
             
            contador = contador + 1;
            control =  control * 10;
               
         }    
               
        System.out.println("La cantidad de cifras de  "  +numero+ "son en total "+contador);       
               
              
       
       
       
       
    }
   }
