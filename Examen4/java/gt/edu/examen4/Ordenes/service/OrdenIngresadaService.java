package gt.edu.examen4.Ordenes.service;
import java.util.Arrays;
import java.util.List;

import gt.edu.examen4.Ordenes.model.*;

public class OrdenIngresadaService {
	
   public List <OrdenIngresada> getOrdenes(){
	   return Arrays.asList(
			   new OrdenIngresada(10, "Sandy Juarez", "Set de skin care de te verde",1.00, 400.00, 25.00, 425.00, 0),
			   new OrdenIngresada(20, "Samara Mejia", "Set de skin care de flor de cerezo",1.00, 200.00, 25.00, 225.00, 0),
			   new OrdenIngresada(30, "Victor Alvarez", "Taza de Star wars",1.00, 100.00, 25.00, 125.00, 0),
			   new OrdenIngresada(40, "Paola Velasquez", "Set de maquillaje coleccion Mulan",1.00, 350.00, 25.00, 375.00, 0),
			   new OrdenIngresada(50, "Ingrid Por", "Protector solar de Aloe Vera",1.00, 75.00, 25.00, 100.00, 0)
			   );
	   
   }
}
