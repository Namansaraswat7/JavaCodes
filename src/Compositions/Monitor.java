package Compositions;

public class Monitor {
    private  String model;
    private String manufacture;
    private int size;
    private  Resolution nativeResolution;

    public Monitor(String model, String manufacture, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacture = manufacture;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }
    public void drawPixelAt(int x,int y,String color){
        System.out.println("Drawing pixel at"+x+","+y+"in color"+color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
