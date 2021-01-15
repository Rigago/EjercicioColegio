package garcia.rita.colegio;

public class Alumno {
	private final String nombre;
	private double notaMedia;
	private  int IdAlumno;
	private static int IdSiguiente = 1;
	
	// Constructor. Asigna un Id a cada alumno nuevo.
	public Alumno(String nombre, double notaMedia) {	
		this.nombre = nombre;
		this.notaMedia = notaMedia;
		IdAlumno = IdSiguiente;
		IdSiguiente++;
	}
	
	// Método para establecer una nueva nota media.
	public void setNotaMedia(double nuevaNota) {
		notaMedia = nuevaNota;
	}
	
	// Método que devuelve el nombre de un alumno.
	public String getNombreAlumno(){
		return nombre;
	}
	
	// Método que devuelve el ID de un alumno.
	public String getIdAlumno() {
		return "" + IdAlumno;
	}
	
	// Método que devuelve la nota media de un alumno.
	public String getNotaMedia() {
		return "" + notaMedia;
	}
}
