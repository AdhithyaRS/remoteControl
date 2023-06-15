package remoteControl;

public class EnhancementCommand implements Command {

	private CentralReceiver controlSystem;
	
	public EnhancementCommand(CentralReceiver cs){
		this.controlSystem=cs;
	}
	@Override
	public void execute() {
		//open command is forwarding request to openFile method
		this.controlSystem.enhancement();
	}

}