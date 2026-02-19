package smartHomeProject;

public class Devices {
	private boolean isOn; //boolean value that sets a device to on or off
	private String name; //name of the device for storage and control purposes
	
	Devices(String name){ //constructor
		isOn = false;
		this.name = name;
	}
	
	boolean getIsOn() { //returns if device is on or off
		return isOn;
	}
	
	void setOn() { //turns device on
		isOn = true;
	}
	
	void setOff() {	//turns device off
		isOn = false;
	}
	
	public String getName() {  //returns device name
        return name;
    }
	
	@Override //this makes it so the devices in the ArrayList are stored by their name and status
			 //otherwise it stores them as the device type with a bunch of storage location numbers
	public String toString() {
	    return name + " (" + (isOn ? "ON" : "OFF") + ")";
	}
	
}
