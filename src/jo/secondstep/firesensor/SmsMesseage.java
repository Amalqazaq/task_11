package jo.secondstep.firesensor;

public class SmsMesseage implements FireEmergency {
    private String phoneNumber;
	
    public SmsMesseage(String phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
    

	@Override
	public void run() {
		System.out.println("send message for: "+phoneNumber);
	}

}
