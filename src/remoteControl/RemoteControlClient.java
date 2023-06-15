package remoteControl;

public class RemoteControlClient {

	public static void main(String[] args) {
		//Creating the receiver object
		CentralReceiver cs = ControlSystemReceiverUtil.getUnderlyingCommand();
		FileInvoker file;
		
		
		OpenCommand openCommand = new OpenCommand(cs);
		file = new FileInvoker(openCommand);
		file.execute();
		
		CloseCommand closeCommand = new CloseCommand(cs);
		file = new FileInvoker(closeCommand);
		file.execute();
		
		StartCommand startCommand = new StartCommand(cs);
		file = new FileInvoker(startCommand);
		file.execute();
		
		StopCommand stopCommand = new StopCommand(cs);
		file = new FileInvoker(stopCommand);
		file.execute();
		
		OnCommand onCommand = new OnCommand(cs);
		file = new FileInvoker(onCommand);
		file.execute();
		
		OffCommand offCommand = new OffCommand(cs);
		file = new FileInvoker(offCommand);
		file.execute();
		
		EnhancementCommand enhancementCommand = new EnhancementCommand(cs);
		file = new FileInvoker(enhancementCommand);
		file.execute();
		
	}

}