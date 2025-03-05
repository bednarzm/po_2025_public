package pl.edu.pw.mini.po.constructors;

import java.util.Random;

public class LotteryTicket {

	private static final String LOTTERY_NAME = "MiNI PW lottery";
	
	private static final int maxPrize = 100;
	private static final int minPrize = 10;
	
	private static int allTicketsSummarizedWonPrizeAmount;
	
	private boolean won;
	private int prizeValue;
	
	private String ownerName;
	private String ownerLastName;

	public LotteryTicket(String ownerName, String ownerLastName) {
		this.ownerName = ownerName;
		this.ownerLastName = ownerLastName;
		
		Random random = new Random();
		if(random.nextInt(10) == 0) {
			won = true;
			prizeValue = minPrize + random.nextInt(maxPrize-minPrize);
			allTicketsSummarizedWonPrizeAmount+=prizeValue;
		}

	}

	public static int getAllTicketsSummarizedWonPrizeAmount() {
		return allTicketsSummarizedWonPrizeAmount;
	}

	public boolean isWon() {
		return won;
	}

	@Override
	public String toString() {
		return "LotteryTicket [LOTTERY_NAME: " + LOTTERY_NAME + " won=" + won + ", prizeValue=" + prizeValue + ", ownerName=" + ownerName
				+ ", ownerLastName=" + ownerLastName + " allTicketsSummarizedWonPrizeAmount " + allTicketsSummarizedWonPrizeAmount +"]";
	}
	
}
