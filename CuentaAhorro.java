public class CuentaAhorro extends CuentaBancaria{
    private final double saldoMinimo = 3000;
    public CuentaAhorro(String iban, double saldo) {
        super(iban, saldo);
    }

    public void calcularInteres(){
        double interes;
        if(this.getSaldo() < saldoMinimo) {
            interes = this.getSaldo() * ((interesAnualBasico / 2.0) / 100.0);
        } else {
            interes = this.getSaldo() * ((interesAnualBasico * 2.0) / 100.0);
        }
        this.ingresar(interes);
    }
    public void mostrar(){
        System.out.println("Iban: " + this.getNumeroCuenta() + '\n' + "Saldo: " + this.getSaldo());
    }

}
