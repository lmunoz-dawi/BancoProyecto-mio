public abstract class CuentaBancaria {
    protected final String iban;
    protected double saldo;
    public static final double interesAnualBasico = 2.5;

    public CuentaBancaria(String iban, double saldo){
        this.iban = iban;
        this.saldo = saldo;
    }

    public String getNumeroCuenta(){
        return this.iban;
    }
    public double getSaldo(){
        return this.saldo;
    }

    public void anyadir(double cantidad){
        this.saldo += cantidad;
    }

    public void ingresar(double cantidad){
        anyadir(cantidad);
    }

    public void retirar(double cantidad){
        anyadir(-cantidad);
    }

    //Este metodo es para pasar dinero de CuentaBancaria a Cuenta Corriente y luego a Cuenta Ahorro
    public void traspasarDinero(double cantidad, CuentaBancaria cc){
        this.retirar(cantidad);
        cc.ingresar(cantidad);
    }
}
