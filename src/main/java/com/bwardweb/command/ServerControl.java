package com.bwardweb.command;

import com.bwardweb.command.commandobjects.NullCommand;

public class ServerControl {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	
	private static final int NUM_SERVERS = 4;
	
	public ServerControl(){
		onCommands = new Command[NUM_SERVERS];
		offCommands = new Command[NUM_SERVERS];
		
		Command nullCommand = new NullCommand();
		
		for(int i=0;i<NUM_SERVERS;i++){
			setServer(i,nullCommand, nullCommand);
		}
		
		undoCommand = nullCommand;
	}
	
	public void setServer(int serverId, Command onCommand, Command offCommand){
		if(serverId >= 0 && serverId <= NUM_SERVERS){
			onCommands[serverId] = onCommand;
			offCommands[serverId] = offCommand;
		}else{
			System.out.println("Invalid server slot");
		}
	}
	
	public void onButtonPushed(int serverId){
		if(serverId >= 0 && serverId <= NUM_SERVERS){
			onCommands[serverId].execute();
			undoCommand = onCommands[serverId];
		}else{
			System.out.println("Invalid server slot");
		}
	}
	
	public void offButtonPushed(int serverId){
		if(serverId >= 0 && serverId <= NUM_SERVERS){
			offCommands[serverId].execute();
			undoCommand = offCommands[serverId];
		}else{
			System.out.println("Invalid server slot");
		}
	}
	
	public void undoButtonPushed(){
		System.out.println("Undoing last command");
		undoCommand.undo();
	}
}
