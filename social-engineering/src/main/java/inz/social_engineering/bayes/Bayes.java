package inz.social_engineering.bayes;

import unbbayes.prs.bn.ProbabilisticNetwork;

public class Bayes {

	private static final String STATE_POSITIVE = "da";
	private static final String STATE_NEGATIVE = "ne";
	private static final String STATE_HAS = "ima";
	private static final String STATE_HAS_NOT = "nema";
	
	private static final ProbabilisticNetwork NET1 = new ProbabilisticNetwork("support-system");
	private static final ProbabilisticNetwork NET2 = new ProbabilisticNetwork("support-system");

}
