package org.jeffrey.game;

import org.jeffrey.game.rule.RuleConfiguration;
import org.jeffrey.game.service.PronounceService;

public class FizzBuzzWhizz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		if (args.length != RuleConfiguration.SIZE) {
			System.out.println("Please input three numbers.example: 3 5 7.");
			return;
		}
		int[] inputNumbers = new int[3];
		for (int i = 0; i < args.length; i++) {

			try {
				inputNumbers[i] = Integer.parseInt(args[i]);
				if (inputNumbers[i] >= 10) {
					System.out
							.println("Please input three numbers(less then 10).example: 3 5 7.");
					return;
				}
			} catch (NumberFormatException e) {
				System.out
						.println("Please input three numbers.example: 3 5 7.");
				return;
			}
		}
		if ((inputNumbers[0] == inputNumbers[1])
				|| (inputNumbers[1] == inputNumbers[2])
				|| (inputNumbers[0] == inputNumbers[2])) {
			System.out
					.println("Please input three diffrent numbers.example: 3 5 7.");
			return;
		}
		PronounceService ps = new PronounceService();
		ps.init(inputNumbers);
		for (int i = 1; i <= 100; i++) {
			System.out.println(ps.getPronounce(i));
		}

	}

}
