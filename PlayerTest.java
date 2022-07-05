package com.monocept.test;

import com.monocept.model.Player;

public class PlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player p1=new Player(1,"p1",23,30);
		Player p2=new Player(2,"p2",24);
		
		System.out.println((" elder player:"));		
		printPlayerDetails(p1.whoIsElder(p2));
		
		System.out.println((" player with more matches:"));
		printPlayerDetails(p1.whoHasMoreMatches(p2));
	}
    public static void printPlayerDetails(Player p) {
    	System.out.println(" player details ");
    	System.out.println(" id:  "+ p.getId());
    	System.out.println(" name: "+ p.getName());
    	System.out.println(" age: "+ p.getAge());
    	System.out.println(" matches: "+ p.getMatches());
		System.out.println("---------------------");
	}
}
