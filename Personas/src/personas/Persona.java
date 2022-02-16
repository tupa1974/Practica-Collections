package personas;

public class Persona {
    
/* Crear una clase persona que tenga los siguientes atributos: dni, nombre, apellido, dirección, celular,
    edad (tener en cuenta todos sus atributos, constructores y métodos getters y setters). 
 */
    
    private int  dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private long celular;
    private int edad;

    public Persona(int dni, String nombre, String apellido, String direccion, long celular, int edad) {
	this.dni = dni;
	this.nombre = nombre;
	this.apellido = apellido;
	this.direccion = direccion;
	this.celular = celular;
	this.edad = edad;
    }

    Persona() {

    }

    public int getDni() {
	return dni;
    }

    public void setDni(int dni) {
	this.dni = dni;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public String getApellido() {
	return apellido;
    }

    public void setApellido(String apellido) {
	this.apellido = apellido;
    }

    public String getDireccion() {
	return direccion;
    }

    public void setDireccion(String direccion) {
	this.direccion = direccion;
    }

    public long getCelular() {
	return celular;
    }

    public void setCelular(long celular) {
	this.celular = celular;
    }

    public int getEdad() {
	return edad;
    }

    public void setEdad(int edad) {
	this.edad = edad;
    }

    @Override
    public String toString() {
	return "\nNombre = " + nombre + ",\nApellido = " + apellido + ", \nEdad = " + edad ;
    }
    
    
}
