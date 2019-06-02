package ba.unsa.rs.tutorijal10;

import java.io.Serializable;

public class Drzava implements Serializable {
    private String stateName;
    private int statePop;
    private double area;
    private String areaUnit;
    private Grad capital;
    private static final long serialVersionUID = 1L;

    public Drzava(String stateName, int statePop, double area, String areaUnit, Grad capital) {
        this.stateName = stateName;
        this.statePop = statePop;
        this.area = area;
        this.areaUnit = areaUnit;
        this.capital = capital;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public int getStatePop() {
        return statePop;
    }

    public void setStatePop(int statePop) {
        this.statePop = statePop;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getAreaUnit() {
        return areaUnit;
    }

    public void setAreaUnit(String areaUnit) {
        this.areaUnit = areaUnit;
    }

    public Grad getCapital() {
        return capital;
    }

    public void setCapital(Grad capital) {
        this.capital = capital;
    }

    @Override
    public String toString(){
        return "Drzava {" + "naziv='" + stateName + '\'' + ", statePop='" + statePop + ", area=" + area +
                ", areaUnit='" + areaUnit + '\'' + ", capital=" + capital + '}';
    }
}
