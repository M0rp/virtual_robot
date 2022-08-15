package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import org.firstinspires.ftc.teamcode.teleop.DriveClass;

@TeleOp (name = "Tele Test", group="Drive")
public class TeleDemo extends OpMode {
    DcMotor leftMotor;
    DcMotor rightMotor;

    DriveClass drive;

    @Override
    public void init() {
        leftMotor = hardwareMap.dcMotor.get("leftMotor");
        rightMotor = hardwareMap.dcMotor.get("rightMotor");

        drive = new DriveClass(leftMotor, rightMotor);
    }

    @Override
    public void loop() {
        drive.driveControl(gamepad1);
    }
}
