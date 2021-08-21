package jo.secondstep.firesensor;

public class Client {
public static void main(String[] args) {
	FireSensor firesensor= new FireSensor();
	
	SmsMesseage messeage=new SmsMesseage("73738787");
	Water water=new Water();
	FireDepartment department=new FireDepartment();
	
	firesensor.addEmergency(messeage);
	firesensor.addEmergency(department);
	firesensor.addEmergency(water);
	
	firesensor.update();
	
}
}
