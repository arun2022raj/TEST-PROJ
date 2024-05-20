

// class InsuffecientBal extends Exception{
	// InsuffecientBal(){
		// super();
	// }
	// InsuffecientBal(String s){
		// super(s);
	// }
	// InsuffecientBal(String s,Throwable e){
		// super(s,e);
	// }
	// InsuffecientBal(Throwable e){
		// super(e);
	// }
// }

class InsuffecientBal extends RuntimeException{
	InsuffecientBal(){
		super();
	}
	InsuffecientBal(String s){
		super(s);
	}
	InsuffecientBal(String s,Throwable e){
		super(s,e);
	}
	InsuffecientBal(Throwable e){
		super(e);
	}
	
}