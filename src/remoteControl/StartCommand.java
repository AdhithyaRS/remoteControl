package remoteControl;


public class StartCommand implements Command {

	private CentralReceiver controlSystem;
	
	public StartCommand(CentralReceiver cs){
		this.controlSystem=cs;
	}
	@Override
	public void execute() {
		//open command is forwarding request to openFile method
		this.controlSystem.startPlay();
	}

}