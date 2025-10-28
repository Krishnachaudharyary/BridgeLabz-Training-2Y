// Functional interface
@FunctionalInterface
interface LightAction {
    void activate();  // abstract method
}

public class LightAutomation {
    public static void main(String[] args) {

        // Lambda for motion detection
        LightAction motionTrigger = () -> 
            System.out.println("Motion detected! Turning ON hallway lights.");

        // Lambda for time of day
        LightAction eveningTrigger = () -> 
            System.out.println("It's evening! Dimming lights to warm mode.");

        // Lambda for voice command
        LightAction voiceTrigger = () -> 
            System.out.println("Voice command received! Switching lights OFF.");

        // Simulating triggers
        System.out.println("=== Smart Home Light Automation ===");
        motionTrigger.activate();
        eveningTrigger.activate();
        voiceTrigger.activate();
    }
}
