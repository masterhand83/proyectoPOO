/*
 * INSTITUTO POLITECNICO NACIONAL
 * ESCUELA SUPERIOR DE COMPUTO
 * Materia: [MATERIA]
 * Grupo: [GRUPO]
 * Profesor: [Profesor]
 * Alumno(s): Santiago Apreza Robin Miguel
 * [Uso y proposito de la clase]
 */

package restaurante;

/**
 *
 * @author Santiago Apreza Robin Miguel
 */
public class Cliente extends Persona {
    private String nombre;
    private String domicilio;
    private String metodoPago;
    
    public Cliente(String n){
        nombre = n;
    }
    @Override
    String getInfo() {
        return "cliente";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
