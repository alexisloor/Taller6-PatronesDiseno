/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadeClass;

import ConcreteClass.MobileService;
import ConcreteClass.TelephonicService;
import ConcreteClass.WebService;

/**
 *
 * @author Usuario
 */
public class InitService {
    
    private MobileService mobileService;
    private TelephonicService tlphService;
    private WebService webService;

    public InitService() {
        this.mobileService = new MobileService();
        this.tlphService = new TelephonicService();
        this.webService = new WebService();
    }
    
    public void comprarMobile(){
        mobileService.comprar();
    }
    
    //servicios movil
    public void rastrearMobile(){
        mobileService.rastrearEnvio();
    }
    
    public void servicio1Mobile(){
        mobileService.servicio1();
    }
    
    public void servicio2Mobile(){
        mobileService.servicio2();
    }
    
    public void comprarTelephonic(){
        tlphService.comprar();
    }
    
    //servicios telefonicos
    public void rastrearTelephonic(){
        tlphService.rastrearEnvio();
    }
    
    public void servicio1Telephonic(){
        tlphService.servicio1();
    }
    
    public void servicio2Telephonic(){
        tlphService.servicio2();
    }
    
    //servicios web
    public void comprarWeb(){
        webService.comprar();
    }
    
    public void rastrearWeb(){
        webService.rastrearEnvio();
    }
    
    public void servicio1Web(){
        webService.servicio1();
    }
    
    public void servicio2Web(){
        webService.servicio2();
    }
    
    
    
}
