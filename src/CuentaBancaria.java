public class CuentaBancaria {
    String cbu;
    String titulares;
    double saldo;

    public CuentaBancaria(String cbu, String titulares, double saldo) {
        this.cbu = cbu;
        this.titulares = titulares;
        this.saldo = saldo;
    }

    public boolean debitar(double monto) {
        if (monto > saldo) {
            return false;
        }

        saldo = saldo - monto;
        return true;
    }

    public void acreditar(double monto) {
        saldo = saldo + monto;
    }
}
