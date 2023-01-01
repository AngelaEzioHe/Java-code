package com.hyfstu.extend_.exercise;

public class ExtendsExercise03 {
    public static void main(String[] args) {
        PC pc = new PC("intel",16,500,"IBM");
        pc.printInfo();
        NotePad notePad = new NotePad("AMD",32,1024,"white");
        notePad.printInfo();
    }
}