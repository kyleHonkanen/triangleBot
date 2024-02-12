package frc.robot;

import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;

public class driveTrain {
    //the drivetrain subsystem for triangle bot
    public PWMVictorSPX motor0;
    public PWMVictorSPX motor1;
    public PWMVictorSPX motor2;
    private static driveTrain instance;

    public static driveTrain getInstance() {
        if (instance==null) {
            instance=new driveTrain();
        }
        return instance;
    }
    public driveTrain() {
        motor0 = new PWMVictorSPX(0);
        motor1 = new PWMVictorSPX(1);
        motor2 = new PWMVictorSPX(2);
    }
}
