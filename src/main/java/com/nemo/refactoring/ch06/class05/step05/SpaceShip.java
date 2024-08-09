package com.nemo.refactoring.ch06.class05.step05;

public class SpaceShip {
	private Owner owner;

	public SpaceShip(Owner owner) {
		this.owner = owner;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}
}
