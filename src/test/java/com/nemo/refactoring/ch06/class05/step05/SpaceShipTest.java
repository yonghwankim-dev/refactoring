package com.nemo.refactoring.ch06.class05.step05;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SpaceShipTest {

	@DisplayName("change the defaultOwner's info")
	@Test
	void defaultOwner(){
	    // given
		Owner defaultOwner = new Owner("kim", "yonghwan");
		SpaceShip spaceShip = new SpaceShip(defaultOwner);
		// when
	    spaceShip.owner = new Owner("lee", "yonghwan");
	    // then
		Assertions.assertThat(spaceShip.owner.getFirstName()).isEqualTo("lee");
		Assertions.assertThat(spaceShip.owner.getLastName()).isEqualTo("yonghwan");

	}

}
