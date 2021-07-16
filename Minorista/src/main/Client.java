package main;

import notificacion.INotificacion;
import notificacion.Notificacion;

public class Client {
	private INotificacion noti;
	private Bank bank;
	
	public Client(Bank bank) {
		this.bank = bank;
		noti = new Notificacion();
		INotificacion notiSMS= new SMSDecorator(noti);
		INotificacion notiCorreo= new CorreoDecorator(noti);
	}

    public getBank() {
        return this.bank;
    }
    
    
}
