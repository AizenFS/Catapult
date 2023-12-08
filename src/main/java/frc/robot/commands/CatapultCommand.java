// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.CatapultSubsystem;

public class CatapultCommand extends CommandBase {
  private double speed;
  private CatapultSubsystem catapultSubsystem;
  public CatapultCommand(CatapultSubsystem catapultSubsystem,double speed) {
    this.speed=speed;
    this.catapultSubsystem=catapultSubsystem;
    addRequirements(catapultSubsystem);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    catapultSubsystem.setCatapultMotor(speed);
  }

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}
