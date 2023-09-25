// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.RobotContainer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class DriveStraight extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */

  double targetDistance;
  double rotate = 0.0;
  double tSpeed;
  double m_startTime = -1;
  double m_timeout = -1;

  public static boolean isDone = false;

  public DriveStraight(double distance, double speed) { //Add parameter of maxTime
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(RobotContainer.drivetrain);
    tSpeed = speed;
    targetDistance = distance;
    //this.withTimeout(maxTime);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    RobotContainer.drivetrain.resetDrivetrainEncoders();
    RobotContainer.drivetrain.resetGyro();
    isDone = false;
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    RobotContainer.drivetrain.driveStraightEncoder(tSpeed);
    SmartDashboard.putNumber("Motor left", RobotContainer.drivetrain.getEncoderDistanceLeft());
    SmartDashboard.putNumber("Motor right", RobotContainer.drivetrain.getEncoderDistanceRight());
    SmartDashboard.putNumber("Motor rev drivetrain", RobotContainer.drivetrain.getPositionLeftEncoder());

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    RobotContainer.drivetrain.arcadeDrive(0.0, 0.0);
    isDone = true;
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return RobotContainer.drivetrain.getPositionLeftEncoder() < targetDistance;
  }
}