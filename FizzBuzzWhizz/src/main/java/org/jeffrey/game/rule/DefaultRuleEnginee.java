package org.jeffrey.game.rule;

public class DefaultRuleEnginee implements RuleEnginee {

	private int[] sensitiveNumbers ;
	public int[] getSensitiveNumbers() {
		return sensitiveNumbers;
	}

	public DefaultRuleEnginee(int[] inputNumbers) {
		this.sensitiveNumbers = inputNumbers;
	}
	
	@Override
	public   String getPresentForNumber(int number) {
		return null;
	}

}
