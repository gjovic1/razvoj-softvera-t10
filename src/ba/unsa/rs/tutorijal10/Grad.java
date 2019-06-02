package ba.unsa.rs.tutorijal10;

import java.io.Serializable;

public class Grad implements Serializable {
    private String cityName;
    private int cityPop;
    private double[] temps = new double[1000];
    private int j = 0;
    private static final long serialVersionUID = 1L;

    public Grad(){

    }

    public Grad(String cityName, double[] temps, int j) {
        this.cityName = cityName;
        this.cityPop = 0;
        this.j = j;
        this.setTemps(temps,j);
    }

    public Grad(String cityName, double[] temps, int j, int cityPop){
        this.cityName = cityName;
        this.j = j;
        setTemps(temps,j);
        this.cityPop=cityPop;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityPop() {
        return cityPop;
    }

    public void setCityPop(int cityPop) {
        this.cityPop = cityPop;
    }

    public double[] getTemps() {
        return temps.clone();
    }

    public void setTemps(double[] temps, int j) {
        if(temps!=null)
            System.arraycopy(temps, 0, this.temps,0, j);
    }
}
