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
        System.out.println("LISTA ACTUAL:");
        System.out.println(data.getRepartidorList());
        Scanner s = new Scanner(System.in);
        String res = "";
        Repartidor r = new Repartidor();
        
        System.out.println("Anota el medio de transporte que usara: ");
        res = s.nextLine();
        r.setMedioTransporte(res);
        
        System.out.println("Escribe su calificacion: ");
        int calf = Integer.parseInt(s.nextLine());
        r.setCalificacion(calf);
        
        System.out.println("Anota el tiempo de llegada: ");
        res = s.nextLine();
        r.setTiempoTardanza(res);
        
        data.addRepartidor(r);
        
        System.out.println(data.getRepartidorList());
    }

}
