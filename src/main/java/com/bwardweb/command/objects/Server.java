package com.bwardweb.command.objects;

public class Server {
	private String name;
	
	public Server(String name){
		this.name = name;
	}
	
	public void powerUp(){
		System.out.println(name + " powering up");
		System.out.println("----------------------------");
	}
	
	public void powerDown(){
		System.out.println(name + " powering down");
		System.out.println("----------------------------");
	}
}
