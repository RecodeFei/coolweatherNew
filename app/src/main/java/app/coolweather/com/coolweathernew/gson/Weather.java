package app.coolweather.com.coolweathernew.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by feikuang on 6/15/17.
 */
public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
