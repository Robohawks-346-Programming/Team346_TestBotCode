package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
    CANSparkMax leftPrimary, leftReplica ;
    CANSparkMax rightPrimary, rightReplica;
    MotorControllerGroup leftDrive, rightDrive;
}
