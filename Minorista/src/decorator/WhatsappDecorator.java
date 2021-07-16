package decorator;

public class WhatsappDecorator extends NotificacionDecorator{
	
	public WhatsappDecorator(INotificacion notificacionDecorada) {
		super(notificacionDecorada);
	}
	
	@Override
	public void send(String message) {
		super.getNotificacionDecorada().send(messsage);
	}

}
