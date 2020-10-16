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

    public boolean cooling() {
        boolean status = false;
        if (airConditioning) {
            if (cubicArea <= 100) {
                status = coolingSettings(true, 3);
            } else if ((cubicArea > 100) && (cubicArea < 150)) {
                status = coolingSettings(true, 2);
            } else if (cubicArea >= 150) {
                status = coolingSettings(true, 1);
            }
        }
        return status;
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

    @Override
    public String toString() {
        return "Temperature: " + temperature;
    }

    private boolean coolingSettings(boolean status, int n) {
        if (temperature > LIMIT_TEMPERATURE) {
            double tmp = temperature;
            temperature = temperature - n * airConditioningPerformance;
            if (temperature <= LIMIT_TEMPERATURE) {
                temperature = tmp;
                status = false;
            }
        }
        return status;
    }
}
