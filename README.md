<img width="389" height="140" alt="WhatsApp Image 2026-10-05 at 23 32 57" src="https://github.com/user-attachments/assets/54ad82b8-e255-4b2f-8b9c-03f296e16aae" />

La Terminal de Autoservicio Bancario (ATM)

 Descripción
Este proyecto consiste en un sistema en Java que simula el funcionamiento de un cajero automático. El cajero envía mensajes a una cuenta bancaria para realizar extracciones y depósitos, mientras que la cuenta se encarga de validar las operaciones y actualizar el saldo.

 Clases
- **CuentaBancaria:** almacena el CBU, los titulares y el saldo. Contiene métodos para debitar y acreditar dinero, validando que las operaciones sean correctas.
- **CajeroAutomatico:** mantiene una referencia a la cuenta bancaria activa y permite realizar operaciones, como extraer dinero o depositar.

 Funcionamiento
En el `main` se crea una cuenta bancaria y un cajero automático asociado a ella. Luego se realizan dos transacciones: una extracción exitosa y otra que es rechazada por no cumplir con las validaciones. Finalmente, se muestran los resultados y el saldo final por consola.

 Recorrido del mensaje
1. El programa crea una cuenta bancaria con sus datos y saldo inicial.
2. Se crea el cajero automático y se asocia con la cuenta.
3. El cajero recibe una solicitud para extraer o depositar dinero.
4. El cajero envía un mensaje a la cuenta bancaria para realizar la operación.
5. La cuenta verifica que el monto sea válido y que haya saldo suficiente para una extracción.
6. Si la operación es válida, se actualiza el saldo. Si no cumple las condiciones, se rechaza.
7. Finalmente, se muestra el resultado de las transacciones y el saldo actualizado.

 Validaciones
La cuenta bancaria controla que los montos sean positivos y que no se pueda extraer más dinero del saldo disponible. También puede verificar los límites permitidos para las operaciones.

 Objetivo
Practicar la comunicación entre objetos en Java, el uso de referencias entre clases, el encapsulamiento de datos y la validación de operaciones bancarias.
