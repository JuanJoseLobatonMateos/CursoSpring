package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esta sección está comentada porque no se está usando, pero muestra cómo
		 * crear un objeto de tipo Empleados de manera tradicional (sin Spring).
		 * 
		 * // Creación de objetos tipo empleados sin usar Spring:
		 * Empleados Empleado1 = new DirectorEmpleado();
		 * 
		 * // Uso de los objetos empleados:
		 * System.out.println(Empleado1.getTareas());
		 */

		// 1. Cargar el archivo de configuración de Spring "applicationContext.xml"
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 2. Solicitar un bean de tipo "Empleados" con el ID "miEmpleado" (definido en el XML)
		// Este objeto "Juan" será inyectado por Spring, resolviendo la inversión de control (IoC)
		Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);
		

		// 3. Uso del objeto "Juan": invocar los métodos que proporciona la interfaz Empleados
		// Método que devuelve las tareas del empleado
		System.out.println(Juan.getTareas());

		// Método que devuelve el informe del empleado (se inyecta usando dependencia)
		System.out.println(Juan.getInforme());
		System.out.println("\n\n");

		// 4. Solicitar otro bean de tipo "Empleados" con el ID "miSecretarioEmpleado" (definido en el XML)
		// Creamos un nuevo objeto "Luis" del tipo "Empleados" que está configurado de forma diferente
		SecretarioEmpleado Luis = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado Pablo = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		// 5. Uso del objeto "Luis": invocar métodos para obtener las tareas y el informe
		System.out.println(Luis.getTareas());
		System.out.println(Luis.getInforme());
		System.out.println(Luis.getEmail());
		System.out.println(Luis.getNombreEmpresa());
		
		System.out.println("\n\n");
		
		System.out.println(Pablo.getTareas());
		System.out.println(Pablo.getInforme());
		System.out.println(Pablo.getEmail());
		System.out.println(Pablo.getNombreEmpresa());
		
		DirectorEmpleado Director = contexto.getBean("miEmpleado", DirectorEmpleado.class);
		System.out.println("\n\n");
		
		System.out.println(Director.getTareas());
		System.out.println(Director.getInforme());
		System.out.println(Director.getEmail());
		System.out.println(Director.getNombreEmpresa());
		System.out.println("\n\n");
		
		
		//
		
		// 6. Cerrar el contexto de Spring para liberar recursos
		contexto.close();
	}

}

