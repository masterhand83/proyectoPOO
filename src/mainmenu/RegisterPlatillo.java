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

import java.util.Scanner;
import restaurante.Bebida;
import restaurante.Comida;
import restaurante.Postre;
import restaurante.RestauranteData;

/**
 *
 * @author Santiago Apreza Robin Miguel
 */
public class RegisterPlatillo extends SubMenu {

    @Override
    void process(RestauranteData data) {
        Scanner s = new Scanner(System.in);
        System.out.println("Elige el tipo de platillo");
        System.out.println("1. Bebida");
        System.out.println("2. Comida");
        System.out.println("3. Poster");
        String choice = s.nextLine();
        switch(choice){
            case("1"):
                registrarBebida(s, data);
            break;
            case("2"):
                registrarComida(s, data);
            break;
            case("3"):
                registrarPostre(s, data);
            break;
            default:
                System.out.println("Elige una opcion valida");
            break;
        }
        s.close();
    }
    
    private void registrarBebida(Scanner s, RestauranteData data){
        Bebida b = new Bebida();
        System.out.println("Como se llama la bebida?");
        b.setNombre(s.nextLine());
        System.out.println("Cual es el precio?");
        b.setPrecio(Integer.parseInt(s.nextLine()));
        data.addPlatillo(b);
        
    }
    private void registrarComida(Scanner s, RestauranteData data){
        Comida b = new Comida();
        System.out.println("Como se llama la comida?");
        b.setNombre(s.nextLine());
        System.out.println("Cual es el precio?");
        b.setPrecio(Integer.parseInt(s.nextLine()));
        data.addPlatillo(b);
        
    }
    private void registrarPostre(Scanner s, RestauranteData data){
        Postre b = new Postre();
        System.out.println("Como se llama el postre?");
        b.setNombre(s.nextLine());
        System.out.println("Cual es el precio?");
        b.setPrecio(Integer.parseInt(s.nextLine()));
        data.addPlatillo(b);
    }
}
