package com.bwardweb.command.commandobjects;

import com.bwardweb.command.Command;

public class NullCommand implements Command{

	public void execute() {
		System.out.println("Server not set");
		System.out.println("----------------------------");
	}

	public void undo() {
		System.out.println("Server not set");
		System.out.println("----------------------------");		
	}

}
