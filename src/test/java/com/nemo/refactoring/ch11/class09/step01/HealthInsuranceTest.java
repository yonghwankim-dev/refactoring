package com.nemo.refactoring.ch11.class09.step01;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HealthInsuranceTest {

	@DisplayName("점수를 계산한다")
	@Test
	void score() {
		// given
		HealthInsurance healthInsurance = new HealthInsurance();
		Candidate candidate = new Candidate();
		MedicalExam medicalExam = new MedicalExam();
		ScoringGuide scoringGuide = new ScoringGuide();
		// when
		int score = healthInsurance.score(candidate, medicalExam, scoringGuide);
		// then
		Assertions.assertThat(score).isEqualTo(0);
	}

}
