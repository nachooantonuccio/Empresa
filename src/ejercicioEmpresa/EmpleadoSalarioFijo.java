package ejercicioEmpresa;

public class EmpleadoSalarioFijo extends Empleado {
	
	public static final double PORC1 = 0.05;
	public static final double PORC2 = 0.1;
	public static final int ANIO1 = 2;
	public static final int ANIO2 = 5;
	private double sueldoBasico;

	@Override
	public double getSalario() {
		// TODO Auto-generated method stub
		return sueldoBasico + sueldoBasico * porcAdicional();
		
	}

	

	public EmpleadoSalarioFijo(String DNI, String nombre, String apellido, int anioIngreso, double sueldoBasico) {
		super(DNI, nombre, apellido, anioIngreso);
		this.sueldoBasico = sueldoBasico;
	}



	private double porcAdicional() {
		int Ant = antiguedadEnAnios();
		double porc = 0;
		
		if (Ant > ANIO2) {
			porc = PORC2;
		} else if (Ant >= ANIO1) {
			porc = PORC1;
		}
		
		return porc;
	}
	
	
}
