package ba.unsa.rs.tutorijal10;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Tutorijal {
    public static ArrayList<Grad> ucitajGradove() {
        ArrayList<Grad> gradovi = new ArrayList<>();
        Scanner s = null;
        try
        {
            s = new Scanner(new FileReader("mjerenja.txt"));

        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
            return null;
        }

        String name = "";
        double[] mjerenja = new double[1000];

        int j=0;
        String nekitemp = "";

        while (s.hasNext()){
            nekitemp=s.nextLine();
            nekitemp=nekitemp.replace(",","\n");
            Scanner PARS3 = new Scanner(nekitemp);
            name = PARS3.nextLine();
            for(int i=0; PARS3.hasNextLine() && i<1000; i++, j++){
                mjerenja[i] = PARS3.nextDouble();
            }
            gradovi.add(new Grad(name,mjerenja,j));
            j=0;
        }
        return gradovi;

    }
    public static void main(String[] args) throws IOException {
        Tutorijal tutorijal = new Tutorijal();
        System.out.println();

    }

}
