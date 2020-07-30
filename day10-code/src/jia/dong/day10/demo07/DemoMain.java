package jia.dong.day10.demo07;

import java.util.zip.CheckedOutputStream;

public class DemoMain {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.powerOn();

//        Mouse mouse=new Mouse();
//        USB usb=mouse;
        //创建一个鼠标 向上转型
        USB usbMouse=new Mouse();
        computer.usbDevice(usbMouse);//参数是USB类型

        //创建一个USB键盘
        Keyboard keyboard=new Keyboard();
        computer.usbDevice(keyboard);
//        computer.usbDevice(new Keyboard());
        computer.powerOff();

        method(10.0);
        method(20);
    }
    public static void method(double num){
        System.out.println(num);
    }
}
