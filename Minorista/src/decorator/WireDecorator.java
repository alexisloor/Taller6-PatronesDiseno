package decorator;

public class WireDecorator extends NotificacionDecorator {
	
	public WireDecorator(INotificacion notificacionDecorada) {
		super(notificacionDecorada);
	}
	
	@Override
	public void send(String message) {
		super.getNotificacionDecorada().send(messsage);
	}
}
