
package operaciones;
import java.util.Scanner;  
import javax.swing.JOptionPane; 



public class operaciones {
    int numero1=0,numero2=0,resultado=0; 

    
    
public static void main( String [] args){
    String operacion;
    Scanner input = new Scanner (System.in);
 
    operaciones sumar =new operaciones();
    operaciones restar =new operaciones(); 
    operaciones dividir =new operaciones();
    operaciones multiplicar =new operaciones();
    
System.out.println("Bienvenido a tu programa de calculo de operaciones" );
operacion=JOptionPane.showInputDialog("Escriba la operacion a realizar ,sumar,restar,multiplicar,dividir : ");
       
switch(operacion){
    
   
        case "sumar": System.out.println("Escribe el primer numero a sumar");
       sumar.numero1=input.nextInt();
                 System.out.println("Escribe el segundo numero a sumar");
       sumar.numero2=input.nextInt();
               sumar.resultado=sumar.numero1+sumar.numero2;
               System.out.println(sumar.numero1+ " mas "+sumar.numero2 +" es igual a " +sumar.resultado);
        break ;
        
        case "restar": System.out.println("Escribe el primer numero a restar");
       restar.numero1=input.nextInt();
                 System.out.println("Escribe el segundo numero a restar");
       restar.numero2=input.nextInt();
               restar.resultado=restar.numero1-restar.numero2;
               System.out.println(restar.numero1+ " menos "+restar.numero2 +" es igual a " + restar.resultado);
        break ;
            
        case "dividir": System.out.println("Escribe el primer numero a dividir");
       dividir.numero1=input.nextInt();
                 System.out.println("Escribe el numero de partes en la que sera dividido");
       dividir.numero2=input.nextInt();
               dividir.resultado=dividir.numero1/dividir.numero2;
               System.out.println(dividir.numero1+ " entre "+dividir.numero2 +" es igual a " +dividir.resultado);
        break ;    
            
        case "multiplicar": System.out.println("Escribe el primer numero a multiplicar");
       multiplicar.numero1=input.nextInt();
                 System.out.println("Escribe el segundo numero a multiplicar");
       multiplicar.numero2=input.nextInt();
               multiplicar.resultado=multiplicar.numero1*multiplicar.numero2;
               System.out.println(multiplicar.numero1+ " por "+multiplicar.numero2 +" es igual a " +multiplicar.resultado);
        break ;
        default: System.out.print("Escriba una valor correcto(sumar,restar,multiplicar,dividir)");
                 
}
}

}



