package model;
/**
 * @author Noah - Arterburn
 * CIS175 - Fall 2023
 * Sep 20, 2023
 */

public class StatisticsUsername {
	private String DisplayName = "";
	private String FirstName = "";
	private String LastName = "";
	private int vowels = 0;
	private int er = 0;
	private int son = 0;
	
	public StatisticsUsername(String string) {
		genStats(string.toLowerCase());
	}

	private void genStats(String string) {
		for (int i =0; i< string.length(); i++){
			String analysisChar = string.substring(i, i + 1);
		 if (analysisChar.contains("a") || analysisChar.contains("e") || analysisChar.contains("i")
			|| analysisChar.contains("o") || analysisChar.contains("u") || analysisChar.contains("y")) {
				vowels++;
			} 
		}
		String hold1 = string;
		if (hold1.contains("er")) {
			er++;
		 if (hold1.contains("son")) {
			son++;
			}
		}
	}

	public String getDisplayName() {
		return DisplayName;
	}

	public void setDisplayName(String displayName) {
		DisplayName = displayName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getVowels() {
		return vowels;
	}

	public void setVowels(int vowels) {
		this.vowels = vowels;
	}

	public int getEr() {
		return er;
	}

	public void setEr(int er) {
		this.er = er;
	}

	public int getSon() {
		return son;
	}

	public void setSon(int son) {
		this.son = son;
	}


}
