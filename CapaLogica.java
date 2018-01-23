package abstraccion;

public class CapaLogica {

	Categoria lista[]; // lista es un array de la clase categoria o tipo de dato de catagoria

	public CapaLogica(int tamano) {

		lista = new Categoria[tamano];
	}
	
	public CapaLogica() {
		
	}
	
	public void iniListaSetTamano(int _tamano) {
		lista = new Categoria[_tamano];
	}

	public void ingresarData(String identificacion, String nombre, String descripcion, int _posicion) {

		Categoria miCategoria = new Categoria(identificacion, nombre, descripcion);
		lista[_posicion] = miCategoria;
		

	}

	public String imprimirLista() {
				
		String listas = "";
		
		for (int i = 0; i < lista.length; i++) {
			
			String info= ("El nombre es : "+ lista[i].nombre+ " La descripcion es : " + lista[i].descripcion +" La identificacion es : "+ lista[i].identificacion);
			listas = listas + "\n" + info;
		}
		return listas;
	}

}
