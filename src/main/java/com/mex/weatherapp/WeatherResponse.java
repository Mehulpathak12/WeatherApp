package com.mex.weatherapp;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

public class WeatherResponse {
    // Top-level properties
    private double latitude;
    private double longitude;

    @JsonProperty("generationtime_ms")
    private double generationTimeMs;

    @JsonProperty("utc_offset_seconds")
    private int utcOffsetSeconds;

    private String timezone;

    @JsonProperty("timezone_abbreviation")
    private String timezoneAbbreviation;

    private double elevation;

    @JsonProperty("current_units")
    private Units currentUnits;

    private Current current;

    public double getGenerationTimeMs() {
        return generationTimeMs;
    }

    public void setGenerationTimeMs(double generationTimeMs) {
        this.generationTimeMs = generationTimeMs;
    }

    public Units getCurrentUnits() {
        return currentUnits;
    }

    public void setCurrentUnits(Units currentUnits) {
        this.currentUnits = currentUnits;
    }

    public double getElevation() {
        return elevation;
    }

    public void setElevation(double elevation) {
        this.elevation = elevation;
    }

    public String getTimezoneAbbreviation() {
        return timezoneAbbreviation;
    }

    public void setTimezoneAbbreviation(String timezoneAbbreviation) {
        this.timezoneAbbreviation = timezoneAbbreviation;
    }

    public int getUtcOffsetSeconds() {
        return utcOffsetSeconds;
    }

    public void setUtcOffsetSeconds(int utcOffsetSeconds) {
        this.utcOffsetSeconds = utcOffsetSeconds;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    // Nested class for "current_units"
    public static class Units {
        private String time;
        private String interval;

        @JsonProperty("temperature_2m")
        private String temperature2m;

        @JsonProperty("relative_humidity_2m")
        private String relativeHumidity2m;

        @JsonProperty("apparent_temperature")
        private String apparentTemperature;

        @JsonProperty("is_day")
        private String isDay;

        @JsonProperty("wind_speed_10m")
        private String windSpeed10m;

        @JsonProperty("wind_direction_10m")
        private String windDirection10m;
        private String precipitation;
        private String rain;
        private String showers;

        @JsonProperty("weather_code")
        private String weatherCode;

        @JsonProperty("cloud_cover")
        private String cloudCover;

        @JsonProperty("pressure_msl")
        private String pressureMsl;

        @JsonProperty("surface_pressure")
        private String surfacePressure;

        @JsonProperty("wind_gusts_10m")
        private String windGusts10m;

        public String getInterval() {
            return interval;
        }

        public void setInterval(String interval) {
            this.interval = interval;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getTemperature2m() {
            return temperature2m;
        }

        public void setTemperature2m(String temperature2m) {
            this.temperature2m = temperature2m;
        }

        public String getCloudCover() {
            return cloudCover;
        }

        public void setCloudCover(String cloudCover) {
            this.cloudCover = cloudCover;
        }

        public String getWindGusts10m() {
            return windGusts10m;
        }

        public void setWindGusts10m(String windGusts10m) {
            this.windGusts10m = windGusts10m;
        }

        public String getSurfacePressure() {
            return surfacePressure;
        }

        public void setSurfacePressure(String surfacePressure) {
            this.surfacePressure = surfacePressure;
        }

        public String getPressureMsl() {
            return pressureMsl;
        }

        public void setPressureMsl(String pressureMsl) {
            this.pressureMsl = pressureMsl;
        }

        public String getWindDirection10m() {
            return windDirection10m;
        }

        public void setWindDirection10m(String windDirection10m) {
            this.windDirection10m = windDirection10m;
        }

        public String getShowers() {
            return showers;
        }

        public void setShowers(String showers) {
            this.showers = showers;
        }

        public String getWeatherCode() {
            return weatherCode;
        }

        public void setWeatherCode(String weatherCode) {
            this.weatherCode = weatherCode;
        }

        public String getRain() {
            return rain;
        }

        public void setRain(String rain) {
            this.rain = rain;
        }

        public String getPrecipitation() {
            return precipitation;
        }

        public void setPrecipitation(String precipitation) {
            this.precipitation = precipitation;
        }

        public String getIsDay() {
            return isDay;
        }

        public void setIsDay(String isDay) {
            this.isDay = isDay;
        }

        public String getWindSpeed10m() {
            return windSpeed10m;
        }

        public void setWindSpeed10m(String windSpeed10m) {
            this.windSpeed10m = windSpeed10m;
        }

        public String getApparentTemperature() {
            return apparentTemperature;
        }

        public void setApparentTemperature(String apparentTemperature) {
            this.apparentTemperature = apparentTemperature;
        }

        public String getRelativeHumidity2m() {
            return relativeHumidity2m;
        }

        public void setRelativeHumidity2m(String relativeHumidity2m) {
            this.relativeHumidity2m = relativeHumidity2m;
        }
    }

    // Nested class for "current"
    public static class Current {
        private String time;
        private int interval;

        @JsonProperty("temperature_2m")
        private double temperature2m;

        @JsonProperty("relative_humidity_2m")
        private int relativeHumidity2m;

        @JsonProperty("apparent_temperature")
        private double apparentTemperature;

        @JsonProperty("is_day")
        private int isDay;

        @JsonProperty("wind_speed_10m")
        private double windSpeed10m;

        @JsonProperty("wind_direction_10m")
        private int windDirection10m;
        private double precipitation;
        private double rain;
        private double showers;

        @JsonProperty("weather_code")
        private int weatherCode;

        @JsonProperty("cloud_cover")
        private int cloudCover;

        @JsonProperty("pressure_msl")
        private double pressureMsl;

        @JsonProperty("surface_pressure")
        private double surfacePressure;

        @JsonProperty("wind_gusts_10m")
        private double windGusts10m;

        public double getWindGusts10m() {
            return windGusts10m;
        }

        public void setWindGusts10m(double windGusts10m) {
            this.windGusts10m = windGusts10m;
        }

        public double getPressureMsl() {
            return pressureMsl;
        }

        public void setPressureMsl(double pressureMsl) {
            this.pressureMsl = pressureMsl;
        }

        public double getSurfacePressure() {
            return surfacePressure;
        }

        public void setSurfacePressure(double surfacePressure) {
            this.surfacePressure = surfacePressure;
        }

        public int getCloudCover() {
            return cloudCover;
        }

        public void setCloudCover(int cloudCover) {
            this.cloudCover = cloudCover;
        }

        public int getWindDirection10m() {
            return windDirection10m;
        }

        public void setWindDirection10m(int windDirection10m) {
            this.windDirection10m = windDirection10m;
        }

        public int getWeatherCode() {
            return weatherCode;
        }

        public void setWeatherCode(int weatherCode) {
            this.weatherCode = weatherCode;
        }

        public double getShowers() {
            return showers;
        }

        public void setShowers(double showers) {
            this.showers = showers;
        }

        public double getRain() {
            return rain;
        }

        public void setRain(double rain) {
            this.rain = rain;
        }

        public double getApparentTemperature() {
            return apparentTemperature;
        }

        public void setApparentTemperature(double apparentTemperature) {
            this.apparentTemperature = apparentTemperature;
        }

        public double getPrecipitation() {
            return precipitation;
        }

        public void setPrecipitation(double precipitation) {
            this.precipitation = precipitation;
        }

        public double getWindSpeed10m() {
            return windSpeed10m;
        }

        public void setWindSpeed10m(double windSpeed10m) {
            this.windSpeed10m = windSpeed10m;
        }

        public int getIsDay() {
            return isDay;
        }

        public void setIsDay(int isDay) {
            this.isDay = isDay;
        }

        public int getRelativeHumidity2m() {
            return relativeHumidity2m;
        }

        public void setRelativeHumidity2m(int relativeHumidity2m) {
            this.relativeHumidity2m = relativeHumidity2m;
        }

        public double getTemperature2m() {
            return temperature2m;
        }

        public void setTemperature2m(double temperature2m) {
            this.temperature2m = temperature2m;
        }

        public int getInterval() {
            return interval;
        }

        public void setInterval(int interval) {
            this.interval = interval;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

    // …plus getters and setters for all fields…
}
