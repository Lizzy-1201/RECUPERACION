package gt.edu.examen4.Ordenes.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gt.edu.examen4.Ordenes.model.OrdenIngresada;
import gt.edu.examen4.Ordenes.service.OrdenIngresadaService;

/**
 * Servlet implementation class ProcesarServlet
 */
@WebServlet(urlPatterns = {"/ProcesarServlet"}, name = "ProcesarServlet", description = "ProcesarServlet returns json" )
public class ProcesarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private OrdenIngresadaService service = new OrdenIngresadaService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcesarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        try (PrintWriter out = response.getWriter()) {
            out.println(getOrdenespendientes());
        }
    }

    private String getOrdenespendientes() {
    	service = new OrdenIngresadaService();
         int i = 0;
         StringBuffer json = null;
         json = new StringBuffer("[\n");
         for(OrdenIngresada OrdenIngresada : service.getOrdenes()){
             json.append("\t{\n");
             json.append("\t\t\"numorden\":"+OrdenIngresada.getNumorden()+",\n");
             json.append("\t\t\"cliente\":\""+OrdenIngresada.getCliente()+"\",\n");
             json.append("\t\t\"producto\":\""+OrdenIngresada.getProducto()+"\",\n");
             json.append("\t\t\"cantidad\":"+OrdenIngresada.getCantidad()+",\n");
             json.append("\t\t\"preciouni\":"+OrdenIngresada.getPreciouni()+",\n");
             json.append("\t\t\"costoenvio\":"+OrdenIngresada.getCostoenvio()+",\n");
             json.append("\t\t\"total\":"+OrdenIngresada.getTotal()+",\n");
             json.append("\t\t\"estado\":"+OrdenIngresada.getEstado()+"\n");
             i++;
             if(i < service.getOrdenes().size()){
                 json.append("},\n");
             } else {
                 json.append("}\n");
             }
         }
         json.append("]");
         
         return json.toString();
     }
	}


	private String muestraJSON(){
        int i = 0;
        StringBuffer json = null;
            json = new StringBuffer("[\n");
            for(i=0; i < 5; i++){
                json.append("\t");
                json.append("{\n");
                json.append("\t\t\"name\": \"JAVA\"\n");
                json.append("\t");
                if((i+1)<5){
                    json.append("},\n");
                } else {
                    json.append("}\n");
                }
                
            }
            json.append("]");
        return json.toString();
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List <OrdenIngresada> ordenes = new ArrayList <>();
		ordenes = service.getOrdenes();
		
		Gson gson = new Gson ();
		String OrdenIngresadaJSON = gson.tojson(ordenes);
		
		PrintWriter printwriter = response.getWriter();
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		try(PrintWriter out = response.getWriter()){
			printwriter.write(OrdenIngresadaJSON);
			printwriter.close();
        }
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String estado = es.getParameter("estado");
	
	}

}
