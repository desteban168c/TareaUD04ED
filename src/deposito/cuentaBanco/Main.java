package cuentaBanco;
public class Main {

    public static void main(String[] args) {
        CuentaBanco cuentaPersonal;
        double saldoActual;
        operativaCuenta();
        //extracted();
    }

    /**
     * @deprecated
     * el método se entiende que no se usará, al pedir que generásemos otro con todo lo relativo
     * al manejo de cuentas.
     * 
     * yo hubiera refactorizado este método, en vez de dejarlo así deprecado..
     * 
     */
	private static void extracted() {
		CuentaBanco cuentaPersonal;
		double saldoActual;
		cuentaPersonal = new CuentaBanco("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuentaPersonal.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuentaPersonal.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuentaPersonal.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
	/**
	 * copia del "extracted" que se emplea para manejar todo lo relativo a la operativa de cuentaPeronal
	 * del main.
	 */
	private static void operativaCuenta() {
		CuentaBanco cuentaPersonal;
		double saldoActual;
		float cantidad = 0.0f;
		cuentaPersonal = new CuentaBanco("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuentaPersonal.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuentaPersonal.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuentaPersonal.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
		
	}
}
