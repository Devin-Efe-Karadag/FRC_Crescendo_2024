package frc.robot.commands;

import frc.robot.subsystems.IntakeSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj.PS4Controller;
import edu.wpi.first.wpilibj.Timer;




public class IntakeCommand extends Command {
    private final IntakeSubsystem intakeSubsystem;
    private PS4Controller driver;
    private final Timer timer = new Timer();
    private boolean isDelayActive = false;
    


    public IntakeCommand(IntakeSubsystem intakeSubsystem, PS4Controller driver) {
        addRequirements(intakeSubsystem);
         
        this.intakeSubsystem = intakeSubsystem;
        this.driver = driver;

        
    }

    @Override
    public void execute() {

        if(driver.getL1Button()){
            intakeSubsystem.openIntake();
            intakeSubsystem.setIntakeSpeed(-0.5);
        }

        if(driver.getL2Button()) {
            intakeSubsystem.stopMotors();
            intakeSubsystem.closeIntake();
        }

         if(driver.getR2Button()) {

            intakeSubsystem.setIntakeSpeed(0.4);


        }

         if(driver.getCircleButton()) {

            intakeSubsystem.stopMotors();

 
         }
    }

}

// L1 Button, intake alım: intake open position, roller (-), TimeDelay 2 seconds, roller (0), intake close position.

// Yukarı yön tuşu shooter açı: shooter angle(angle1), shooter(+), TimeDelay 2 seconds, feedmotor(+), roller(+)
// Sol yön tuşu shooter açı: shooter angle(angle2), shooter(+), TimeDelay 2 seconds, feedmotor(+), roller(+)
//Sağ yön tuşu shooter açı: shooter angle(angle3), shooter(+), TimeDelay 2 seconds, feedmotor(+), roller(+)



    
    
    

    
