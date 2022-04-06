// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.DefaultDriveCommand;
import frc.robot.subsystems.DrivetrainSubsystem;

public class RobotContainer {

  private final DrivetrainSubsystem drivetrainSubsystem = new DrivetrainSubsystem();

//Create Joystick objects and declares joystick buttons
  public final static Joystick leftJoy = new Joystick(Constants.leftJoystick);
  public final static Joystick rightJoy = new Joystick(Constants.rightJoystick);

  public JoystickButton rTrigger;
  public JoystickButton lTrigger;
  public JoystickButton lInside;
  public JoystickButton rInside;
  public JoystickButton lOutside;
  public JoystickButton rOutside;
  public JoystickButton rBottom;
  public JoystickButton lBottom;

//Create Gamepad object and delcares gamepad buttons
  public final static Joystick gamepad = new Joystick(Constants.gamepad);

  public JoystickButton gamepadX;	
  public JoystickButton gamepadA;
  public JoystickButton gamepadY;
  public JoystickButton gamepadB;
  public JoystickButton gamepadStart;
  public JoystickButton gamepadSelect;
  public JoystickButton gamepadL1;
  public JoystickButton gamepadR1;
  public JoystickButton gamepadR3;
  public JoystickButton gamepadL3;

  public RobotContainer() {

//Sets and runs default drive command
drivetrainSubsystem.setDefaultCommand(new DefaultDriveCommand(drivetrainSubsystem, 
  () -> -modifyAxis(leftJoy.getY()), 
  () -> -modifyAxis(rightJoy.getY())));


    configureButtonBindings();
  }

  private void configureButtonBindings() {

//Creates Joystick Buttons
  rTrigger = new JoystickButton(rightJoy, Constants.JoystickTriggerR);
  lTrigger = new JoystickButton(leftJoy, Constants.JoystickTriggerL);
  rInside = new JoystickButton(rightJoy, Constants.JoystickRightInside);
  lInside = new JoystickButton(leftJoy, Constants.JoystickLeftInside);
  rOutside = new JoystickButton(rightJoy, Constants.JoystickRightOutside);
  lOutside = new JoystickButton(leftJoy, Constants.JoystickLeftOutside);
  rBottom = new JoystickButton(rightJoy, Constants.JoystickRightBottom);
  lBottom = new JoystickButton(leftJoy, Constants.JoystickLeftBottom);

//Creates Gamepad Buttons 
  gamepadX = new JoystickButton(gamepad, Constants.GamepadX);
  gamepadA = new JoystickButton(gamepad, Constants.GamepadA);
  gamepadY = new JoystickButton(gamepad, Constants.GamepadY);
  gamepadB = new JoystickButton(gamepad, Constants.GamepadB);
  gamepadR1 = new JoystickButton(gamepad, Constants.GamepadR1);
  gamepadL1 = new JoystickButton(gamepad, Constants.GamepadL1);
  gamepadR3 = new JoystickButton(gamepad, Constants.GamepadR3);
  gamepadL3 = new JoystickButton(gamepad, Constants.GamepadL3);

//Joystick Functions


//Gamepad Functions


  }

//Creates deadband Function
  private static double deadband(double value, double deadband) {
    if (Math.abs(value) > deadband) {
      if (value > 0.0) {
        return (value - deadband) / (1.0 - deadband);
      } else {
        return (value + deadband) / (1.0 - deadband);
      }
    } else {
      return 0.0;
    }
  }

//Creates ModifyAxis function
  public static double modifyAxis(double value) {
    value = deadband(value, 0.05);
      return value;
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
