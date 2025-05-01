# 🌤️ Weather API - Spring Boot Project

A simple RESTful API built using **Spring Boot** that fetches and returns real-time weather data from the [Open-Meteo API](https://open-meteo.com/).
This project demonstrates how to consume external APIs using `RestTemplate` and structure responses in a user-friendly JSON format.

---

## 🚀 Features

- Fetch weather data based on latitude and longitude
- Combine weather values with units (e.g., "40.2 °C")
- RESTful `GET` endpoint
- Clean and readable JSON response

---

## 📦 Technologies Used

- Java 17+
- Spring Boot
- RestTemplate (for API calls)
- Jackson (for JSON parsing)
- Maven (for dependency management)

---

## 🛠️ Getting Started

### Prerequisites

- Java 17+
- Maven
- Git 

### 📡 API Usage
## Endpoint

GET /weather/{longitude}/{latitude}
## Example Request
GET http://localhost:8080/weather/74.625/26.5

## Sample Response
  {
    "latitude": 26.5,
    "longitude": 74.625,
    "timezone": "Asia/Kolkata",
    "timezone_abbreviation": "GMT+5:30",
    "elevation": 482.0,
    "weather": {
      "temperature_2m": "40.2 °C",
      "relative_humidity_2m": "22 %",
      "apparent_temperature": "44.3 °C",
      "is_day": 1,
      "wind_speed_10m": "1.0 km/h",
      "wind_direction_10m": "225 °",
      ...
    }
  }
