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

import java.util.ArrayList;

/**
 *
 * @author Santiago Apreza Robin Miguel
 */
public class Pedido {
    private String domicilio;
    private String metodoPago;
    private Persona cliente;
    private Persona repartidor;
    private ArrayList<IReceta> platillos;
    
    

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public Persona getRepartidor() {
        return repartidor;
    }

    public void setRepartidor(Persona repartidor) {
        this.repartidor = repartidor;
    }

    public ArrayList<IReceta> getPlatillos() {
        return platillos;
    }

    public void setPlatillos(ArrayList<IReceta> platillos) {
        this.platillos = platillos;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
    
    public void addPlatillo(IReceta p){
        platillos.add(p);
    }
    
    
}
