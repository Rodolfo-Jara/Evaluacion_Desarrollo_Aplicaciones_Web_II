package org.cibertec.edu.pe.model;

public class OrderDetail {
	private Integer id;
	private String nombre;
	private double cantida;
	private double precio;
	private double total;
	public OrderDetail() {
		
	}
	public OrderDetail(Integer id, String nombre, double cantida, double precio, double total) {
		
		this.id = id;
		this.nombre = nombre;
		this.cantida = cantida;
		this.precio = precio;
		this.total = total;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getCantida() {
		return cantida;
	}
	public void setCantida(double cantida) {
		this.cantida = cantida;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", nombre=" + nombre + ", cantida=" + cantida + ", precio=" + precio
				+ ", total=" + total + "]";
	}
	
	
}
