package EJERCICIO1;

public class Empleado extends Persona {
	private int legajo;
	String Puesto;
	private static int cont=1000;
	
	//constructor
	public Empleado() {
	    super();
	    cont++;
	    this.legajo = cont;
	}

	public Empleado(String dni , String nombre , String apellido , java.time.LocalDate fechadenacimiento , 
	 		String genero , String email , String direccion , String telefono , String puesto) {
	    super(dni, nombre, apellido, fechadenacimiento, genero, email, direccion, telefono);
	    cont++;
	    this.legajo = cont;
	    this.Puesto = puesto;
	}

	//metodos
	public static int devuelveProximoLegajo() {
		return cont++;
	}

	//GETTER Y SETTER
	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getPuesto() {
		return Puesto;
	}

	public void setPuesto(String puesto) {
		Puesto = puesto;
	}

	// metodo toString
	@Override
	public String toString() {
		return "Empleado [legajo=" + legajo + ", Puesto=" + Puesto + "]";
	}
	
	
	
}
