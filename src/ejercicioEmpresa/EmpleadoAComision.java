package ejercicioEmpresa;

public class EmpleadoAComision extends Empleado {
	
	
	private double salarioMinimo;
	private int cantClienteCaptados;
	private double montoPorCliente;
	
	
	
	public EmpleadoAComision(String dNI, String nombre, String apellido, int anioIngreso, double salarioMinimo,
			int cantClienteCaptados, double montoPorCliente) {
		super(dNI, nombre, apellido, anioIngreso);
		this.salarioMinimo = salarioMinimo;
		this.cantClienteCaptados = cantClienteCaptados;
		this.montoPorCliente = montoPorCliente;
	}


	@Override
	public double getSalario() {
		// TODO Auto-generated method stub
		double sal = cantClienteCaptados * montoPorCliente;
		
		if (sal < salarioMinimo) {
			sal =  salarioMinimo;
		}
		
		return sal;
		
	}


	public int getCantClienteCaptados() {
		return cantClienteCaptados;
	}

	

}
