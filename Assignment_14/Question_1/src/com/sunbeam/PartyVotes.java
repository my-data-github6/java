package com.sunbeam;

public class PartyVotes {
	private String partyV;
	private int pVotes;
	public PartyVotes() {
		
	}
	public PartyVotes(String partyV, int pVotes) {
		super();
		this.partyV = partyV;
		this.pVotes = pVotes;
	}
	public String getPartyV() {
		return partyV;
	}
	public void setPartyV(String partyV) {
		this.partyV = partyV;
	}
	public int getpVotes() {
		return pVotes;
	}
	public void setpVotes(int pVotes) {
		this.pVotes = pVotes;
	}
	@Override
	public String toString() {
		System.out.println("***************************************");
		return "Party: " + partyV + "\nVotes: " + pVotes;
	}
	

}
