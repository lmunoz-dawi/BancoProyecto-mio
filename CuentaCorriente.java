public class CuentaCorriente extends CuentaBancaria{
    public CuentaCorriente(String iban, double saldo) {
        super(iban, saldo);
    }
    public void calcularIntereses(){
        double interes = this.getSaldo() * (interesAnualBasico / 100.0);
        this.ingresar(interes);
    }
    public void mostrar(){
        System.out.println("Iban: " + this.getNumeroCuenta() + '\n' + "Saldo: " + this.getSaldo());
    }
}
