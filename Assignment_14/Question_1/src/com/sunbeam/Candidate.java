package com.sunbeam;

import java.util.Scanner;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-22 12:54
 */
 
public class Candidate {
	private int id;
	private String name;
	private String party;
	private int votes;

	Scanner sc =new Scanner(System.in);
	public Candidate() {
	}

	public Candidate(int id, String name, String party, int votes) {
		this.id = id;
		this.name = name;
		this.party = party;
		this.votes = votes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}
    public void accept()
    {
    	System.out.println("Enter id");
    	this.id=sc.nextInt();
    	System.out.println("Enter name");
    	this.name=sc.next();
    	System.out.println("Enter party name");
    	this.party=sc.next();
    	System.out.println("Enter no. of votes");
    	this.votes=sc.nextInt();
    }
	@Override
	public String toString() {
		return "Candidate [id=" + id + ", name=" + name + ", party=" + party + ", votes=" + votes + "]";
	}
}
