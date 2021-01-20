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
import restaurante.RestauranteData;

/**
 *
 * @author Santiago Apreza Robin Miguel
 */
public class RegisterRestaurante extends SubMenu {

    @Override
    void process(RestauranteData data) {
        Scanner s = new Scanner(System.in);
        System.out.println("Anota El nombre del restaurante");
        data.setNombre(s.nextLine());
        System.out.println("Anota la direccion del restaurante");
        data.setDireccion(s.nextLine());
        System.out.println("Anota el telefono del restaurante");
        data.setTelefono(s.nextLine());
    }

}
