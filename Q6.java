class Device{
    protected String Switch;
    protected String Name;
    Device(String Name){
        this.Name = Name;
    }
    public void performAction(String Action){
        System.out.println("No action to perform Yet!!!");
    }
    public String getName() {
        return Name;
    }
}
class Light extends Device{
    private int Brightness = 100;
    Light(String Name){
        super(Name);
    }
    @Override
    public void performAction(String Action) {
        if (Action.equals("ON")) {
            this.Switch = "ON";
            System.out.println(this.Name+" Switched ON successfully");
        } else if (Action.equals("OFF")) {
            this.Switch = "OFF";
            System.out.println(this.Name+" Switched OFF successfully");
        } else if (Action.equals("DIM")) {
            this.Brightness = 50;
        } else{
            super.performAction(Action);
        }
    }
}
class Thermostat extends Device{
    private int Temperature;
    Thermostat(String Name){
        super(Name);
    }
    @Override
    public void performAction(String Action) {
        this.Switch = "ON";
        if (Action.equals("OFF")) {
            this.Switch = "OFF";
            System.out.println("Thermostat turned off");
        } else if (Action.equals("BOOST")) {
            this.Temperature += 5;
            System.out.println("Temperature Updated");
        }
    }
    
    public void performAction(String Action,int Temp){
        if (Action.equals("SET_TEMPERATURE")) {
            this.Temperature = Temp;
            System.out.println("Temperature set to: "+Temp);
        }
    }
}
class SecurityCamera extends Device{
    SecurityCamera(String Name){
        super(Name);
    }

    @Override
    public void performAction(String Action) {
        if (Action.equals("Alert")) {
            System.out.println("Motion Detected");
        } else if(Action.equals("RECORD")){
            this.Switch = "Record ON";
            System.out.println(this.Name + " Recording in progress");
        } else if (Action.equals("STOP")) {
            this.Switch = "Stop";
            System.out.println(this.Name + " Recording Stopped");
        } else {
            super.performAction(Action);
        }
    }
}
class SmartSpeaker extends Device{
    private int Volume = 0;
    SmartSpeaker(String Name){
        super(Name);
    }
    @Override
    public void performAction(String Action) {
        if (Action.equals("PLAY")) {
            this.Switch = "Play";
            System.out.println("Speaker turned ON");
        } else if (Action.equals("STOP")) {
            this.Switch = "Stop";
            System.out.println("Speaker turned OFF");
        } else if (Action.equals("VOLUME_UP")) {
            this.Volume += 10;
            System.out.println("Volume updated to: "+this.Volume);
        } else if (Action.equals("VOLUME_DOWN")) {
            this.Volume -= 10;
            System.out.println("Volume updated to: "+this.Volume);
        } else {
            super.performAction(Action);
        }
    }
}
public class Q6 {
    public static void main(String[] args) {
        Device[] devices = {
            new Light("Living Room"),
            new Thermostat("Hall"),
            new Thermostat("Drawingroom"),
            new SecurityCamera("Entrance"),
            new SmartSpeaker("Bedroom")
        };
        for (Device device : devices) {
            if ((device instanceof Thermostat) && device.getName().equals("Drawingroom")) {
                ((Thermostat)device).performAction("SET_TEMPERATURE", 25);
            } else if (device instanceof Thermostat) {
                device.performAction("ON"); 
                device.performAction("BOOST");
                device.performAction("OFF");
            } else if (device instanceof SecurityCamera) {
                device.performAction("RECORD");
            }
            else if (device instanceof SmartSpeaker) {
                device.performAction("PLAY");
            } else{
                device.performAction("Dim");
            }
        }
    }
}
