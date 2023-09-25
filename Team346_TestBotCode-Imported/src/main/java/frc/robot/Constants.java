// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    // Motor IDs
    public static final int LEFT_PRIMARY_MOTOR_ID               = 11;
    public static final int RIGHT_PRIMARY_MOTOR_ID              = 12;
    public static final int LEFT_REPLICA_MOTOR_ID               = 13;
    public static final int RIGHT_REPLICA_MOTOR_ID              = 14;

    public static final int INTAKE_MOTOR_1_ID                   = 10;
    public static final int INTAKE_MOTOR_2_ID                   = 15;

    // Pneumatic Channel
    public static final int MANIPULATOR_PNEUMATIC_ID            = 0;

    // Motor Speeds
    public static final double DRIVETRAIN_MAX_MOVE_SPEED        = 0.8;
    public static final double DRIVETRAIN_MAX_TURN_SPEED        = 0.75;

    public static final double MANIPULATOR_MOTOR_SPEED          = 0.75;

    // Driver and Operator Port
    public static final int PS4_CONTROLLER_PORT                 = 1;

    //PIDs
    public static final double DRIVE_P                          = 0;
    public static final double DRIVE_I                          = 0;
    public static final double DRIVE_D                          = 0;
    public static final double DRIVE_IZ                         = 0;
    public static final double DRIVE_FF                         = 0;

    public static final double MANIPULATOR_P                    = 0;
    public static final double MANIPULATOR_I                    = 0;
    public static final double MANIPULATOR_D                    = 0;
    public static final double MANIPULATOR_IZ                   = 0;
    public static final double MANIPULATOR_FF                   = 0.01;
    public static final double MANIPULATOR_MIN_OT               = 2000;
    public static final double MANIPULATOR_MUTPUT               = 4000;

    //Robot parameters
    public static final int DRIVETRAIN_WHEEL_DIAMETER           = 5; //5 inch wheels
    public static final double DRIVETRAIN_GEAR_RATIO               = 20;
}
