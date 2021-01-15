package garcia.rita.colegio;

public class UsoColegio {

	public static void main(String[] args) {
		
		Colegio SanJavier = new Colegio("San Javier", 200);
		Colegio Cervantes = new Colegio("Cervantes", 300);
		
		SanJavier.nuevoAlumno("Juan", 8.5);
		SanJavier.nuevoAlumno("Sara", 9);
		
		SanJavier.getTodosAlumnos();
		
		SanJavier.getDatosAlumno("Sara");
			
		Cervantes.nuevoAlumno("Ana", 5);
		Cervantes.nuevoAlumno("Antonio", 7);
		Cervantes.nuevoAlumno("María", 3);
		
		Cervantes.getTodosAlumnos(); 
		
		Cervantes.expulsaAlumno("Antonio");
		
		Cervantes.setNotaMedia("María", 8); 
		
		Cervantes.getTodosAlumnos(); 
	}
}
