// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DrivetrainSubsystem;

public class DefaultDriveCommand extends CommandBase {

//Declares Supplier varibles
  private DoubleSupplier m_leftDoubleSupplier;
  private DoubleSupplier m_rightDoubleSupplier;

private final DrivetrainSubsystem m_drivetrainsubsystem;


  public DefaultDriveCommand(DrivetrainSubsystem drivetrainSubsystem, DoubleSupplier leftDoubleSupplier, DoubleSupplier rightDoubleSupplier) {
    this.m_drivetrainsubsystem = drivetrainSubsystem;
    this.m_leftDoubleSupplier = leftDoubleSupplier;
    this.m_rightDoubleSupplier = rightDoubleSupplier;

    addRequirements(drivetrainSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_drivetrainsubsystem.drive(m_leftDoubleSupplier.getAsDouble(), m_rightDoubleSupplier.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_drivetrainsubsystem.drive(0.0, 0.0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
