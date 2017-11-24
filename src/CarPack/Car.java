package CarPack;

/**
 * @author Jude Kallista-Fitzpatrick
 * Date:11/23/2017
 */

public class Car {
    private String make;
    private String color;
    private double engineSize;
    private int horsePower;
    private static int count = 0;

    /**
     *
     */
    public Car() {
        make = "Toyota";
        color = "white";
        engineSize = 5.2;
        horsePower = 300;
        count++;
    }

    /**
     * @param make
     * @param color
     * @param engineSize
     * @param horsePower
     */

    public Car(String make, String color, double engineSize, int horsePower) {
        this.make = make;
        this.color = color;
        this.engineSize = engineSize;
        this.horsePower = horsePower;
        count++;
    }

    /**
     * @return
     */

    public static int getCount() {
        return count;
    }

    /**
     * @return
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return
     */
    public double getEngineSize() {
        return engineSize;
    }

    /**
     * @param engineSize
     */

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    /**
     * @return
     */

    public int getHorsePower() {
        return horsePower;
    }

    /**
     * @param horsePower
     */

    public void setHorsePower(int horsePower) { this.horsePower = horsePower; }

    /**
     *
     * @param obj
     * @return
     */

    public boolean equals(Car obj) {
        boolean status = false;
        status = this.getColor().equals(obj.getColor()) && this.getEngineSize() == obj.getEngineSize() && this.getHorsePower() == obj.getHorsePower() && this.getMake().equals(obj.getMake());
        return status;
    }

    @Override
    public String toString() {
        return "CarPack.Car{" +
                "make='" + make + '\'' +
                ", color='" + color + '\'' +
                ", engineSize=" + engineSize +
                ", horsePower=" + horsePower +
                '}';
    }
}
