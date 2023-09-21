package model;
/**
 * @author Noah - Arterburn
 * CIS175 - Fall 2023
 * Sep 20, 2023
 */

public class StatisticsTax {
	private String mainUN2 = "";
	private String usernumber = "";
	private String holdf = "";
	private int decimal = 0;
	private int has99cents = 0;
	
	public StatisticsTax(String string) {
		genStats(string.toLowerCase());
	}

	private void genStats(String string) {
		String CL = string;
			if (CL.contains(".00")) {
				decimal++;	
			} else if(CL.contains(".99")) {
				has99cents++;
			}
		}

	public String getmainUN2() {
		return mainUN2;
	}

	public void setmainUN2(String mainUN2) {
		this.mainUN2 = mainUN2;
	}

	public String getusernumber() {
		return usernumber;
	}

	public void setusernumber(String usernumber) {
		this.usernumber = usernumber;
	}

	public String getholdf() {
		return holdf;
	}

	public void setholdf(String holdf) {
		this.holdf = holdf;
	}

	public int getDecimal() {
		return decimal;
	}

	public void setDecimal(int decimal) {
		this.decimal = decimal;
	}

	public int getHas99cents() {
		return has99cents;
	}

	public void setHas99cents(int has99cents) {
		this.has99cents = has99cents;
	}

}
