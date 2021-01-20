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
import restaurante.RestauranteData;

/**
 *
 * @author Santiago Apreza Robin Miguel
 */
public class MainMenu {
    private boolean isProcessActive;
    private SubMenu menuList,
                    menuPedido,
                    registerRepartidor,
                    registerPlatillo,
                    registerDatosPersonales;
    
    
    public MainMenu(){
        isProcessActive = true;
        menuList = new MenuList();
        menuPedido = new MenuPedido();
        registerRepartidor = new RegisterRepartidor();
        
    }
    public void process(){
        RestauranteData data = new RestauranteData();
        int i = 0;
        while(isProcessActive){
            System.out.println(mainMenuHeader());
            Scanner s = new Scanner(System.in);
            System.out.println("Selecciona una opcion");
            String res = s.nextLine();
            switch(res){
                case "1":
                    menuList.process(data);
                break;
                case "2":
                    menuPedido.process(data);
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
