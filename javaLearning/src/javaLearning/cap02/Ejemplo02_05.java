









public class Ejemplo02_05 {
	public static void main(String[] args) {
		int n = 7;
		System.out.println("1) n: " + n); //aqui n vale 7
		System.out.println("2) ++n: " + ++n);//aqui, primero incremento n y luego lo muestro. al salir de la instruccion, n vale 8
		System.out.println("3) n: " + n);//aqui n vale 8
		System.out.println("4) n++: " + n++);//aqui, primero me muestra el valor de n que es 8, y luego me lo incrementa. El valor de n al salir de la instruccion, seria igual a 9
		System.out.println("5) n: " + n);//aqui n  vale 9
	}
}