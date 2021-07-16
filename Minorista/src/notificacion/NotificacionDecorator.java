package notificacion;

public abstract class NotificacionDecorator implements INotificacion {
	private INotificacion notificacionDecorada;
	
	public NotificacionDecorator(INotificacion n) {
		this.notificacionDecorada = n;
	}
	
	public void send(String message) {
		this.notificacionDecorada.send(message);
	}
	
	public INotificacion getNotificacionDecorada() {
		return notificacionDecorada;
	}
}
