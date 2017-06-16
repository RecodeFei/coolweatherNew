package app.coolweather.com.coolweathernew.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by feikuang on 6/15/17.
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
