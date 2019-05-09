/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejosswitch;
import java.util.Scanner; 

/**
 *
 * @author reroes
 */
public class UsoSwitch5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String placa;
        System.out.println("Ingrese la placa de su vehiculo");
        placa = entrada.nextLine();
        char valor = placa.charAt(0);
                
        switch(valor){
            case 'o':
            case'O':
                System.out.printf("Su placa pertenece a la provincia del Oro"
                        + " %s de %s\n", 
                        valor, placa.toUpperCase());
                break;
            
            case 'E':
            case 'e':  
                System.out.printf("Su placa pertenece a la provicia de "
                        + "Esmeraldas %s de %s\n", 
                        valor, placa.toLowerCase());
            case 'g':
            case 'G':  
                System.out.printf("Su placa pertenece a la provicia de "
                        + "Guayas %s de %s\n", 
                        valor, placa.toLowerCase());    
                break;    
            case 'L':
            case 'l':  
                System.out.printf("Su placa pertenece a la provicia de "
                        + "Los Rios %s de %s\n", 
                        valor, placa.toLowerCase());
            case 'M':
            case 'm':  
                System.out.printf("Su placa pertenece a la provicia de "
                        + "Manabí %s de %s\n", 
                        valor, placa.toLowerCase());   
            case 'S':
            case 's':  
                System.out.printf("Su placa pertenece a la provicia de "
                        + "Santa Elena %s de %s\n", 
                        valor, placa.toLowerCase()); 
              
            
            default:
                System.out.println("ninguna de las anteriores");
                
        }
        
    }
}
