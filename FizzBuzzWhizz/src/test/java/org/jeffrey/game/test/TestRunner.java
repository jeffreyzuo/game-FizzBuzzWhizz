package org.jeffrey.game.test;

import org.jeffrey.game.service.PronounceService;
import org.junit.Test;

public class TestRunner {

	@Test
	public void rungame() {
		int[] inputNumbers = { 3, 5, 8 };

		PronounceService ps = new PronounceService();
		ps.init(inputNumbers);
		for (int i = 1; i <= 100; i++) {
			System.out.println(i + " --> " + ps.getPronounce(i));
		}
	}
}
