package gt.edu.examen4.Ordenes.model;

public class OrdenIngresada {
	private int numorden;
    private String cliente;
    private String producto;
    private Double cantidad;
    private Double preciouni;
    private Double costoenvio;
    private Double total;
    private int estado;
    
    
    // Constructor
    public OrdenIngresada(int numorden, String cliente, String producto, Double cantidad, Double preciouni,
			Double costoenvio, Double total, int estado) {
		super();
		this.numorden = numorden;
		this.cliente = cliente;
		this.producto = producto;
		this.cantidad = cantidad;
		this.preciouni = preciouni;
		this.costoenvio = costoenvio;
		this.total = total;
		this.estado = estado;
	}
    
	// Getters y setters
	public int getNumorden() {
		return numorden;
	}
	public void setNumorden(int numorden) {
		this.numorden = numorden;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public Double getCantidad() {
		return cantidad;
	}
	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}
	public Double getPreciouni() {
		return preciouni;
	}
	public void setPreciouni(Double preciouni) {
		this.preciouni = preciouni;
	}
	public Double getCostoenvio() {
		return costoenvio;
	}
	public void setCostoenvio(Double costoenvio) {
		this.costoenvio = costoenvio;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
    
    
    
}
