// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DrivetrainSubsystem extends SubsystemBase {

//Declares Motors and Differential Drive
  CANSparkMax LeftFrontDrive = Constants.LeftFrontDrive;
  CANSparkMax RightFrontDrive = Constants.RightFrontDrive;
  CANSparkMax LeftBackDrive = Constants.LeftBackDrive;
  CANSparkMax RightBackDrive = Constants.RightBackDrive;

//Declares Differencial Drive name
  DifferentialDrive differentialDrive;  

//Creates Speed Controller Groups
  MotorControllerGroup leftMotors = new MotorControllerGroup(LeftFrontDrive, LeftBackDrive);
  MotorControllerGroup rightMotors = new MotorControllerGroup(RightFrontDrive, RightBackDrive);

  public DrivetrainSubsystem() {
    differentialDrive = new DifferentialDrive(leftMotors, rightMotors);
  }

//Create Drive Command
  public void drive(Double leftOutput, Double rightOutput) {
    differentialDrive.tankDrive(leftOutput, rightOutput);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
