package ejercicioEmpresa;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Empresa e = new Empresa();
		
		e.agregarNuevoEmpleado(new EmpleadoSalarioFijo("12345678", "Pepe", "Di Carlo", 2021, 21000));
		e.agregarNuevoEmpleado(new EmpleadoSalarioFijo("12342345", "Ariel", "Lopez", 2022, 22456));
		e.agregarNuevoEmpleado(new EmpleadoAComision("12341234", "Juan", "Gonzalez", 2014, 25664,100,500));
		e.agregarNuevoEmpleado(new EmpleadoSalarioFijo("11345678", "Pedro", "Di Maria", 2019, 21040));
		e.agregarNuevoEmpleado(new EmpleadoAComision("15312448", "Jose", "Ruben", 2017, 22340,200,100));
		
		e.mostrarSalarios();
		System.out.print(e.empleadoConMasClientes().nombreCompleto());
		
	}

}
