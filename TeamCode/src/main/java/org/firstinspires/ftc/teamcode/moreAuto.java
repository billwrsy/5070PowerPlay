package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.Blinker;
import com.qualcomm.robotcore.hardware.HardwareDevice;
import com.qualcomm.robotcore.hardware.Gyroscope;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous
public class moreAuto extends LinearOpMode {
    private Servo Claw;
    private Blinker control_Hub;
    private Blinker expansion_Hub_1;
    private HardwareDevice webcam_1;
    private DcMotor backLeft;
    private DcMotor backRight;
    private Servo coneExtender;
    private Servo coneGrabber;
    private DcMotor frontLeft;
    private DcMotor frontRight;
    private Gyroscope imu;
    private DcMotor viperSlide;

    public void wait(double time) {
        ElapsedTime waitTime = new ElapsedTime();
        waitTime.startTime();
        while(waitTime.milliseconds() < time) {}
    }
    //viper slide
    public void slide(int position, double power) {
        //high junction encoder: -4129
        viperSlide.setTargetPosition(position);
        viperSlide.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        viperSlide.setPower(power);
        while(viperSlide.isBusy()){
            telemetry.addData("penis", viperSlide.getCurrentPosition());
        }
    }

    //moving forward
    public void forward(int forward, double power){
        //sets encoders to 0
        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        //sets a target encoder value
        frontLeft.setTargetPosition(forward);
        frontRight.setTargetPosition(forward);
        backLeft.setTargetPosition(forward);
        backRight.setTargetPosition(forward);
        //goes to target position
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        //gives motors power (0-1)
        frontLeft.setPower(power);
        frontRight.setPower(power);
        backLeft.setPower(power);
        backRight.setPower(power);

        while(frontLeft.isBusy()){
            telemetry.addData("fuck vishwa ong", viperSlide.getCurrentPosition());
        }
    }

    //moving back
    public void back(int back, double power){
        //sets encoders to 0
        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        //sets a target encoder value
        frontLeft.setTargetPosition(back);
        frontRight.setTargetPosition(back);
        backLeft.setTargetPosition(back);
        backRight.setTargetPosition(back);
        //goes to target position
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        //gives motors power (0-1)
        frontLeft.setPower(-power);
        frontRight.setPower(-power);
        backLeft.setPower(-power);
        backRight.setPower(-power);
        while(frontLeft.isBusy()){
            telemetry.addData("fuck vishwa ong", viperSlide.getCurrentPosition());
        }
    }

    //strafing left
    public void strafeLeft(int strafeLeft, double power){
        //sets encoders to 0
        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        //sets a target encoder value
        frontLeft.setTargetPosition(-strafeLeft);
        frontRight.setTargetPosition(strafeLeft);
        backLeft.setTargetPosition(strafeLeft);
        backRight.setTargetPosition(-strafeLeft);
        //goes to target position
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        //gives motors power (0-1)
        frontLeft.setPower(power);
        frontRight.setPower(power);
        backLeft.setPower(power);
        backRight.setPower(power);
        while(frontLeft.isBusy()){
            telemetry.addData("fuck vishwa ong", viperSlide.getCurrentPosition());
        }
    }

    //strafing right
    public void strafeRight(int strafeRight, double power){
        //sets encoders to 0
        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        //sets a target encoder value
        frontLeft.setTargetPosition(strafeRight);
        frontRight.setTargetPosition(-strafeRight);
        backLeft.setTargetPosition(-strafeRight);
        backRight.setTargetPosition(strafeRight);
        //goes to target position
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        //gives motors power (0-1)n
        frontLeft.setPower(power);
        frontRight.setPower(power);
        backLeft.setPower(power);
        backRight.setPower(power);

        while(frontLeft.isBusy()){
            telemetry.addData("fuck vishwa ong in the ass", viperSlide.getCurrentPosition());
        }
    }
    public void pDrive(int target) {
        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        frontLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        frontRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        backLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        backRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        double kP = 1 / 400.0;

        frontLeft.setTargetPosition(target);
        frontRight.setTargetPosition(target);
        backLeft.setTargetPosition(target);
        backRight.setTargetPosition(target);

        double errorLeft = target - frontLeft.getCurrentPosition();
        double errorRight = target - frontRight.getCurrentPosition();

        while (Math.abs(errorLeft) > 15 && Math.abs(errorRight) > 15) {
            errorLeft = target - frontLeft.getCurrentPosition();
            errorRight = target - frontRight.getCurrentPosition();

            frontLeft.setPower(kP * errorLeft);
            frontRight.setPower(kP * errorRight);
            backLeft.setPower(kP * errorLeft);
            backRight.setPower(kP * errorRight);
        }

        frontLeft.setPower(0);
        frontRight.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
    }

    //right parking
    public void rightParking(){
        Claw.setPosition(0.018);
        pDrive(3130);
        strafeLeft(850,0.6);
        slide(-4129, 0.8);

        forward(450,0.4);
        wait(2000.0);

        Claw.setPosition(0.08);
        wait(300.0);
        pDrive(-300);
        slide(0, 0.6);
        strafeRight(2400,0.8);
    }

    //middle parking
    public void middleParking(){
        Claw.setPosition(0.018);
        pDrive(3130);
        strafeLeft(850,0.6);
        slide(-4129, 0.8);

        forward(400,0.4);
        wait(2000.0);

        Claw.setPosition(0.08);
        wait(300.0);
        pDrive(-300);
        slide(0, 0.6);
        strafeRight(900,0.8);
    }

    //left parking
    public void leftParking(){
        Claw.setPosition(0.018);
        pDrive(3130);
        strafeLeft(850,0.6);
        slide(-4129, 0.8);

        forward(400,0.4);
        wait(2000.0);

        Claw.setPosition(0.08);
        wait(300.0);
        pDrive(-300);
        slide(0, 0.6);
        strafeLeft(900,0.8);
    }



    @Override
    public void runOpMode(){

        backLeft = hardwareMap.get(DcMotor.class, "backLeft");
        backRight = hardwareMap.get(DcMotor.class, "backRight");
        frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
        frontRight = hardwareMap.get(DcMotor.class, "frontRight");
        //mapping
        Pistachio pistachio = new Pistachio(this, hardwareMap);
        viperSlide = hardwareMap.get(DcMotor.class, "viperSlide");
        Claw = hardwareMap.get(Servo.class, "Claw");
        control_Hub = hardwareMap.get(Blinker.class, "Control Hub");
        expansion_Hub_1 = hardwareMap.get(Blinker.class, "Expansion Hub 1");
        webcam_1 = hardwareMap.get(HardwareDevice.class, "Webcam 1");
        coneExtender = hardwareMap.get(Servo.class, "coneExtender");
        coneGrabber = hardwareMap.get(Servo.class, "coneGrabber");
        backLeft = hardwareMap.get(DcMotor.class, "backLeft");
        backRight = hardwareMap.get(DcMotor.class, "backRight");
        frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
        frontRight = hardwareMap.get(DcMotor.class, "frontRight");
        //reverses left motors
        frontLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        backLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        //runs code with encoders
        frontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        frontRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        viperSlide.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);


        waitForStart();
        while (opModeIsActive()){
            //prints live encoder values
            telemetry.addData("frontLeft",frontLeft.getCurrentPosition());
            telemetry.addData("frontRight",frontRight.getCurrentPosition());
            telemetry.addData("backLeft",backLeft.getCurrentPosition());
            telemetry.addData("backRight",backRight.getCurrentPosition());
            telemetry.addData("viperSlide",viperSlide.getCurrentPosition());
            telemetry.addData("frontLeft",frontLeft.getPower());
            telemetry.addData("frontRight",frontRight.getPower());
            telemetry.addData("backLeft",backLeft.getPower());
            telemetry.addData("backRight",backRight.getPower());

            telemetry.update();

            middleParking();
            break;
        }
    }


}