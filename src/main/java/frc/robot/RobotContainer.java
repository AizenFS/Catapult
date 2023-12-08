// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import frc.robot.subsystems.CatapultSubsystem;
import frc.robot.commands.CatapultCommand;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;


public class RobotContainer {
  private CatapultSubsystem catapultSubsystem = new CatapultSubsystem();
  private GenericHID controller = new GenericHID(1);


  public RobotContainer() {
    configureButtonBindings();
  }

  private void configureButtonBindings() {
    new JoystickButton(controller, 1).onTrue(new CatapultCommand(catapultSubsystem, 0.5));
    new JoystickButton(controller, 1).onFalse(new CatapultCommand(catapultSubsystem,-0.5));
  }

  
  public Command getAutonomousCommand() {
    return null;
  }
}
