package FirstLesson;

public class Bulb {
	char power;
	boolean isOn;
	
	public void turnOn() {
		isOn = true;
		System.out.println("On");
	}
	
    public void turnOff () {
    	isOn = false;
    	System.out.println("Off");
    }
}
