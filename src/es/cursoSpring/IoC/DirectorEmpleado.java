package es.cursoSpring.IoC;

public class DirectorEmpleado implements Empleado {
	
	private CreacionInformes informeNuevo;
	
	private String email;
	
	private String nombreEmpresa;
	
	//Creacion de constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
	
		this.informeNuevo = informeNuevo;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	@Override
	public String getTareas() {

		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {

		return "Informe creado por el Director: " + informeNuevo.getinforme();
	}
	
	// metodo init. Ejecutar tareas antes de que el bean este disponible
	public void metodoInicial() {
		
		System.out.println("Dentro del metodo init. Aca irian las tareas a ejectuar"
				+ " antes de que el bean este listo");
		
	}
	
	//metodo destroy. Ejecutar tareas despues de que el bean haya sido utilizado
	public void metodoFinal() {
		
		System.out.println("Dentro del metodo destroy. Aca irian las tareas a ejectuar"
				+ " despues de utilizar el bean");
	}

}
