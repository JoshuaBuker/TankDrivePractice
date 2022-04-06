// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

//Drivetrain Constants
    //Motor IDs
    public static int LEFT_FRONT_DRIVE = 27;
    public static int RIGHT_FRONT_DRIVE = 21;
    public static int LEFT_BACK_DRIVE = 25;
    public static int RIGHT_BACK_DRIVE = 23;

    public static int LEFT_FRONT_STEER = 28;
    public static int RIGHT_FRONT_STEER = 22;
    public static int LEFT_BACK_STEER = 29;
    public static int RIGHT_BACK_STEER = 24;

    //Creating Motors
    public static CANSparkMax LeftFrontDrive = new CANSparkMax(Constants.LEFT_FRONT_DRIVE, MotorType.kBrushless);
    public static CANSparkMax RightFrontDrive = new CANSparkMax(Constants.RIGHT_FRONT_DRIVE, MotorType.kBrushless);
    public static CANSparkMax LeftBackDrive = new CANSparkMax(Constants.LEFT_BACK_DRIVE, MotorType.kBrushless);
    public static CANSparkMax RightBackDrive = new CANSparkMax(Constants.RIGHT_BACK_DRIVE, MotorType.kBrushless);

    public static CANSparkMax LeftFrontSteer = new CANSparkMax(Constants.LEFT_FRONT_STEER, MotorType.kBrushless);
    public static CANSparkMax RightFrontSteer = new CANSparkMax(Constants.RIGHT_FRONT_STEER, MotorType.kBrushless);
    public static CANSparkMax LeftBackSteer = new CANSparkMax(Constants.LEFT_BACK_STEER, MotorType.kBrushless);
    public static CANSparkMax RightBackSteer = new CANSparkMax(Constants.RIGHT_BACK_STEER, MotorType.kBrushless);



//Controller Constants
    //Joystick IDs
    public static final int rightJoystick = 0;
    public static final int leftJoystick = 1;

    //Gamepad ID
    public static final int gamepad = 3;

    //Joystick Button IDs
    public static int JoystickTriggerR = 1;
    public static int JoystickTriggerL = 1;
    public static int JoystickLeftInside = 4;
    public static int JoystickRightInside = 3;
    public static int JoystickRightOutside = 4;
    public static int JoystickLeftOutside = 3;
    public static int JoystickRightBottom = 2;
    public static int JoystickLeftBottom = 2;

    //Gamepad Button IDs
    public static int GamepadA = 1;
    public static int GamepadB = 2;
    public static int GamepadX = 3;
    public static int GamepadY = 4;
    public static int GamepadL1 = 5;
    public static int GamepadR1 = 6;          
    public static int GamepadR3 = 9;
    public static int GamepadL3 = 10;


}
