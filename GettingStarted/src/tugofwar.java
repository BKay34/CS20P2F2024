import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;

public class tugofwar {



	 public static void main(String[] args) throws Exception{
	 DigitalInput redButton = new DigitalInput();
    DigitalOutput redLED = new DigitalOutput();
    DigitalInput greenButton = new DigitalInput();
    DigitalOutput greenLED = new DigitalOutput();
    int player1 = 0;
    int player2 = 0;
    int buttoncount = 0;
    //Address | Address your four objects which lets your program know where to find them.
    redButton.setHubPort(0);
    redButton.setIsHubPortDevice(true);
    redLED.setHubPort(1);
    redLED.setIsHubPortDevice(true);
    greenButton.setHubPort(5);
    greenButton.setIsHubPortDevice(true);
    greenLED.setHubPort(4);
    greenLED.setIsHubPortDevice(true);
    //Open | Connect your program to your physical devices.
    redButton.open(1000);
    redLED.open(1000);
    greenButton.open(1000);
    greenLED.open(1000);

    	while(player1 < 10 && player2 <10) {
    		if(redButton.getState()); 
    		 redLED.setState(true);
    	 buttoncount++;
        		System.out.println("Your button count is: " + buttoncount + " ");
        		 Thread.sleep(1500);
    	}
    
    	
	 
	 
	 }
}
