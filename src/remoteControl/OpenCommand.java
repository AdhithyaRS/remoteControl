package remoteControl;

public class OpenCommand implements Command {

	private CentralReceiver controlSystem;
	
	public OpenCommand(CentralReceiver cs){
		this.controlSystem=cs;
	}
	@Override
	public void execute() {
		//open command is forwarding request to openFile method
		this.controlSystem.open();
	}

}