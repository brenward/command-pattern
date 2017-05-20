package com.bwardweb.command.commandobjects;

import com.bwardweb.command.Command;
import com.bwardweb.command.objects.Server;

public class ServerOffCommand implements Command{
	Server server;
	
	public ServerOffCommand(Server server){
		this.server = server;
	}

	public void execute() {
		server.powerDown();		
	}

	public void undo() {
		server.powerUp();
	}
}
