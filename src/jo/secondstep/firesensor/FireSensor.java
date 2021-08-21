package jo.secondstep.firesensor;

import java.util.*;
public class FireSensor {
    List<FireEmergency> fireEmergencies=new ArrayList<>();

    
    public void addEmergency(FireEmergency emergency) {
    	fireEmergencies.add(emergency);
    }
	
    public void removeEmergency(FireEmergency emergency) {
 	   fireEmergencies.remove(emergency);
    }
    
	public void update() {
		
		/*Thread t1=new Thread(new SmsMesseage("7787887"));
		t1.setName("Thread-1");
		System.out.println(t1.getName());
		t1.start();*/
		
		 int i=1;
		for(FireEmergency emergency:fireEmergencies) {
			Thread t=new Thread(emergency);
			t.setName("thread"+i);
			i++;
			System.out.println(t.getName());
			t.start();
		}
	}
	
}
