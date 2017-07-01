package com.android.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Mr.bobo on 2017/7/1.
 */

public class Now {
    @SerializedName("tmp")
    public String temprerature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
