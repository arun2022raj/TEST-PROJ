
class MyBank{
	double balance;
	public void deposite(double a){
		balance+=a;
	}
	public void withdraw(double a){
		if (balance>a){
			balance-=a;
		}
		else{
			Throwable t= new Throwable("hiii");
			
			throw new InsuffecientBal("balance is less",t);
		}
	}
}
