package es.cursoSpring.IoC;

public class JefeEmpleado implements Empleado{

	private CreacionInformes informeNuevo;
	
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	
	public String getTareas() {
		return "Gestiono las cuestiones relativas a mis empleados de seccion";
	}

	@Override
	public String getInforme() {

		return "Informe presentado por el jefe: " + informeNuevo.getinforme();
	}

}
