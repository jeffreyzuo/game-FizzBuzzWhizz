package org.jeffrey.game.service;

import java.util.ArrayList;
import java.util.List;

import org.jeffrey.game.rule.IncluedRuleEnginee;
import org.jeffrey.game.rule.MultipleRuleEnginee;
import org.jeffrey.game.rule.RuleEnginee;

public class PronounceService {
	private List<RuleEnginee> rules = new ArrayList<RuleEnginee>(4);

	public void init(int[] inputNumbers) {
		rules.add(new IncluedRuleEnginee(inputNumbers));
		rules.add(new MultipleRuleEnginee(inputNumbers));
	}

	public String getPronounce(int number) {
		String result = null;
		for (RuleEnginee ruleEnginee : rules) {
			result = ruleEnginee.getPresentForNumber(number);
			if (result != null) {
				return result;
			}
		}
		return String.valueOf(number);
	}
}
