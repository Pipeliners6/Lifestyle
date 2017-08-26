package org.module.system.pojos.hack;

public class VraagReactie {

	private String vraag;
	private String reactie;
	private Boolean isValid;

	/**
	 * @param vraag
	 * @param reactie
	 * @param isValid
	 */
	public VraagReactie(String vraag, String reactie, Boolean isValid) {
		super();
		this.vraag = vraag;
		this.reactie = reactie;
		this.isValid = isValid;
	}

	public String getVraag() {
		return vraag;
	}

	public void setVraag(String vraag) {
		this.vraag = vraag;
	}

	public String getReactie() {
		return reactie;
	}

	public void setReactie(String reactie) {
		this.reactie = reactie;
	}

	public Boolean getIsValid() {
		return isValid;
	}

	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}

}
