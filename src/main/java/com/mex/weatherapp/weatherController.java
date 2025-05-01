package com.mex.weatherapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/weather")
public class weatherController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/{lonitude}/{latitude}")
    public Map<String, Object> getWeather(@PathVariable String latitude, @PathVariable String lonitude) {
        String url = "https://api.open-meteo.com/v1/forecast?latitude="+latitude+"&longitude="+lonitude+"&current=temperature_2m,relative_humidity_2m,apparent_temperature,is_day,wind_speed_10m,wind_direction_10m,precipitation,rain,showers,weather_code,cloud_cover,pressure_msl,surface_pressure,wind_gusts_10m&timezone=auto";
        WeatherResponse weatherResponse = restTemplate.getForObject(url, WeatherResponse.class);
        // Combine current values with units
        Map<String, Object> combined = new LinkedHashMap<>();
        WeatherResponse.Current current = weatherResponse.getCurrent();
        WeatherResponse.Units units = weatherResponse.getCurrentUnits();

        combined.put("temperature_2m", current.getTemperature2m() + " " + units.getTemperature2m());
        combined.put("relative_humidity_2m", current.getRelativeHumidity2m() + " " + units.getRelativeHumidity2m());
        combined.put("apparent_temperature", current.getApparentTemperature() + " " + units.getApparentTemperature());
        combined.put("is_day", current.getIsDay());
        combined.put("wind_speed_10m", current.getWindSpeed10m() + " " + units.getWindSpeed10m());
        combined.put("wind_direction_10m", current.getWindDirection10m() + " " + units.getWindDirection10m());
        combined.put("precipitation", current.getPrecipitation() + " " + units.getPrecipitation());
        combined.put("rain", current.getRain() + " " + units.getRain());
        combined.put("showers", current.getShowers() + " " + units.getShowers());
        combined.put("weather_code", current.getWeatherCode() + " " + units.getWeatherCode());
        combined.put("cloud_cover", current.getCloudCover() + " " + units.getCloudCover());
        combined.put("pressure_msl", current.getPressureMsl() + " " + units.getPressureMsl());
        combined.put("surface_pressure", current.getSurfacePressure() + " " + units.getSurfacePressure());
        combined.put("wind_gusts_10m", current.getWindGusts10m() + " " + units.getWindGusts10m());

        // Optional: Add metadata like timezone, elevation, etc.
        Map<String, Object> result = new LinkedHashMap<>();
        result.put("latitude", weatherResponse.getLatitude());
        result.put("longitude", weatherResponse.getLongitude());
        result.put("timezone", weatherResponse.getTimezone());
        result.put("timezone_abbreviation", weatherResponse.getTimezoneAbbreviation());
        result.put("elevation", weatherResponse.getElevation());
        result.put("weather", combined);

        return result;
    }
}
