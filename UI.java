package abstraccion;

import java.io.*;
import abstraccion.CapaLogica;
import abstraccion.Categoria;;

public class UI {

	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static PrintStream out = System.out;

	static CapaLogica cl = new CapaLogica();

	public static void main(String[] args) throws IOException {

		int opc = 0; // para inicializar
		boolean continuar = true;

		do {
			mostrarMenu();
			opc = leerOpcion();
			continuar = ejecutarAccion(opc);
		} while (continuar);

	}

	public static void mostrarMenu() {
		out.println("\n\n Menu");
		out.println("--------------------------------------");
		out.println("1 - Pedir Tamaño");
		out.println("2 - Rellenar el array");
		out.println("3 - Imprimir el array n");
		out.println("4 - Detenerse");
		out.print("\nSelect a Menu Option: ");
	}

	static int leerOpcion() {
			int opcion;
			opcion = 0;
			try {	
				// leer los datos del usuario
				
				opcion = Integer.parseInt(in.readLine());
			}catch (Exception e) {
				// TODO: handle exception
				out.println("Por Favor Ingrese un dato valido!");
			}
			
			return opcion;
		}

	public static boolean ejecutarAccion(int popcion) throws IOException {
		//Categoria nuevaCategoria = new Categoria();
		boolean noSalir = true;
		switch (popcion) {
		case 1:
			tamannoArreglo();
			break;
		case 2:
			ingresarDatos();
			break;

		case 3:
			listarArreglo();
			break;
		case 4:
			noSalir = false;
			break;
		case 5:
			out.println("error");
		}
		return noSalir;
	}

	public static void tamannoArreglo() throws IOException {
		
		out.println("Ingrese el tamaño del array");
		int tamano = Integer.parseInt(in.readLine());
		cl.iniListaSetTamano(tamano);
	}

	public static void ingresarDatos() throws IOException {

		String identificacion;
		String nombre;
		String descripcion;

		//Categoria miCategoria = new Categoria();
		
		for (int i = 0; i < cl.lista.length; i++) {
			out.println("Ingrese el nombre :");
			nombre = in.readLine();
			out.println("Ingrese la identificacion :");
			identificacion = in.readLine();
			out.println("Ingrese la descripcion :");
			descripcion = in.readLine();

			cl.ingresarData(identificacion, nombre, descripcion, i);
		}

		

	}

	public static void listarArreglo() throws IOException {
		
		System.out.println(cl.imprimirLista());
	}

}
