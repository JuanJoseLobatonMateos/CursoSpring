package es.pildoras.IoC;

public class DirectorEmpleado implements Empleados {
	
	private String email;
	private String nombreEmpresa;
	
	
	private CreacionInformes informeNuevo;

	public void setInformeNuevo(CreacionInformes informeNuevo) {
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


	//Creacion de constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		
		this.informeNuevo=informeNuevo;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestinar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director: "+informeNuevo.getInforme();
	}
	
	//metodo init. Ejecutar tareas antes de que el bean este disponible
	
	private void init() {
		System.out.println("Dentro del metodo init."
				+ " Aqui irian las tareas a ejecutar antes de que el bean este listo");

	}
	
	
	//metodo destroy. Ejecutar tareas depues de que el bean sea eliminado
	private void destroy() {
		System.out.println("Dentro del metodo destroy."
				+ " Aqui irian las tareas a ejecutar despuyes de usar el bean");

	}
}
