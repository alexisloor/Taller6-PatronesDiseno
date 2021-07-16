package notificacion;

public class TelegramDecorator extends NotificacionDecorator{
	
	public TelegramDecorator(INotificacion notificacionDecorada) {
		super(notificacionDecorada);
	}
	
	@Override
	public void send(String message) {
		super.getNotificacionDecorada().send(messsage);
	}
}
