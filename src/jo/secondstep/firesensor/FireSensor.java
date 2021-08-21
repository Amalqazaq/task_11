package jo.secondstep.firesensor;

public class FireSensor {
   
	
	
	
	public void sendSMS(String phoneNumber) {
		System.out.println("send message for: "+phoneNumber);
	}
	
	public void callFireDepartment() {
		System.out.println("call 911");
	}
	
	
	public void waterSplashing() {
		System.out.println("water splashing");
	}
	
	public void update(String phoneNumber) {
		 sendSMS(phoneNumber);
		 callFireDepartment();
		 waterSplashing();
	}
	
}
