
public class PrincipalHer {

	public static void main(String[] args) {
		ImplAlumno impAl = new ImplAlumno();
		ImplDEsayuno implDe = new ImplDEsayuno();

		Alumno alumno = null;
		Desayuno desayuno = null;

		// Guardar datos
		desayuno = new Desayuno("Barbacoa", 500, 1);
		implDe.guardar(desayuno);
		
		desayuno = new Desayuno("HotCake", 15, 3);
		implDe.guardar(desayuno);
		
		implDe.mostrar();
		
		desayuno = new Desayuno("Barbacoa");
		desayuno = (Desayuno) implDe.buscar(desayuno);
		
		alumno = new Alumno("Axel", "Garcia", 23, desayuno);
		impAl.guardar(alumno);
		
		impAl.mostrar();
		
	}
}
