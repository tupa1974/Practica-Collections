package autos;

/*
 Crear una stack que permita objetos de tipo Autos, donde cada objeto auto debe
 tener: num_patente, marca, modelo, color, chasis.
 */
public class Auto {

    private int num_patente;
    private String marca;
    private String modelo;
    private String color;
    private boolean chasis;

    public Auto(int num_patente, String marca, String modelo, String color, boolean chasis) {
	this.num_patente = num_patente;
	this.marca = marca;
	this.modelo = modelo;
	this.color = color;
	this.chasis = chasis;
    }

    public Auto() {
    }

    public int getNum_patente() {
	return num_patente;
    }

    public void setNum_patente(int num_patente) {
	this.num_patente = num_patente;
    }

    public String getMarca() {
	return marca;
    }

    public void setMarca(String marca) {
	this.marca = marca;
    }

    public String getModelo() {
	return modelo;
    }

    public void setModelo(String modelo) {
	this.modelo = modelo;
    }

    public String getColor() {
	return color;
    }

    public void setColor(String color) {
	this.color = color;
    }

    public boolean isChasis() {
	return chasis;
    }

    public void setChasis(String tieneChasis) {
	this.chasis = "si".equals(tieneChasis.toLowerCase());
    }

    @Override
    public String toString() {
	return "\nAuto {"
	    + "\nnum_patente = " + num_patente
	    + ",\n marca = " + marca
	    + ", \nmodelo = " + modelo
	    + ", \ncolor = " + color
	    + ", \nchasis = " + chasis
	    + "\n}";
    }

}
