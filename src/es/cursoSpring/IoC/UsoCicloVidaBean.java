package es.cursoSpring.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		
		//cargar el xml de configuracion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		
		//obtencion del bean
		Empleado juan = contexto.getBean("miEmpleado", Empleado.class);
		
		System.out.println(juan.getInforme());
		
		//cerrar el contexto
		contexto.close();
	}

}
