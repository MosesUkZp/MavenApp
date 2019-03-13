package package_1.Telephone;

public class Monitor extends Apple{
    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, String serialNumber, float price, int resolutionX, int resolutionY) {
        super(manufacturer, serialNumber, price);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionY(int i) {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }
    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionY) {
        this.resolutionX = resolutionY;
    }

    @Override
    public String toString() {
        return super.toString()
            + "\n"+ "X = " + resolutionX
                + "\n"+ "Y = " + resolutionY;
    }
}

