package remoteControl;

public class EnhancementSystemReceiver implements CentralReceiver {
	String name;
	

	public EnhancementSystemReceiver(String name) {
		super();
		this.name = name;
	}

	@Override
	public void on() {
		System.out.println("on is Invalid command for "+ name);
	}

	@Override
	public void off() {
		System.out.println("off is Invalid command for "+ name);
	}

	@Override
	public void open() {
		System.out.println("open is Invalid command for "+ name);
		
	}
	@Override
	public void close() {
		System.out.println("close is Invalid command for "+ name);
		
	}

	@Override
	public void startPlay() {
		System.out.println("startPlay is Invalid command for "+ name);
		
	}

	@Override
	public void stopPlay() {
		System.out.println("stopPlay is Invalid command for "+ name);
		
	}
	public void enhancement() {
		System.out.println("Upgrade on the way: "+ name);

	}

}
