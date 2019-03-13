package package_1.Telephone;

public class Apple {
    private String manufacturer, serialNumber;
    private float price;

    public Apple(String manufacturer, String serialNumber, float price) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString()
    {

        return "manufacturer: " + manufacturer + "\n" + "Prise is: "+ price + "\n" +
                "serialNumber: " + serialNumber;
    }

}
