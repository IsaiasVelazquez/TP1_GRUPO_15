package EJERCICIO1;

import java.time.LocalDate;

public class Principal {
	
	public static void main(String[] args) {
		
		Empleado [] vecEmpleados= new Empleado[5];
		vecEmpleados[0] = new Empleado("35441999", "Isaias", "Velazquez", LocalDate.of(1991, 8, 11), 
									   "Masculino", "Isa123@gmail.com", "calle 123", "1144556611", "Clarkista");
		vecEmpleados[1] = new Empleado();
		vecEmpleados[2] = new Empleado("45000111", "Brunaco", "Fondati", LocalDate.of(2000, 4, 25), 
				   					   "Masculino", "Bruno@gmail.com", "calle 456", "1144556611", "Programador");
		vecEmpleados[3] = new Empleado();
		vecEmpleados[4] = new Empleado();
		
		for (Empleado empleado : vecEmpleados) {
			System.out.println(empleado.toString());
		}
		System.out.println("El próximo legajo será el " + Empleado.devuelveProximoLegajo());

	}

}
