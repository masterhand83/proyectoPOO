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
public class Restaurante {
    private String nombre;
    private String direccion;
    private String telefono;
    private ArrayList<Pedido> pedidos;
    private ArrayList<IReceta> recetas;
    
    public Restaurante(){
        pedidos = new ArrayList();
        recetas = new ArrayList();
    }
    
    public String getDatosRestaurante(){
        if (isDataIncomplete()){
            return "FALTA INFORMACION";
        }
        
        return ""
                + "+"+ "-".repeat(12 + getLargerLength() + 4)+"+\n"
                + "| Nombre: " + this.nombre      + "     |\n"
                + "| Dirección: "+ this.direccion + "     |\n"
                + "| Telefono: " + this.telefono  + "     |\n"
                + "+"+ "-".repeat(12 + getLargerLength() + 3)+"+\n";
    }
    
    public boolean isDataIncomplete(){
        return nombre.isEmpty() || direccion.isEmpty() || telefono.isEmpty();
    }
    
    private int getLargerLength(){
        int nombrel = this.nombre.length();
        int direl = this.direccion.length();
        int tefel = this.telefono.length();
        return Math.max(nombrel, Math.max(tefel, direl));
    }

    public void addPedido(Pedido p){
        this.pedidos.add(p);
    }
    
    public void addReceta(IReceta r){
        this.recetas.add(r);
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public ArrayList<IReceta> getRecetas() {
        return recetas;
    }

    public void setRecetas(ArrayList<IReceta> recetas) {
        this.recetas = recetas;
    }
    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    

    
}
