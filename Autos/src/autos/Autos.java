package autos;

import java.util.Scanner;
import java.util.Stack;

public class Autos {

    /*
     Crear una stack que permita objetos de tipo Autos, donde cada objeto auto
     debe tener: num_patente, marca, modelo, color, chasis. Cargar la pila con 7
     autos diferentes luego hacer lo siguiente:

     a. Buscar un auto de color rojo.

     b. Mostrar el auto que se encuentra en la cima de la pila.

     c. Borrar el auto que se encuentra en la cima de la pila.

     d. Agregar dos nuevos autos a la pila.

     Recorrer la pila mostrando el nuevo contenido luego de las operaciones
     realizadas.
     */
    public static void main(String[] args) {

	Stack<Auto> concesionaria = new Stack<Auto>();
	Scanner teclado = new Scanner(System.in);
	boolean esRojo = false;
	for (int i = 0; i < 7; i++) {
	    Auto auto = new Auto();

	    System.out.println("Ingrese el número de patente : ");
	    auto.setNum_patente(teclado.nextInt());
	    teclado.nextLine();
	    System.out.println("Ingrese la marca del auto : ");
	    auto.setMarca(teclado.nextLine());
	    System.out.println("Ingrese el modelo del auto : ");
	    auto.setModelo(teclado.nextLine());
	    System.out.println("Ingrese el color del auto : ");
	    auto.setColor(teclado.nextLine());
	    if ("rojo".equals(auto.getColor())) {
		esRojo = true;
	    }
	    System.out.println("¿El auto tiene chasis? :");
	    auto.setChasis(teclado.nextLine());

	    concesionaria.push(auto);

	}
	
	System.out.println("\n¿Hay un auto rojo en la concesionaria?. ");
	
	 if(esRojo){ 
	     System.out.println("Hay un auto rojo."); 
	    } 
	 else
	 { 
	     System.out.println("No hay un auto rojo.");
	 }

	// No pude encontrar el auto de color rojo por no poder acceder dentro del 
	// elemento con el metodo search.
	// seguiré intentando mas adelante.
	/*
	 System.out.println("\n¿Hay un auto rojo en la concesionaria?. ");

	 if(concesionaria.search("rojo") > 0){ System.out.println("Hay un auto
	 rojo."+concesionaria.search("rojo")); } else{ System.out.println("No
	 hay un auto rojo."+concesionaria.search("rojo") ); }
	 */
	System.out.println("\nEl auto que esta arriba es: ");
	System.out.println(concesionaria.peek());

	System.out.println("\nBorrando el auto de arriba");
	concesionaria.pop();

	for (int i = 0; i < 2; i++) {
	    Auto auto = new Auto();

	    System.out.println("Ingrese el número de patente : ");
	    auto.setNum_patente(teclado.nextInt());
	    teclado.nextLine();
	    System.out.println("Ingrese la marca del auto : ");
	    auto.setMarca(teclado.nextLine());
	    System.out.println("Ingrese el modelo del auto : ");
	    auto.setModelo(teclado.nextLine());
	    System.out.println("Ingrese el color del auto : ");
	    auto.setColor(teclado.nextLine());
	    System.out.println("¿El auto tiene chasis? :");
	    auto.setChasis(teclado.nextLine());

	    concesionaria.push(auto);

	}
	for (Auto auto : concesionaria) {
	    System.out.println(auto.toString());
	}

    }

}
