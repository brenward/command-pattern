package com.bwardweb.command;

import com.bwardweb.command.commandobjects.ServerOffCommand;
import com.bwardweb.command.commandobjects.ServerOnCommand;
import com.bwardweb.command.objects.Server;

public class ServerTest {

	public static void main(String[] args) {
		ServerControl serverControl = new ServerControl();
		
		Server serverOne = new Server("Server 1");
		Server serverTwo = new Server("Server 2");
		Server serverThree = new Server("Server 3");
		Server serverFour = new Server("Server 4");
		
		ServerOnCommand serverOneOn = new ServerOnCommand(serverOne);
		ServerOffCommand serverOneOff = new ServerOffCommand(serverOne);
		ServerOnCommand serverTwoOn = new ServerOnCommand(serverTwo);
		ServerOffCommand serverTwoOff = new ServerOffCommand(serverTwo);
		ServerOnCommand serverThreeOn = new ServerOnCommand(serverThree);
		ServerOffCommand serverThreeOff = new ServerOffCommand(serverThree);
		ServerOnCommand serverFourOn = new ServerOnCommand(serverFour);
		ServerOffCommand serverFourOff = new ServerOffCommand(serverFour);
		
		serverControl.setServer(0, serverOneOn, serverOneOff);
		serverControl.setServer(1, serverTwoOn, serverTwoOff);
		serverControl.setServer(2, serverThreeOn, serverThreeOff);
		serverControl.setServer(3, serverFourOn, serverFourOff);
		
		serverControl.onButtonPushed(1);
		serverControl.onButtonPushed(3);
		serverControl.undoButtonPushed();
		serverControl.offButtonPushed(1);
		serverControl.onButtonPushed(0);
		serverControl.onButtonPushed(2);
		serverControl.offButtonPushed(2);
		serverControl.undoButtonPushed();

	}

}
