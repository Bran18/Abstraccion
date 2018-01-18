package abstraccion;

import java.io.*;

public class UI {

	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static PrintStream out = System.out;

	public static void main(String[] args) throws IOException {
		
		
		String nombre;
		String identificacion;
		String descripcion;
		
		out.println("Ingrese el nombre :");
		nombre=in.readLine();
		out.println("Ingrese la identificacion :");
		identificacion=in.readLine();
		out.println("Ingrese la descripcion :");
		descripcion=in.readLine();
		
		Categoria miCategoria;
		miCategoria=new Categoria(); //inializa una variable de categoria (este es el constructor)
		
		miCategoria.nombre=nombre;
		miCategoria.identificacion=identificacion;
		miCategoria.descripcion=descripcion;
		
		out.println(miCategoria.toString());
		
		
	}

}
