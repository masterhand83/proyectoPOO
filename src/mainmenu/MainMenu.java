/*
 * INSTITUTO POLITECNICO NACIONAL
 * ESCUELA SUPERIOR DE COMPUTO
 * Materia: [MATERIA]
 * Grupo: [GRUPO]
 * Profesor: [Profesor]
 * Alumno(s): Santiago Apreza Robin Miguel
 * [Uso y proposito de la clase]
 */

package mainmenu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Santiago Apreza Robin Miguel
 */
public class MainMenu {
    private boolean isProcessActive;
    private SubMenu menuList;
    public MainMenu(){
        isProcessActive = true;
        
    }
    public void process(){
        
        int i = 0;
        while(isProcessActive){
            System.out.println(mainMenuHeader());
            Scanner s = new Scanner(System.in);
            System.out.println("Selecciona una opcion");
            String res = s.nextLine();
            switch(res){
                case "1":
                break;
                case "2":
                break;
                case "3":
                break;
                case "4":
                break;
                case "5":
                break;
                case "6":
                    isProcessActive = false;
                break;
                default:
                    System.out.println("Elige una respuesta valida");
                break;
            }
            
        }
    }
    
    
    public String mainMenuHeader(){
        return ""
                + "elige una opcion escribiendo el numero:\n"
                + "1. Mostrar Menu\n"
                + "2. Realizar Pedido\n"
                + "3. Registrar Repartidores\n"
                + "4. Registrar Platillo\n"
                + "5. Registrar Datos Restaurante\n"
                + "6.salir\n";
    }
}
