package decorator;

public class SMSDecorator extends NotificacionDecorator {
	
	public SMSDecorator(INotificacion notificacionDecorada) {
		super(notificacionDecorada);
	}
	
	@Override
	public void send(String message) {
		super.getNotificacionDecorada().send(messsage);
	}

}
