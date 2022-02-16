package personas;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Personas {

    /*
     Crear una clase persona que tenga los siguientes atributos: dni, nombre,
     apellido, dirección, celular, edad (tener en cuenta todos sus atributos,
     constructores y métodos getters y setters). A partir de ello:

     a. Crear una LinkedList de tipo Persona y agregar 20 personas distintas.

     b. Crear dos LinkedLists de tipo Persona diferentes a la primera, una para
     almacenar a los menores de edad y otra para los mayores.

     c. Recorrer la lista principal buscando a las personas que sean mayores de
     18 años. En caso que una persona tenga o sea mayor a 18 años, agregarla a
     la lista de mayores, caso contrario agregarla a una lista de menores.

     d. Una vez realizada la separación, recorrer ambas nuevas listas y mostrar
     por pantalla el nombre, apellido y edad de cada una de las personas
     contenidas en cada lista.


     */
    public static void main(String[] args) {
	List<Persona> listaPersonas = new LinkedList<Persona>();
	List<Persona> listaMenores = new LinkedList<Persona>();
	List<Persona> listaMayores = new LinkedList<Persona>();

	Scanner teclado = new Scanner(System.in);

	for (int i = 0; i < 2; i++) {
	    listaPersonas.add(new Persona());
	}

	for (Persona persona : listaPersonas) {
	    System.out.print("Ingrese el dni de a persona: ");
	    persona.setDni(teclado.nextInt());
	    teclado.nextLine(); 
	    System.out.print("Ingrese el nombre de la persona: ");
	    persona.setNombre(teclado.nextLine());
	    System.out.print("Ingrese el apellido de la persona: ");
	    persona.setApellido(teclado.nextLine());
	    System.out.print("Ingrese la dirección de la persona: ");
	    persona.setApellido(teclado.nextLine());
	    System.out.print("Ingrese el celular de la persona: ");
	    persona.setCelular(teclado.nextLong());
	    System.out.print("Ingrese la edad de la persona: ");
	    persona.setEdad(teclado.nextInt());
	    teclado.nextLine();

	}

	for (Persona persona : listaPersonas) {
	    if (persona.getEdad() > 18) {
		listaMayores.add(persona);
		System.out.println("edad " + persona.getEdad());
	    }
	    else {
		listaMenores.add(persona);
		System.out.println("edad " + persona.getEdad());
	    }
	}
	System.out.println("\nLista de Mayores");
	for (Persona mayor : listaMayores) {
	    System.out.println(mayor.toString());
	}
	System.out.println("\nLista de Menores");
	for (Persona menor: listaMenores) {
	    System.out.println(menor.toString());
	}

    }

}
