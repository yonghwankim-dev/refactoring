package com.nemo.refactoring.ch08.class04.step01;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonRenderTest {

	@DisplayName("최신 포토 리스트들의 HTML 태그를 반환한다")
	@Test
	void listRecentPhotos(){
	    // given
		PersonRender personRender = new PersonRender();
		// when
		String result = personRender.listRecentPhotos(List.of(new Photo("title1", "seoul", "url", LocalDate.now())));
		// then
		Assertions.assertThat(result).isEqualTo("<div>\n"
			+ "<p>제목: title1</p>\n"
			+ "<p>날짜: 2024-08-17</p>\n"
			+ "<p>위치: seoul</p>\n"
			+ "</div>");

	}

}
