
public class crearCuenta {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta(01, 123456);
		
		
		Cuenta segundaCuenta = new Cuenta(02, 987654);
		
		System.out.println(primeraCuenta.obtenerSaldo());
	}
}
