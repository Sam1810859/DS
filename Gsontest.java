import com.google.gson.Gson;

public class GsonExample {
    public static void main(String[] args) {
        Gson gson = new Gson();

        // Example object to JSON conversion
        WeatherData weatherData = new WeatherData();
        weatherData.setId("001");
        weatherData.setTemperature("22C");
        weatherData.setCondition("Cloudy");

        // Convert to JSON
        String json = gson.toJson(weatherData);
        System.out.println("JSON representation: " + json);
    }
}

class WeatherData {
    private String id;
    private String temperature;
    private String condition;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
