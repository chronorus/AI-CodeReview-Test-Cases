package gosoft.A.I.CodeReviewTestCases;

import org.springframework.transaction.annotation.Transactional;

public class Case208 {
	public void doTheThing() {
	  // ...
	  actuallyDoTheThing();  // Noncompliant
	}

	@Transactional
	public void actuallyDoTheThing() {
	  // ...
	}

}
