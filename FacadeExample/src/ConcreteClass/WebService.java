/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConcreteClass;

import Interfaz.Service;

/**
 *
 * @author Usuario
 */
public class WebService implements Service{

    @Override
    public void comprar() {
        System.out.println("Hace la compra");
    }

    @Override
    public void rastrearEnvio() {
        System.out.println("Rastrea el/los envios");
    }

    @Override
    public void servicio1() {
        System.out.println("Hace el servicio1");
    }

    @Override
    public void servicio2() {
        System.out.println("Hace el servicio2");
    }
    
}
