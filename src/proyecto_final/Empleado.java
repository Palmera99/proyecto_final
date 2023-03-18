package proyecto_final;

public class Empleado extends Persona {
	private String Fecha_ingreso;
	private String Cargo;
	public Empleado(String rut, String nombre, String apellido, String direccion, String telefono, String Fecha_ingreso, String Cargo) {
		super(rut, nombre, apellido, direccion, telefono);
		this.Fecha_ingreso = Fecha_ingreso;
		this.Cargo = Cargo;
	}
	public String getFecha_ingreso() {
		return Fecha_ingreso;
	}
	public void setFecha_ingreso(String fecha_ingreso) {
		Fecha_ingreso = fecha_ingreso;
	}
	public String getCargo() {
		return Cargo;
	}
	public void setCargo(String cargo) {
		Cargo = cargo;
	}

}
