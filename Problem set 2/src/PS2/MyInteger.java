package PS2;

public class MyInteger {

	private int Value;
	
	public MyInteger(int number){
		this.Value = number;
	}
	public int getValue(){
		return this.Value;
	}
	
	public boolean IsEven(){
		if (Value%2==0){
			return true;
		}
			return false;}
	
	public boolean IsOdd(){
		if (Value%2==1){
			return true;
		}
			return false;}
	
	public boolean IsPrime(){
		int counter=2;
		while(Value%counter!=0 && counter<Value){
			counter++;}
		if (counter == Value){
			return true;}
			return false;}
	
	public static boolean IsEven(int Value){
		if (Value%2==0){
			return true;
		}
			return false;}
	
	public static boolean IsOdd(int Value){
		if (Value%2==1){
			return true;
		}
			return false;}
	
	public static boolean IsPrime(int Value){
		int counter=2;
		while(Value%counter!=0 && counter<Value){
			counter++;}
		if (counter == Value){
			return true;}
			return false;}
	public static boolean IsEven(MyInteger MyInt){
		if (MyInt.getValue()%2==0){
			return true;
		}
			return false;}
	
	public static boolean IsOdd(MyInteger MyInt){
		if (MyInt.getValue()%2==1){
			return true;
		}
			return false;}
	
	public static boolean IsPrime(MyInteger MyInt){
		int counter=2;
		while(MyInt.getValue()%counter!=0 && counter<MyInt.getValue()){
			counter++;
			}
		if (counter == MyInt.getValue()){
			return true;
			}
			return false;
			}
	
	public boolean equals(int value){
		if (value == this.Value) {
			return true;
			}
		return false;
		
	}
	public boolean equals(MyInteger someValue) {
		if (someValue.getValue() == this.Value) {
			return true;
		}
		return false;
	}


	public static int parseInt(char[] rob){
		int length = rob.length;
		int sum = 0;
		for (int i = 0; i < length; i++) {
		    sum += rob[i];
		}
		return sum;
	}
	
	public static int parseInt(String rob){
		int num = parseInt(rob);
		return num;
	}
}

