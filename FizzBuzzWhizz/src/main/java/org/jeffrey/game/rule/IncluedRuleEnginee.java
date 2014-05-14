package org.jeffrey.game.rule;

public class IncluedRuleEnginee extends DefaultRuleEnginee {
	

	public IncluedRuleEnginee(int[] inputNumbers) {
		super(inputNumbers);
	}

	@Override
	public String getPresentForNumber(int number) {
		int remainder = number % 10;
		for (int i = 0; i < RuleConfiguration.SIZE; i++) {
			if (getSensitiveNumbers()[i] == remainder) {
				return RuleConfiguration.MASK_STRINGS[i];
			}
		}
		int devide = number / 10;
		if (devide == 0){
			return null;
		}
		for (int i = 0; i < RuleConfiguration.SIZE; i++) {
			if (getSensitiveNumbers()[i] == devide) {
				return RuleConfiguration.MASK_STRINGS[i];
			}
		}
		return null;
	}

}
