/*
 * INSTITUTO POLITECNICO NACIONAL
 * ESCUELA SUPERIOR DE COMPUTO
 * Materia: [MATERIA]
 * Grupo: [GRUPO]
 * Profesor: [Profesor]
 * Alumno(s): Santiago Apreza Robin Miguel
 * [Uso y proposito de la clase]
 */
package proyectopoo;

import mainmenu.MainMenu;

/**
 *
 * @author Skynet
 */
public class ProyectoPOO {
    static MainMenu menu;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu = new MainMenu();
        menu.process();
    }
    
}
