package Classes_Objects;

public class Addamount {
	int savingAmount=50;;

	static int count=0;
	public Addamount(){
		this.savingAmount=50;
	}
	public  Addamount(int amount) {
		this.savingAmount= savingAmount+amount;
		transactions();
	}
	public void transactions() {
		count++;
		System.out.println("Transactions made : " +count);
		
	}
	@Override
	public String toString() {
		return "Addamount [savingAmount=" + savingAmount +"]";
	}
	
	
}
