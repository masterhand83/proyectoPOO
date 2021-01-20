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
public class Repartidor extends Persona {
    private String medioTransporte;
    private String tiempoTardanza;
    private int calificacion;
    
    @Override
    String getInfo() {
        return "medio de transporte: "+ medioTransporte 
                + ", tiempo tardanza: " + tiempoTardanza
                + ", calificacion: "+String.valueOf(calificacion) + "\n";
    }

    public String getMedioTransporte() {
        return medioTransporte;
    }

    public void setMedioTransporte(String medioTransporte) {
        this.medioTransporte = medioTransporte;
    }

    public String getTiempoTardanza() {
        return tiempoTardanza;
    }

    public void setTiempoTardanza(String tiempoTardanza) {
        this.tiempoTardanza = tiempoTardanza;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    
}
