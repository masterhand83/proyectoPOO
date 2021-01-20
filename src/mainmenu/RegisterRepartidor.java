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
import restaurante.Repartidor;
import restaurante.RestauranteData;

/**
 *
 * @author Santiago Apreza Robin Miguel
 */
public class RegisterRepartidor extends SubMenu {
    @Override
    void process(RestauranteData data) {
        Scanner s = new Scanner(System.in);
        Repartidor r = new Repartidor();
    }

}
