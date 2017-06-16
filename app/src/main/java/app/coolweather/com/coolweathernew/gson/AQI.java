package app.coolweather.com.coolweathernew.gson;

/**
 * Created by feikuang on 6/15/17.
 */
public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;

        public String pm25;
    }
}