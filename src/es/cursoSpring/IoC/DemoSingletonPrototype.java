package es.cursoSpring.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoSingletonPrototype {
	
	public static void main(String[] args) {
		
		//carga de XML de configuracion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//peticion debeans al contenedor
		SecretarioEmpleado mary = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		SecretarioEmpleado peter = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
	
		System.out.println(mary);
		
		System.out.println(peter);
		
		if(mary == peter) System.out.println("Apuntan al mismo objeto");
		else System.out.println("No se trata del mismo objeto");
		
	}

}
