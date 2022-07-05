package ejercicioEmpresa;

import java.util.ArrayList;

public class Empresa {
	
	ArrayList<Empleado> empleados;
	
	
	public Empresa() {
		this.empleados = new ArrayList<>();
	}
	
	public void agregarNuevoEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}

	public void mostrarSalarios() {
		for (Empleado empleado : empleados) {
			System.out.println(empleado.nombreCompleto() + ": $" + empleado.getSalario());
		}
	}
	
	public Empleado empleadoConMasClientes() {
		int maxClientes = -1;
		Empleado elmayor = null;
		for (Empleado empleado : empleados) {
			if (empleado instanceof EmpleadoAComision) {
				EmpleadoAComision eac = (EmpleadoAComision) empleado;
				int cant = eac.getCantClienteCaptados();
				if (cant > maxClientes) {
					maxClientes = cant;
					elmayor = eac;
				}
			}
		}
		return elmayor;
		
	}
}
