package cl.inacap.zCapModel.dto;

import java.time.LocalDate;

public class Juego {

private String nombre;
private String descripici�n;
private boolean aptoNinios;
private int precio;
private LocalDate fechaLanzamiento;
private Consola consola;
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDescripici�n() {
	return descripici�n;
}
public void setDescripici�n(String descripici�n) {
	this.descripici�n = descripici�n;
}
public boolean isAptoNinios() {
	return aptoNinios;
}
public void setAptoNinios(boolean aptoNinios) {
	this.aptoNinios = aptoNinios;
}
public int getPrecio() {
	return precio;
}
public void setPrecio(int precio) {
	this.precio = precio;
}
public LocalDate getFechaLanzamiento() {
	return fechaLanzamiento;
}
public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
	this.fechaLanzamiento = fechaLanzamiento;
}
public Consola getConsola() {
	return consola;
}
public void setConsola(Consola consola) {
	this.consola = consola;
}
}