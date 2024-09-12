
package co.edu.konradlorenz.view;

import java.util.Scanner;




public class Vista {
    Scanner sc = new Scanner(System.in);
    
   static public String enviarMensaje(String mensaje){
        
        return mensaje;
    }
    
   static public int enviarInt(int entero){
        
        return entero;
    }
    
    static public void mostrarMensaje(String mensaje){
        
        System.out.println(mensaje);
    }
     public String pedirString(){
        return sc.nextLine();
    }
     static public void mostrarInt(int valor){
         System.out.println(valor);
     }

    
}
