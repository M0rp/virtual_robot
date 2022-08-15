package org.firstinspires.ftc.teamcode.teleop;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Gamepad;

public class DriveClass {
    DcMotor leftMotor;
    DcMotor rightMotor;

    public DriveClass(DcMotor lM, DcMotor rM) {
        this.leftMotor = lM;
        this.rightMotor = rM;

        this.rightMotor.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    public void driveControl(Gamepad gamepad) {
        leftMotor.setPower(-gamepad.left_stick_y + gamepad.right_stick_x);
        leftMotor.setPower(-gamepad.left_stick_y - gamepad.right_stick_x);
    }
}
