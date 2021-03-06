package org.usfirst.frc.team2903.robot.commands;

import org.usfirst.frc.team2903.robot.OI;
import org.usfirst.frc.team2903.robot.Robot;




import edu.wpi.first.wpilibj.command.Command;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Teleop extends Command {

	public Teleop() {
		requires(Robot.driveSubsystem);
		//requires(Robot.pneumaticsSubsystem);
	}

	protected void initialize() {
		// Robot.elevatorSubsystem.encoder.reset();
		
	}

	// @SuppressWarnings("deprecation")
	protected void execute() {

		
		// Robot.driveSubsystem.drive(OI.controller.getRawAxis(0),
		// OI.controller.getRawAxis(2),OI.controller.getRawAxis(1));
		Robot.driveSubsystem.drive(OI.Joy2.getX(), OI.Joy1.getY(),
				OI.Joy1.getX());
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
	}

	protected void interrupted() {
	}
}
