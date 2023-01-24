package hyfstu.interface_;

public class Computer {
    public void work(USBInterface usbInterface){
        usbInterface.start();
        usbInterface.stop();
    }
}
