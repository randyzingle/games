package com.bms.cyoa.utils;

public class PlayerCharacter {
	
	public String firstName;
	
	public int strength;
	public int intelligence;
	public int wisdom;
	public int dexterity;
	public int constitution;
	public int charisma;
	
	private PlayerCharacter(){};
	
	public static PlayerCharacter createNewPlayerCharacter(String firstName) {
		PlayerCharacter pc = new PlayerCharacter();
		pc.firstName = firstName;
		pc.generateInitialStats();
		return pc;
	}

	private void generateInitialStats() {
		// TODO Auto-generated method stub
		
	}

}
