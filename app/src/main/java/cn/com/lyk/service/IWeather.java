package cn.com.lyk.service;

import cn.com.lyk.been.WeatherBean;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by lyk on 2017/10/31.
 */

public interface IWeather {
    @GET("/v3/weather/now.json")
    Call<WeatherBean> weather(@Query("key")String key,@Query("localtion") String localtion);
}
