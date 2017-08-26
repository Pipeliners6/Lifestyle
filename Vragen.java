package org.module.system.pojos.hack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Vragen {

	private Map<String, List<VraagReactie>> vragen;

	public Vragen(List<String> subTopics) {

		if (subTopics != null) {
			vragen = new HashMap<>();
			for (String subTopic : subTopics) {
				if (subTopic.equalsIgnoreCase(SubTopics.INFO_PROMOTIE)) {
					List<VraagReactie> list = new ArrayList<>();
					list.add(new VraagReactie(VRAAG1, Reacties.REACTIE1, false));
					list.add(new VraagReactie(VRAAG2, Reacties.REACTIE2, true));
					list.add(new VraagReactie(VRAAG3, Reacties.REACTIE3, false));
					vragen.put(subTopic, list);
				} else if (subTopic.equalsIgnoreCase(SubTopics.OMGANG_OCCUPATIE)) {

				}
			}
		}

	}

	private static final String VRAAG1 = "1";
	private static final String VRAAG2 = "2";
	private static final String VRAAG3 = "3";
	private static final String VRAAG4 = "4";

}
