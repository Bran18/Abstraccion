package abstraccion;



public class Categoria {

	
	String identificacion;
	String nombre;
	String descripcion;

	// Constructor

	public Categoria() {
		
	}

	public Categoria(String identifiacion, String nombre, String descripcion) {
		this.nombre=nombre;
		this.identificacion=identifiacion;
		this.descripcion=descripcion;
	}
	
	
	
	/*public String toString() {
		 String info;
		 
		 info= ("El nombre es : "+ nombre+ " La descripcion es : " + descripcion +" La identificacion es : "+ identificacion);

		return info;

	}*/
	
	

	
}
