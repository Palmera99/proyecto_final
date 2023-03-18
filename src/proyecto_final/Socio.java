package proyecto_final;
import java.util.ArrayList;
import java.util.List;
public class Socio extends Persona {
	
	private String fecha_ingreso;
	private List<Embarcaciones> embarcaciones;

	public Socio(String rut, String nombre, String apellido, String direccion, String telefono, String fecha_ingreso) {
		super(rut, nombre, apellido, direccion, telefono);
		
		this.fecha_ingreso = fecha_ingreso;
		this.embarcaciones = new ArrayList<Embarcaciones>();
	}
	public void AgregarEmbarcacion(Embarcaciones embarcacion) {
		embarcaciones.add(embarcacion);
	}
	public String getFecha_ingreso() {
		return fecha_ingreso;
	}
	public void setFecha_ingreso(String fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}
	public List<Embarcaciones> getEmbarcaciones() {
		return embarcaciones;
	}
	public void setEmbarcaciones(List<Embarcaciones> embarcaciones) {
		this.embarcaciones = embarcaciones;
	}

}
