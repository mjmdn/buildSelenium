package week1.day2;

public class AfternoonSessionPractise {

	static float a=2.2f;
	static int b=2;
    static int [] number= {1,2,3,4,5,6,7,8,9,10};

    public int  calculateArea(int b) {
		return b*b;

	}

    public float calculateArea(float a,int b) {
		return b*a/2;


	}
	
	
	public AfternoonSessionPractise()
	{
		System.out.println("No Arguments Passing");
	}
	
	public AfternoonSessionPractise(float a)
	{
		System.out.println("one  Arguments passing");
	}
	
	public AfternoonSessionPractise(float a,int b)
	{
		//System.out.println("Two  Arguments passing");
	}
	
	

	private void findingoddnumber(int[] number) {
		
		for(int list:number)
		{
			if(list%2!=0)
			{
				System.out.println(list);
			}
		}
		
	}
	public static void main(String[] args) {

        //Constuctor overloading
		AfternoonSessionPractise an=new AfternoonSessionPractise();
		//AfternoonSessionPractise an1=new AfternoonSessionPractise(a);
		//AfternoonSessionPractise an2=new AfternoonSessionPractise(a,b);

		//Finding Area
		int squareArea = an.calculateArea(b);
		System.out.println(squareArea);
		float Triangle = an.calculateArea(a,b);
		System.out.println(Triangle);
		
		//find add number from arraylist
	
		an.findingoddnumber(number);
		
		
		
		



	}




}
