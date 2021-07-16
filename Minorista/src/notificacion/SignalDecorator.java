package notificacion;

public class SignalDecorator extends NotificacionDecorator {
	
	public SignalDecorator(INotificacion notificacionDecorada) {
		super(notificacionDecorada);
	}
	
	@Override
	public void send(String message) {
		super.getNotificacionDecorada().send(messsage);
	}

}
