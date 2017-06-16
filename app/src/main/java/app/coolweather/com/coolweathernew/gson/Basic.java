package app.coolweather.com.coolweathernew.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by feikuang on 6/15/17.
 */
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
