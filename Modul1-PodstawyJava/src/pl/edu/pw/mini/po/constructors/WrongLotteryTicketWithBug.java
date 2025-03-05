package pl.edu.pw.mini.po.constructors;

import java.util.Random;

public class WrongLotteryTicketWithBug {

	private static final String LotteryName = "MiNI PW lottery";

	private static final int maxPrize = 100;
	private static final int minPrize = 10;
	
	private int allTicketsSummarizedWonPrizeAmount;//Blad polega na tym ze to pole powinno byc statyczne

	private boolean won;
	private int prizeValue;

	private String ownerName;
	private String ownerLastName;

	public WrongLotteryTicketWithBug(String ownerName, String ownerLastName) {
		this.ownerName = ownerName;
		this.ownerLastName = ownerLastName;
		
		Random random = new Random();
		if(random.nextInt(10) == 0) {
			won = true;
			prizeValue = minPrize + random.nextInt(maxPrize-minPrize);
			allTicketsSummarizedWonPrizeAmount+=prizeValue;
		}

	}

	public int getAllTicketsSummarizedWonPrizeAmount() {
		return allTicketsSummarizedWonPrizeAmount;
	}

	public boolean isWon() {
		return won;
	}

	public int getPrizeValue() {
		return prizeValue;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getOwnerLastName() {
		return ownerLastName;
	}

}
