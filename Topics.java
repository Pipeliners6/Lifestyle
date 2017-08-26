package org.module.system.pojos.hack;

public class Topics {

	public static final String TOPIC_HIV = "HIV";
	public static final String TOPIC_2 = "2";

	private String topic;
	private SubTopics subTopic;

	/**
	 * 
	 */
	public Topics(String topic) {
		this.topic = topic;

		if (topic.equalsIgnoreCase(TOPIC_HIV)) {
			subTopic = new SubTopics(TOPIC_HIV);
		}
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public SubTopics getSubTopic() {
		return subTopic;
	}

	public void setSubTopic(SubTopics subTopic) {
		this.subTopic = subTopic;
	}

}
