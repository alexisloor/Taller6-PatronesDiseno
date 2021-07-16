package main;

import decorator.INotificacion;
import decorator.Notificacion;

public class Client {
	private INotificacion noti;
	
	public Client() {
		
		noti = new Notificacion();
		INotificacion notiSMS= new SMSDecorator(noti);
		INotificacion notiCorreo= new CorreoDecorator(noti);
	}

}
