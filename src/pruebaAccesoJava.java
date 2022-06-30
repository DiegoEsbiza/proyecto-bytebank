
public class pruebaAccesoJava {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(303,147258);
		cuenta.depositar(400);
		cuenta.retirar(300);
		
		System.out.println(cuenta.obtenerSaldo());
		System.out.println(cuenta.getAgencia());
	}
}
