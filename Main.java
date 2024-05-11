public class Main {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente("ES6256465847", 1000.0);
        CuentaAhorro ca = new CuentaAhorro("ES9996465847", 3000.0);

        //Mostramos datos de las cuentas
//        System.out.println("CC:");
//        cc.mostrar();
//        System.out.println("");
//        System.out.println("CA:");
//        ca.mostrar();
//        System.out.println("");

        //Ingresamos retiramos y mostramos
//        cc.mostrar(); //HAy 1000
//        ca.mostrar(); // Hay 3000
//        cc.ingresar(1000); //+1000
//        ca.retirar(500); //-500
//        cc.mostrar(); //Habra 2000
//        ca.mostrar(); //Habra 2500

//        //Traspasamos 1000 euros de cc a ca y mostramos
//        cc.traspasarDinero(1000, ca);
//        cc.mostrar(); //Habia 1000 pero como se lo hemos pasado ahora quedan 0
//        ca.mostrar(); //Habia 3000 pero se le pasa 1000 asi que quedan 4000

        //Calculamos intereses y mostramos
//        cc.calcularIntereses();
//        ca.calcularInteres();
//        cc.mostrar();
//        ca.mostrar();
    }
}