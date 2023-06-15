package remoteControl;


public class OffCommand implements Command {

	private CentralReceiver controlSystem;
	
	public OffCommand(CentralReceiver cs){
		this.controlSystem=cs;
	}
	@Override
	public void execute() {
		
		this.controlSystem.off();
	}

}