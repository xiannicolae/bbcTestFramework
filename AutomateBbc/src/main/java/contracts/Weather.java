package contracts;

/**
 * Created by christiann on 27/06/2017.
 */

public class Weather {
    private int maxTemperature;
    private String maxTemperatureUnit;
    private int minTemperature;
    private String minTemperatureUnit;
    private String windSpeed;
    private String location;

    public String getMaxTemperatureUnit() {
        return maxTemperatureUnit;
    }

    public void setMaxTemperatureUnit(String maxTemperature) {
        this.maxTemperature = Integer.valueOf(maxTemperature.replaceAll("[^0-9]", ""));
        this.maxTemperatureUnit = maxTemperature;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getMinTemperatureUnit() {
        return minTemperatureUnit;
    }

    public void setMinTemperatureUnit(String minTemperatureUnit) {
        this.minTemperature = Integer.valueOf(minTemperatureUnit);
        this.minTemperatureUnit = minTemperatureUnit;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    @Override
    public String toString(){
        String output = "";

        if (location != null) {
            output += "Location: " + location + "\n";
            if (maxTemperatureUnit != null) output += "Maximum temperature: " + maxTemperatureUnit + "\n";
            if (minTemperatureUnit != null) output += "Minimum temperature: " + minTemperatureUnit + "\n";
            if (windSpeed != null) output += "Wind speed: " + windSpeed;
        }

        return output;
    }
}