package com.nemo.refactoring.ch06.class06;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.nemo.refactoring.ch06.class06.Owner;
import com.nemo.refactoring.ch06.class06.SpaceShip;

class SpaceShipTest {

	@DisplayName("change the defaultOwner's info")
	@Test
	void defaultOwner(){
	    // given
		Owner defaultOwner = new Owner("kim", "yonghwan");
		SpaceShip spaceShip = new SpaceShip(defaultOwner);
		// when
	    spaceShip.setOwner(new Owner("lee", "yonghwan"));
	    // then
		Assertions.assertThat(spaceShip.getOwner().getFirstName()).isEqualTo("lee");
		Assertions.assertThat(spaceShip.getOwner().getLastName()).isEqualTo("yonghwan");

	}

}
