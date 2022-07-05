package com.monocept.model;

public class Player {

	private int id;
	private String name;
	private int age;
	private int matches;

	public Player() {
	}

	public Player(int id, String name, int age, int matches) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.matches = matches;
	}

	public Player(int id, String name, int age) {

		this(id, name, age, 20);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getMatches() {
		return matches;
	}

	public Player whoIsElder(Player player) {
		if (this.age > player.age)
			return this;
		return player;
	}

	public Player whoHasMoreMatches(Player player) {
		if (this.matches > player.matches)
			return this;
		return player;
	}

}
