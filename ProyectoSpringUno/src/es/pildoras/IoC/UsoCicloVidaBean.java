package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//cargar el xml de configuracion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		//Obtencion del bean
		
		Empleados Juan=contexto.getBean("miEmpleado",Empleados.class);
		
		
		System.out.println(Juan.getInforme());
		//Cerrar el contexto
		contexto.close();
	}

}
