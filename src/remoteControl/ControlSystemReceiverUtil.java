package remoteControl;

import java.util.Scanner;

public class ControlSystemReceiverUtil {
	
	public static CentralReceiver getUnderlyingCommand(){
		System.out.println("Please enter a command");
		Scanner sc = new Scanner(System.in);
		 String object = sc.nextLine().toLowerCase(); 
		 sc.close();
		 System.out.println("The Command you want to execute is :"+object);
		 if(object.contains("on") || object.contains("off")){
			 return new SimpleSystemReceiver(object);
		 }else if(object.contains("start") || object.contains("stop")){
			 return new AudioSystemReceiver(object);
		 }else if(object.contains("open") || object.contains("close")){
			 return new DoorSystemReceiver(object);
		 }else {
			 return new EnhancementSystemReceiver(object);
		 }
		 
		 
	}
	
	
}