package com.nemo.refactoring.ch11.class13;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ResourcePoolTest {

	@DisplayName("리소스를 생성하고 할당받는다")
	@Test
	void get() {
		// given
		ResourcePool resourcePool = new ResourcePool();
		// when
		Resource resource = resourcePool.get();
		Resource resource2 = resourcePool.get();
		// then
		Assertions.assertThat(resource).isNotNull();
		Assertions.assertThat(resource2).isNotNull();
	}

}
