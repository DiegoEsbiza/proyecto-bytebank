
public class testReferencia {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta(07, 943167);
		primeraCuenta.depositar(200);
		
		Cuenta segundaCuenta = primeraCuenta;
		segundaCuenta.depositar(100);
		System.out.println("Saldo primera Cuenta:" + primeraCuenta.obtenerSaldo());
		
		System.out.println("Saldo segunda Cuenta:" + segundaCuenta.obtenerSaldo());
		
		segundaCuenta.depositar(400);
		
		System.out.println("Saldo primera Cuenta:" + primeraCuenta.obtenerSaldo());
	}
}
