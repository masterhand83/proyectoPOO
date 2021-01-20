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
import restaurante.Cliente;
import restaurante.IReceta;
import restaurante.Pedido;
import restaurante.Repartidor;
import restaurante.RestauranteData;

/**
 *
 * @author Santiago Apreza Robin Miguel
 */
public class MenuPedido extends SubMenu  {
    public MenuPedido(){
        
    }

    @Override
    void process(RestauranteData data) {
        if (data.getPlatillos().size() <= 0){
            System.out.println("NO HAY PLATILLOS DISPONIBLES");
            return;
        }
        if (data.getRepartidores().size() <= 0){
            System.out.println("NO HAY REPARTIDORES DISPONIBLES");
            return;
        }
        Scanner s = new Scanner(System.in);
        Pedido p = new Pedido();
        
        System.out.println("Cual es el nombre del cliente:");
        String cName = s.nextLine();
        Cliente c = new Cliente(cName);
        p.setCliente(c);
        
        
        System.out.println("Elige el platillo que desees");
        System.out.println(data.getPlatilloList());
        int pChoice = Integer.parseInt(s.nextLine());
        IReceta pl = data.getReceta(pChoice);
        
        p.addPlatillo(pl);
        
        
        System.out.println("Elige un repartidor:");
        System.out.println(data.getRepartidorList());
        int rChoice = Integer.parseInt(s.nextLine());
        Repartidor r = data.getRepartidor(rChoice);
        p.setRepartidor(r);
        
        data.addPedido(p);
        
    }
    
}
