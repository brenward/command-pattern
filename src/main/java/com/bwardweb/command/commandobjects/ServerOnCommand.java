package com.bwardweb.command.commandobjects;

import com.bwardweb.command.Command;
import com.bwardweb.command.objects.Server;

public class ServerOnCommand implements Command{
	
	Server server;
	
	public ServerOnCommand(Server server){
		this.server = server;
	}

	public void execute() {
		server.powerUp();		
	}

	public void undo() {
		server.powerDown();		
	}

}
