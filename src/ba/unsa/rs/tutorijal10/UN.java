package ba.unsa.rs.tutorijal10;

import java.io.Serializable;
import java.util.ArrayList;

public class UN implements Serializable {
    private ArrayList<Drzava> drzavas;
    private static final long serialVersionUID = 1L;

    public ArrayList<Drzava> getDrzavas() {
        return drzavas;
    }

    public void setDrzavas(ArrayList<Drzava> drzavas) {
        this.drzavas = drzavas;
    }
}
