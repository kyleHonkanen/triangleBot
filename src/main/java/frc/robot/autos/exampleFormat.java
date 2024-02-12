package frc.robot.autos;

import edu.wpi.first.wpilibj.Timer;
import frc.robot.driveTrain;

public class exampleFormat {
    //a basic autonomous path, has everything that you can use to make an auto path for trianglebot
    private driveTrain drivetrain;
    private Timer timer;
    public int stage=0;

    static exampleFormat instance;
    public static exampleFormat getInstance() {
        if (instance==null) {
            instance=new exampleFormat();
        }
        return instance;
    }
    public exampleFormat() {
        drivetrain = driveTrain.getInstance();
        timer= new Timer();
    }
    public void routine() {
        //put the autonomous code here to make it do stuff, you can make a switch statement for it to move through the routine
        
    }
}
