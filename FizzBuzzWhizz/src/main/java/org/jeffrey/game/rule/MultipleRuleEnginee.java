package org.jeffrey.game.rule;

public class MultipleRuleEnginee extends DefaultRuleEnginee {

	public MultipleRuleEnginee(int[] inputNumbers) {
		super(inputNumbers);
	}

	@Override
	public String getPresentForNumber(int number) {

		int mask = 0;
		for (int i = 0; i < RuleConfiguration.SIZE; i++) {
			if (number % getSensitiveNumbers()[i] == 0) {
				mask |= RuleConfiguration.MASKS[i];
			}
		}
		if (mask > 0) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < RuleConfiguration.SIZE; i++) {
				if ((mask & RuleConfiguration.MASKS[i]) == RuleConfiguration.MASKS[i]) {
					sb.append(RuleConfiguration.MASK_STRINGS[i]);
				}
			}
			return sb.toString();
		}
		return null;
	}

}
