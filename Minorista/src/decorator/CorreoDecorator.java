package decorator;

public class CorreoDecorator extends NotificacionDecorator {
	
	public CorreoDecorator(INotificacion notificacionDecorada) {
		super(notificacionDecorada);
	}
	
	@Override
	public void send(String message) {
		super.getNotificacionDecorada().send(messsage);
	}
}
