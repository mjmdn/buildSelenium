package week3_day1;

public class CR_Learning_IntefaceWith_Multiple_Inheritance {

	public static void main(String[] args) {
		
     /*CR_Bank obj = new CR_Bank();
     obj.setCriditscore();
     obj.setKYCDocuments();
     obj.setTransactionLimits();*/
		
		CR_BankOne obj=new CR_BankOne();
		obj.setKYCDocuments();
		obj.Loan();
		obj.setTransactionLimits();
	}

}
