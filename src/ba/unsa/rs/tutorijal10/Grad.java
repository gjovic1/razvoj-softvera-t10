package ba.unsa.rs.tutorijal10;

import java.io.Serializable;

public class Grad implements Serializable {
    private String cityName;
    private int cityPop;
    private double[] temps = new double[1000];
    private int j = 0;
    private static final long serialVersionUID = 1L;

    public Grad(String name, double[] mjerenja, int j) {
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
        return temps;
    }

    public void setTemps(double[] temps) {
        this.temps = temps;
    }
}
