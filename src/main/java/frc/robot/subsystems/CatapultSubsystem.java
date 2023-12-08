// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;

public class CatapultSubsystem extends SubsystemBase {
  private PWMSparkMax catapultMotor = new PWMSparkMax(0);
  public CatapultSubsystem() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setCatapultMotor(double speed){
    catapultMotor.set(speed);
  }
}
