package week1.day2;

public class Mobile {
	
	public static void sendSms() {
	
		System.out.println("From oppo");
	}
	
	public long makecall(long phno) {
		
	return phno;
	}

	public static void main(String[]args) {
	
		Mobile m=new Mobile();
		Mobile.sendSms();
		long makecall = m.makecall(1234567890l);
		System.out.println(makecall);
		
	}

}
