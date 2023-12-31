package remoteControl;

public class AudioSystemReceiver implements AudioControlSystemReceiver {
	String name;
	
	public AudioSystemReceiver(String name) {
		super();
		this.name = name;
	}
	@Override
	public void startPlay() {
		if(name.contains("start")) {
			System.out.println("Playing music on: "+ name.replace("start", ""));
		}else {
			System.out.println("startPlay is Invalid command for "+ name.replace("start", ""));
		}
		
		
	}

	@Override
	public void stopPlay() {
		if(name.contains("stop")) {
			System.out.println("Stopped playing: "+ name.replace("stop", ""));
		}else {
			System.out.println("stopPlay is Invalid command for "+ name.replace("stop", ""));
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