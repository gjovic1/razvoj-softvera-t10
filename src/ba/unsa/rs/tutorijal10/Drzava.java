package ba.unsa.rs.tutorijal10;

public class Drzava {
    private String stateName;
    private int statePop;
    private double area;
    private String areaUnit = "km2";
    private Grad capital;

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
}
