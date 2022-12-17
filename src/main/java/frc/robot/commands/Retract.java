package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class Retract extends CommandBase {
    public Retract() {
        // Use addRequirements() here to declare subsystem dependencies.
        addRequirements(RobotContainer.manipulator);
      }
    
      // Called when the command is initially scheduled.
      @Override
      public void initialize() {
        RobotContainer.manipulator.Retract();

      }
    
      // Called every time the scheduler runs while the command is scheduled.
      @Override
      public void execute() {}
    
      // Called once the command ends or is interrupted.
      @Override
      public void end(boolean interrupted) {
          
      }
    
      // Returns true when the command should end.
      @Override
      public boolean isFinished() {
        return false;
      }
}
