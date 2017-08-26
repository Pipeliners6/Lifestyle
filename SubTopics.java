package org.module.system.pojos.hack;

import java.util.ArrayList;
import java.util.List;

public class SubTopics {

	public static final String INFO_PROMOTIE = "INFO_PROMOTIE";
	public static final String OMGANG_OCCUPATIE = "OMGANG_OCCUPATIE";

	private List<String> subTopics;
	private Vragen vragen;

	public SubTopics(String topicHiv) {
		if (topicHiv.equalsIgnoreCase(Topics.TOPIC_HIV)) {
			subTopics = new ArrayList<>();
			subTopics.add(INFO_PROMOTIE);
			subTopics.add(OMGANG_OCCUPATIE);
		}
		vragen = new Vragen(subTopics);
	}

	public List<String> getSubTopics() {
		return subTopics;
	}

	public Vragen getVragen() {
		return vragen;
	}

}
