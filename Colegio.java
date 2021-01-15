package garcia.rita.colegio;

public class Colegio {
	private String nombreColegio;
	private Alumno[] cole;
	
	// Constructor
	public Colegio(String nombreColegio, int numeroAlumnos) {
		this.nombreColegio = nombreColegio;
		this.cole = new Alumno[numeroAlumnos];
	}
	
	// Método que agrega un nuevo Alumno al Colegio.
	public void nuevoAlumno(String nombreAlumno, double notaMediaAlumno) {
		for (int i = 0; i < cole.length; i++) {
			if (cole[i] == null) {
				cole[i] = new Alumno(nombreAlumno, notaMediaAlumno);
				break;
			}	
		}
	}
	
	// Obtiene el total de alumnos pertenecientes al un Colegio.
	public void getTodosAlumnos() {
		for (int i = 0; i < cole.length; i++) {
			if (cole[i] != null) {
				Alumno alumn = cole[i];
				imprimeAlumno(alumn);
			}
		}
	}
	
	// Obtiene los datos de un alumno.
	public void getDatosAlumno(String nombreAlumno) {
		for (int i = 0; i < cole.length; i++) {
			if (cole[i] != null) {
				Alumno alumn = cole[i];
				String nom = alumn.getNombreAlumno();
				if (nom.equalsIgnoreCase(nombreAlumno)){
					imprimeAlumno(alumn);
				}
			}
		}
	}
	
	// Elimina a un alumno de un colegio.
	public void expulsaAlumno(String nombreAlumno) {
		for (int i = 0; i < cole.length; i++) {
			if (cole[i] != null) {
				Alumno alumn = cole[i];
				String nombreExpulsado = alumn.getNombreAlumno();
				if (nombreExpulsado.equalsIgnoreCase(nombreAlumno)) {
					cole[i] = null;
				}
			}
		}
	}
	
	// Cambia la nota de un alumno.
	public void setNotaMedia(String nombre, double nuevaNota) {
		for (int i = 0; i < cole.length; i++) {
			if (cole[i] != null) {
				Alumno alumn = cole[i];
				String nom = alumn.getNombreAlumno();
				if (nom.equalsIgnoreCase(nombre)){
					alumn.setNotaMedia(nuevaNota);
				}
			}
		}
	}
	
	// Devuelve el nombre del Colegio
	private String getNombreColegio() {
		return nombreColegio;
	}
	
	// Imprime en consola los datos de un alumno.
	private void imprimeAlumno(Alumno alumn) {
		System.out.println("Nombre alumno: " + alumn.getNombreAlumno());
		System.out.println("Colegio: " + getNombreColegio());
		System.out.println("Nº alumno: " + alumn.getIdAlumno());
		System.out.println("Nota media: " + alumn.getNotaMedia());
		System.out.println();
	}	
}
