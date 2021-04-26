package cl.inacap.zCapModel.dto;
Import.java

public class Consola {
private String nombre;
private String marca;
private int aniodelanzamiento;
private list <Juego> juegos;
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public int getAniodelanzamiento() {
	return aniodelanzamiento;
}
public void setAniodelanzamiento(int aniodelanzamiento) {
	this.aniodelanzamiento = aniodelanzamiento;
}
public list<Juego> getJuegos() {
	return juegos;
}
public void setJuegos(list<Juego> juegos) {
	this.juegos = juegos;
}
}
