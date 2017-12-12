package org.usfirst.frc.team972.robot;
import edu.wpi.first.wpilibj.*;
public class Robot extends IterativeRobot {
	Spark motorleft = new Spark (0);
	Spark motorright = new Spark (1);
	Victor motor3 = new Victor (5);
	Joystick joy = new Joystick (0);
    public void teleopInit() {     
    }
    public void teleopPeriodic() {  
    	double speed1 = joy.getRawAxis(1);
    	double speed2 = joy.getRawAxis(5);
    	boolean button1 = joy.getRawButton(1);
    	motorleft.set(speed1);
    	motorright.set(-speed2);
    	if (button1){
    		motor3.set(0.5);
    	}
    	else{
    		motor3.set(0);
    	}
    }    
}