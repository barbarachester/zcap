package cl.inacap.zCapModel.dto;

import java.time.LocalDate;

public class Juego {

private String nombre;
private String descripición;
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
public String getDescripición() {
	return descripición;
}
public void setDescripición(String descripición) {
	this.descripición = descripición;
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