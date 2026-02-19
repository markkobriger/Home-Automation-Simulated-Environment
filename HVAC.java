package smartHomeProject;

public class HVAC extends Devices{
	public enum Mode {
        HEAT,
        AC
    }

    private Mode mode;
	private int temp; 

	HVAC(String name) { //superclass to Devices()
		super(name);
		mode = mode.HEAT; //automatically set to heat
		temp = 70; //automatically set to 70
	}
	
	//setters
	public void setMode(Mode mode) {
        this.mode = mode;
    }

	public void setTemp(int temp) {
		if(temp >= 60 && temp <= 85) this.temp = temp;
		else System.out.println("Temperature must be within range 60-85");
	}
	
	//getters
    public Mode getMode() {
        return mode;
    }
	
	int getTemp() {
		return temp;
	}
	
	@Override //stores the name and isOn status, but also adds the heatOrAC and temp statuses
	public String toString() {
	    return this.getName() + " (" + (this.getIsOn() ? "ON" : "OFF") + ")" + " (" + (this.getMode() == Mode.HEAT ? "HEAT " : "AC ") + this.getTemp() + ")";
	}

	
	
	
}
