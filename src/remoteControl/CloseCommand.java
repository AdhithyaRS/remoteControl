package remoteControl;


public class CloseCommand implements Command {

	private CentralReceiver controlSystem;
	
	public CloseCommand(CentralReceiver cs){
		this.controlSystem=cs;
	}
	@Override
	public void execute() {
		//open command is forwarding request to openFile method
		this.controlSystem.close();
	}

}