package com.example.Opps;

public class Phone {
    private String name;
    int screenSize;
    private int memoryRam;
    int camera;

    public String getMemoryRam() {
        return memoryRam + " GB";
    }

    public void setMemoryRam(int memoryRam) {
        this.memoryRam = memoryRam;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getScreenSize() {
        return screenSize + " Inch";
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public String getCamera() {
        return camera + " MP";
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public Phone(String name, int memoryRam) {
        this.name = name;
        this.memoryRam = memoryRam;
    }

    public Phone(String name, int screenSize, int memoryRam, int camera) {
        this.name = name;
        this.screenSize = screenSize;
        this.memoryRam = memoryRam;
        this.camera = camera;
    }

    public void playMusic(String trackName) {
        System.out.println("playing " + trackName + "...");
    }
}
