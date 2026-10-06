//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    CuentaBancaria cuenta = new CuentaBancaria(
            "000123456789",
            "Tomas",
            50000
    );

    CajeroAutomatico cajero = new CajeroAutomatico(cuenta);

    System.out.println("Saldo inicial: $" + cuenta.saldo);

    cajero.extraerDinero(20000);

    cajero.extraerDinero(40000);

    System.out.println("Saldo final: $" + cuenta.saldo);
}
