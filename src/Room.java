public class Room {
    private double apartmentSize;
    private boolean airConditioning;
    private double airConditioningPerformance;
    private double temperature;
    private double cubicArea;
    private static final double LIMIT_TEMPERATURE = 18;

    public Room(double apartmentSize, boolean airConditioning, double airConditioningPerformance, double temperature, double cubicArea) {
        this.apartmentSize = apartmentSize;
        this.airConditioning = airConditioning;
        this.airConditioningPerformance = airConditioningPerformance;
        this.temperature = temperature;
        this.cubicArea = cubicArea;
    }

    public boolean temperatureSettings() {
        if (airConditioning) {
            if (temperature > LIMIT_TEMPERATURE) {
                temperature--;
                return true;
            } else if (temperature == LIMIT_TEMPERATURE) {
                return false;
            }
        }
        return false;
    }

    public double getApartmentSize() {
        return apartmentSize;
    }

    public void setApartmentSize(double apartmentSize) {
        this.apartmentSize = apartmentSize;
    }

    public boolean isAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    public double getAirConditioningPerformance() {
        return airConditioningPerformance;
    }

    public void setAirConditioningPerformance(double airConditioningPerformance) {
        this.airConditioningPerformance = airConditioningPerformance;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getCubicArea() {
        return cubicArea;
    }

    public void setCubicArea(double cubicArea) {
        this.cubicArea = cubicArea;
    }

    public static double getLimitTemperature() {
        return LIMIT_TEMPERATURE;
    }
}
