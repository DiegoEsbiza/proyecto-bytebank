
public class pruebaEncapsulamiento {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(04, 546321);
		Cliente cliente = new Cliente();
		cliente.setNombre("Diego");
		cliente.setDocumento("36426808");
		
		cuenta.setTitular(cliente);
		
		Cliente titular = cuenta.getTitular();
		System.out.println(cliente);
		System.out.println(cuenta.getTitular());
		System.out.println(titular);
		
		
				
	}
}
