package cuentaBanco;
/**
 * 
 * @author David Esteban Alesón
 */
public class CuentaBanco {
	// realizamos un cambio cualquiera para hacer un segundo commit
	// en nuestro git


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * constructor por defecto 
     * 
     */
    public CuentaBanco()
    {
    }
/**
 * constructor con parámetros
 * @param nom nombre del titular
 * @param cue número de cuenta
 * @param sal saldo inicial
 * @param tipo no usado en el constructor.
 */
    public CuentaBanco(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
/**
 * método para saber el saldo d euna cuenta
 * @return retorna el saldo actual
 */
    public double estado()
    {
        return saldo;
    }
/**
 *  método para hacer un ingreso en cuenta
 * @param cantidad la cantidad de dinero que queremos ingresar
 * @throws Exception arrojará una excepción en caso de que intentemos ingresar negativo
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
/**
 * método para retirar dinero
 * @param cantidad el dinero a retirar
 * @throws Exception arrojará una excepción si tratamos de retirar una cantidad negativa o si no hubiera suficiente saldo
 * 
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

	/** método para saber el nombre del titular
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/** método para alterar el nombre del titular
	 * @param nombre nombre que queramos poner al titular de la cuenta
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/** método para recuperar el número de cuenta
	 * @return la cuenta corriente ( en forma de String )
	 */
	public String getCuenta() {
		return cuenta;
	}

	/** método para setear el número de cuenta
	 * @param cuenta la cuenta para cambiar
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/** método para retornar el saldo.
	 * exactamente igual que getEstado()
	 * @return el saldo actual en cuenta
	 */
	public double getSaldo() {
		return saldo;
	}

	/** método para actualizar el saldo en una cuenta
	 * @param saldo el nuevo saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/** método para fijar el tipo de interés aplicable en la CC
	 * @return el tipoInterés
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/** método para establecer el tipo de interes
	 * @param tipoInterés el nuevo tipo de interés
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
