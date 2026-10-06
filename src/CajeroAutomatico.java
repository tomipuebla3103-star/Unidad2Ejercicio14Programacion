public class CajeroAutomatico {
    CuentaBancaria cuentaActiva;

    public CajeroAutomatico(CuentaBancaria cuentaActiva) {
        this.cuentaActiva = cuentaActiva;
    }

    public void extraerDinero(double monto) {
        boolean resultado = cuentaActiva.debitar(monto);

        if (resultado) {
            System.out.println("Extracción realizada correctamente.");
            System.out.println("Monto extraído: $" + monto);
        } else {
            System.out.println("Extracción rechazada.");
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositarDinero(double monto) {
        cuentaActiva.acreditar(monto);
        System.out.println("Depósito realizado correctamente.");
    }
}
