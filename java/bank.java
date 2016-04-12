class BankAccount{
	public int balance;
	public BankAccount(){
		System.out.println("dhg");
	}
	public BankAccount(int y){
		balance =y;
//		System.out.println("second"+balance);
	}
	public void Sum(int x){
		balance =x;
		System.out.println("sum"+balance);

	}
}

class bank{
	public static void main(String[] args){
		BankAccount ba=new BankAccount();
		BankAccount sa=new BankAccount(89);
		System.out.println("third"+sa.balance);
		ba.Sum(10);
		
	}

}
