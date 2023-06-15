package remoteControl;

public class DoorSystemReceiver implements DoorControlSystemReceiver{
	String name;
	public DoorSystemReceiver(String name) {
		super();
		this.name = name;
	}

	@Override
	public void open() {
		
		if(name.contains("open")) {
			System.out.println("Opened "+name.replace("open", ""));
		}else {
			System.out.println("open is Invalid command for "+ name);
		}
		
	}

	@Override
	public void close() {
		if(name.contains("close")) {
			System.out.println("Closed "+name.replace("close", ""));
		}else {
			System.out.println("close is Invalid command for "+ name);
		}
		
		
		
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
	public void on() {
		System.out.println("on is Invalid command for "+ name);
		
	}

	@Override
	public void off() {
		System.out.println("off is Invalid command for "+ name);
		
	}

	@Override
	public void enhancement() {
		System.out.println("enhancement is Invalid command for "+ name);
		
	}
	

}
