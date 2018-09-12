/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionpruebacliente;

/**
 *
 * @author walter
 */
public class AplicacionPruebaCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(add(20,5));
       System.out.println("Y bueno, eso fue el asunto");
    }

    private static int add(int valor1, int valor2) {
        pruebaws.NewWebService_Service service = new pruebaws.NewWebService_Service();
        pruebaws.NewWebService port = service.getNewWebServicePort();
        return port.add(valor1, valor2);
    }
    
}
