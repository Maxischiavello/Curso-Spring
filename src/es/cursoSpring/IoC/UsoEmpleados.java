package es.cursoSpring.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		DirectorEmpleado maxi = contexto.getBean("miEmpleado", DirectorEmpleado.class);
		
		System.out.println(maxi.getTareas());
		
		System.out.println(maxi.getInforme());
		
		System.out.println("Email: " + maxi.getEmail());
		
		System.out.println("Empresa: " + maxi.getNombreEmpresa());
		
		/*SecretarioEmpleado lionel = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		System.out.println(lionel.getTareas());
		
		System.out.println(lionel.getInforme());
		
		System.out.println("Email: " + lionel.getEmail());
		
		System.out.println("Empresa: " + lionel.getNombreEmpresa());
		*/
		contexto.close();
	}

}
