package remoteControl;

public class OnCommand implements Command {

	private CentralReceiver controlSystem;
	
	public OnCommand(CentralReceiver cs){
		this.controlSystem=cs;
	}
	@Override
	public void execute() {
		//open command is forwarding request to openFile method
		this.controlSystem.on();
	}

}