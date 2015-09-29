//Payment class: has attributes amt, isCredit, and cardNum(default is NULL)

public class Payment{
	
	private Money amt;
	private boolean credit;
	private String cardNum;
	
	//constructor w/ Money argument
	public Payment(Money amt, boolean credit, String cardNum = NULL){
		this.amt = amt;
		this.credit = credit;
		this.cardNum = cardNum;
	}
	
	//get the amount
	public Money getAmt(){
		return this.amt;
	}
	
	//return bool for credit
	public boolean isCredit(){
		return this.credit;
	}
	
	//return credit card number
	public String getCardNum(){
		return this.cardNum;
	}
}