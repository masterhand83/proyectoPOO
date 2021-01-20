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
import restaurante.IReceta;
import restaurante.RestauranteData;

/**
 *
 * @author Santiago Apreza Robin Miguel
 */
public class MenuList extends SubMenu{

    @Override
    void process(RestauranteData data) {
        ArrayList<IReceta> recetas = data.getPlatillos();
        if (recetas.size() <= 0){
            System.out.println("Sin platillos");
            return;
        }
        for (IReceta r: recetas){
            System.out.println(r.getInfo());
        }
    }

}
