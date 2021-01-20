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
public class RestauranteData {
    private Restaurante restaurante;
    private ArrayList<Repartidor> repartidores;
    
    public RestauranteData(){
        restaurante = new Restaurante();
        repartidores = new ArrayList<>();
        
    }
    
    public void addRepartidor(Repartidor r){
        this.repartidores.add(r);
    }
    
    public void addPlatillo(IReceta re){
        this.restaurante.addReceta(re);
    }
    
    public void addPedido(Pedido p){
        this.restaurante.addPedido(p);
    }
    
    public ArrayList<IReceta> getPlatillos(){
      return this.restaurante.getRecetas();
    }
    
    public ArrayList<Pedido> getPedidos(){
        return this.restaurante.getPedidos();
    }
    
    public String getRepartidorList(){
        if (this.repartidores.size() <= 0){
            return "NO HAY REPARTIDORES";
        }
        String res = "";
        for(int i = 0; i < this.repartidores.size(); i++){
            Persona p = this.repartidores.get(i);
            res += String.valueOf(i)+". "+ p.getInfo();
        }
        return res;
    }
    
    public String getPlatilloList(){
        ArrayList<IReceta> platillos = getPlatillos();
        if (platillos.size() <= 0){
            return "NO HAY REPARTIDORES";
        }
        String res = "";
        for(int i = 0; i < platillos.size(); i++){
            IReceta r = platillos.get(i);
            res += String.valueOf(i)+". "+ r.getInfo();
        }
        return res;
    }

    public ArrayList<Repartidor> getRepartidores() {
        return repartidores;
    }
    
    public Repartidor getRepartidor(int i){
        return this.repartidores.get(i);
    }
    public IReceta getReceta(int i){
        return this.getPlatillos().get(i);
    }
}
