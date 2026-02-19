package smartHomeProject;
import java.util.ArrayList;

public class SmartHomeSystem {
	private ArrayList<Devices> deviceList; //storage list for all devices
	
	public SmartHomeSystem() { //constructor
		deviceList = new ArrayList<>();
	}
	
	public void registerDevice(Devices device) { //adds new device to the deviceList array
		deviceList.add(device);
	}
	
	public ArrayList<Devices> getDevices() { //returns the deviceList array
        return deviceList;
    }
	
	
}
