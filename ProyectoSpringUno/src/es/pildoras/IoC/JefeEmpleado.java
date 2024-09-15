package es.pildoras.IoC;

public class JefeEmpleado implements Empleados{
	
	
	public JefeEmpleado(CreacionInformes informeNuevo) {
		super();
		this.informeNuevo = informeNuevo;
	}

	private CreacionInformes informeNuevo;
	public String getTareas()  {
		return "Gestiono las cuestiones relativas a mis empleados de seccion";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe Presentado presentado por el Jefe de los Empleados: "+informeNuevo.getInforme();
	}

}
