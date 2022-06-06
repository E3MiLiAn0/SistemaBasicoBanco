package main;


import modelo.Cliente;
import modelo.CuentaCorriente;
import servicios.ClienteService;
import servicios.CuentaCorrienteService;
import servicios.IPersonaService;

/**
 * Tomando como punto de partida el diagrama de Clases del sistema de Gesti�n
 * Bancaria construya una aplicaci�n que permita realizar las siguientes
 * operaciones:
 *
 *
 * **********MENU PRINCIPAL********** <br>
 * 1) Agregar Cliente<br>
 * 2) Agregar cuenta a Cliente<br>
 * 3) Listar Clientes por sucursal<br>
 * 4) Listar Clientes de una sucursal<br>
 * 5) Extraer dinero<br>.
 * 6) Consultar Saldo<br>.
 * 7) Realizar Deposito<br>.
 * 8) Realizar transferencias<br>
 * 9) Eliminar una sucursal<br>
 *
 *
 *
 */
import java.util.Scanner;
public class SistemaBancario {

     

    public static void main(String[] args) {
        int dniCliente;
        int opcion;
        Scanner teclado= new Scanner(System.in);

        ClienteService clienteService= new ClienteService();
        CuentaCorrienteService cuentaCorrienteService= new CuentaCorrienteService();

            System.out.println("Bienvenido al Login, que desea hacer ???");
            System.out.println("Ingrese el numero que corresponda a la accion:");
            System.out.println("Presiona 1 si sos Cliente");
            System.out.println("Presiona 2 si sos Empleado");

            opcion= teclado.nextInt();

            switch (opcion){

                case 1:
                    System.out.println("Ingrese su DNI");
                    int dni= teclado.nextInt();
                    clienteService.buscar(dni);
                    if (clienteService.buscar(dni).getDni()== dni){
                        System.out.println("login correcto");
                        System.out.println("que quiere hacer'?");
                        System.out.println("Presiona 1 si  quieres extraer dinero");
                        System.out.println("Presiona 2 si  consultar saldo");
                        System.out.println("Presiona 3 si  depositar dinero");
                        System.out.println("Presiona 4 si  transferencia ");
                        System.out.println("Presiona 0 volver ");
                        int opcionCliente = teclado.nextInt();

                        switch (opcionCliente){
                            case 1:

                                System.out.println("ingresa la cantidad de dinero a retirar");
                                int cantidadARetirar= teclado.nextInt();
                                cuentaCorrienteService.extraer(dni,cantidadARetirar);
                                System.out.println("su saldo es " + cuentaCorrienteService.consultarSaldo(dni));
                                break;


                            case 2:

                                 dniCliente = teclado.nextInt();


                                System.out.println("su saldo es " + cuentaCorrienteService.consultarSaldo(dni));
                                break;

                            case 3:
                                System.out.println("ingrese el dinero a depositar");

                                int cantidadADepositar= teclado.nextInt();
                                cuentaCorrienteService.depositar(dni , cantidadADepositar);
                                System.out.println("operacion exitosa.. su saldo es: "+ cuentaCorrienteService.consultarSaldo(dni));
                                break;
                        }


                    }
                    else{
                        System.out.println("el numero de dni no corresponde a ningun usuario ");
                    }
                    break;

                case 2:
                    System.out.println("bienvenido al menu de empleado");

                    System.out.println("1 para Agregar un nuevo Cliente");
                    System.out.println("2 para editar datos de  un  Cliente");
                    System.out.println("3 para Agregar un cuenta a un  Cliente");
                    System.out.println("4 para ver clientes de una sucursal ");

                    int opcionEmpleado= teclado.nextInt();

                    switch(opcionEmpleado){
                        case 1:
                            Cliente clienteNuevo= new Cliente();
                            System.out.println("Nombre y Apellido  del Cliente");
                            clienteNuevo.setNombreApellido(teclado.next());
                            System.out.println("telefono del Cliente");
                            clienteNuevo.setTelefono(teclado.next());
                            System.out.println("email del Cliente");
                            clienteNuevo.setEmail(teclado.next());
                            System.out.println("dni del Cliente");
                            clienteNuevo.setDni(teclado.nextInt());
                            System.out.println("domicilio del Cliente");
                            clienteNuevo.setDomicilio(teclado.next());
                            clienteService.addObje(clienteNuevo);
                            System.out.println(clienteNuevo.toString());
                            break;

                        case 2:
                            Cliente clienteUpdate= new Cliente();
                            System.out.println("Editar datos de un cliente");
                            System.out.println("Ingrese numero de dni del cliente");
                            clienteUpdate.setDni(teclado.nextInt());
                            System.out.println("Nombre y Apellido  del Cliente");
                            clienteUpdate.setNombreApellido(teclado.next());

                            System.out.println("telefono del Cliente");
                            clienteUpdate.setTelefono(teclado.next());

                            System.out.println("email del Cliente");
                            clienteUpdate.setEmail(teclado.next());

                            System.out.println("domicilio del Cliente");
                            clienteUpdate.setDomicilio(teclado.next());
                            clienteService.updateObj(clienteUpdate);
                            System.out.println(clienteUpdate.toString());
                            break;
                        case 3:
                            System.out.println("dni del cliente de la nueva cuenta");
                            int dniParaLacuenta= teclado.nextInt();
                            Cliente clienteEncontrado = clienteService.buscar(dniParaLacuenta);               if (clienteEncontrado.equals(null)){
                            System.out.println("cliente no existe");
                                break;
                        }
                        else {
                            System.out.println("numero que tendra la cuenta");
                            int numeroCuenta= teclado.nextInt();
                            System.out.println("saldo inicial la cuenta");
                            int saldoInicial= teclado.nextInt();
                            System.out.println("cbu la cuenta");
                            String cbu= teclado.next();
                            CuentaCorriente cuentaCorriente = new CuentaCorriente(numeroCuenta,saldoInicial,cbu);

                            cuentaCorrienteService.crearCuenta(cuentaCorriente,dniParaLacuenta);
                            break;
                        }

                    }

             default:
                System.out.println("opcion incorrecta vuelva a ejecutar");

            }






        


}}
