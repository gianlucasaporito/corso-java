package srl.neotech.meteo.model;

public class MeteoGiorno {
 private String sunset;
 private String sunrise;
 private String data;
 private String weather;

 @Override
public String toString() {
    return "MeteoGiorno [sunset=" + sunset + ", sunrise=" + sunrise + ", data=" + data + ", weather=" + weather + "]";
}
public String getSunset() {
    return sunset;
}
public void setSunset(String sunset) {
    this.sunset = sunset;
}
public String getSunrise() {
    return sunrise;
}
public void setSunrise(String sunrise) {
    this.sunrise = sunrise;
}
public String getData() {
    return data;
}
public void setData(String data) {
    this.data = data;
}
public String getWeather() {
    return weather;
}
public void setWeather(String weather) {
    this.weather = weather;
}
 
}
