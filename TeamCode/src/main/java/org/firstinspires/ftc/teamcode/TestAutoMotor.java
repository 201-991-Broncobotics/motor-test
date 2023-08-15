package org.firstinspires.ftc.teamcode.TestAutoMotor;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "TestAutoMotor", group = "Test")
public class TestAutoMotor extends LinearOpMode {

  public void runOpMode() {
    DcMotor leftBack = hardwareMap.get(DcMotor.class, "leftBack");
    DcMotor rightBack = hardwareMap.get(DcMotor.class, "rightBack");
    DcMotor leftFront = hardwareMap.get(DcMotor.class, "leftFront");
    DcMotor rightFront = hardwareMap.get(DcMotor.class, "rightFront");

    waitForStart();

    leftBack.setPower(1);
    rightBack.setPower(1);
    leftFront.setPower(1);
    rightFront.setPower(1);

    sleep(1000);

    leftBack.setPower(0);
    rightBack.setPower(0);
    leftFront.setPower(0);
    rightFront.setPower(0);
  }
}
