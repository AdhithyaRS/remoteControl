package remoteControl;


public class StopCommand implements Command {

	private CentralReceiver controlSystem;
	
	public StopCommand(CentralReceiver cs){
		this.controlSystem=cs;
	}
	@Override
	public void execute() {
		//open command is forwarding request to openFile method
		this.controlSystem.stopPlay();
	}

}
