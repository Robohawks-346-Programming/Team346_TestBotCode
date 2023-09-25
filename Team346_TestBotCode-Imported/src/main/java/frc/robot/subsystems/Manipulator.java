package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import frc.robot.Constants;

public class Manipulator {
    CANSparkMax intakeMotor1, intakeMotor2;

    public Manipulator() {
        intakeMotor1 = new CANSparkMax(Constants.INTAKE_MOTOR_1_ID, MotorType.kBrushless);
        intakeMotor2 = new CANSparkMax(Constants.INTAKE_MOTOR_2_ID, MotorType.kBrushless);
    }

    public void intakeIn() {
        intakeMotor1.set(0.5);
        intakeMotor2.set(0.5);
    }

    public void intakeOut() {
        intakeMotor1.set(-0.5);
        intakeMotor2.set(-0.5);
    }
}
