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
		Dice dice = new Dice();
		strength = dice.stackedRoll(4, 3, 6);
		intelligence = dice.stackedRoll(4, 3, 6);
		wisdom = dice.stackedRoll(4, 3, 6);
		constitution = dice.stackedRoll(4, 3, 6);
		dexterity = dice.stackedRoll(4, 3, 6);
		charisma = dice.stackedRoll(4, 3, 6);
	}

	@Override
	public String toString() {
		return "PlayerCharacter [firstName=" + firstName + ", strength=" + strength + ", intelligence=" + intelligence
				+ ", wisdom=" + wisdom + ", dexterity=" + dexterity + ", constitution=" + constitution + ", charisma="
				+ charisma + "]";
	}

}
