package excepciones1;

public class Excepcion1 {

    /*
     Realizar un programa donde se provoque una excepción de tipo “error por
     desbordamiento”. Tratar la excepción mediante los bloques try y catch y
     mostrar un mensaje indicando la situación. Por ejemplo: “Se produjo un
     error por desbordamiento”.
     */
    public static void main(String[] args) {

	int vector[] = new int[5];

	for (int i = 0; i < 10; i++) {
	    try {
		vector[i] = i;
	    }
	    catch (Exception e) {

		System.out.println("La excepcion :\n" + e + "\n te dice que no puedes colocar tantos"
		    + "valores dentro del vector porque superaste su limite de capacidad. ");
	    }
	}
    }

}
