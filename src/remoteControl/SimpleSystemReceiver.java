package remoteControl;

public class SimpleSystemReceiver implements SimpleControlSystemReceiver {
	public SimpleSystemReceiver(String name) {
		super();
		this.name = name;
	}

	String name;
	

	@Override
	public void on() {
		
		if(name.contains("on")) {
			System.out.println("Turning On the "+ name.replace("on", ""));
		}else {
			System.out.println("on is Invalid command for "+ name);
		}
	}

	@Override
	public void off() {
		if(name.contains("off")) {
			System.out.println("Turning Off the "+ name.replace("off", ""));
		}else {
			System.out.println("off is Invalid command for "+ name);
		}
		
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
	@Override
	public void enhancement() {
		System.out.println("enhancement is Invalid command for "+ name);
		
	}


}
