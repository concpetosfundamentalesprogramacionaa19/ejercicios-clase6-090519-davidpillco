/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasbasicas;
import java.util.Scanner; 
/**
 *
 * @author reroes
 */
public class CicloWhile3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Datos
        
        String mensajeFinal = "";
        String nombre = "";
        String apellido = "";
        String profesion = "";
        String opcion = "";
        boolean bandera = true;
        int contador = 1;
        mensajeFinal = String.format("%s%s\n\n", mensajeFinal,
                "Informe de la ciudad de Loja");
        mensajeFinal = String.format("%s%s\n\n", mensajeFinal,
                "Listado de personas");
        while(bandera == true){
            System.out.print ("Ingrese sus nombres: ");
            nombre = entrada.nextLine();
            System.out.print ("Ingrese sus apellidos: ");
            apellido = entrada.nextLine();
            System.out.print ("Ingrese su profesion: ");
            profesion = entrada.nextLine();
            mensajeFinal = String.format("%s Persona %d: %s %s- %s\n",
                    mensajeFinal,contador,nombre, apellido, profesion);
            contador = contador +1; // que el contador se incremente
            System.out.println("Digite 'n' para salir");
            opcion = entrada.nextLine();
            if(opcion.equals("n")){
                bandera = true;
            
            }
            
        }
        System.out.printf("%s", mensajeFinal);
    }
    
}
