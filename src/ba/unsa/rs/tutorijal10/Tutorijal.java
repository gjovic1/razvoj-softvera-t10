package ba.unsa.rs.tutorijal10;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Tutorijal {

    public static void zapisiXml(UN un){
        try{
            XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("un.xml")));
            encoder.writeObject(un);
            encoder.close();
        } catch (Exception exc) {
            System.out.println("Error: " + exc);
        }
    }

    public static UN ucitajXml(ArrayList<Grad> gradovi)
    {
        Document xmlDoc = null;
        try
        {
            DocumentBuilder adobeReader = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            xmlDoc = adobeReader.parse(new File("drzave.xml"));
        } catch (Exception e) {
            System.out.println("ne valja ovo nista");
        }
        UN un = new UN();
        ArrayList<Drzava> drzave = new ArrayList<>();

        NodeList drzaveXml = xmlDoc.getElementsByTagName("drzava");

        for(int i = 0; i < drzaveXml.getLength(); i++){
            Node drzavaNode = drzaveXml.item(i);

            if(drzavaNode instanceof Element){
                Element drzaveElem = (Element)drzavaNode;

                int statePop = Integer.parseInt(drzaveElem.getAttribute("stanovnika"));
                String stateName = drzaveElem.getElementsByTagName("naziv").item(0).getTextContent();

                Element capitalXML = (Element)drzaveElem.getElementsByTagName("glavnigrad").item(0);
                int capitalPop = Integer.parseInt(capitalXML.getAttribute("stanovnika"));
                String cityName = capitalXML.getTextContent().trim();

                Element areaXML = (Element)drzaveElem.getElementsByTagName("povrsina").item(0);
                String areaUnit = areaXML.getAttribute("jedinica");
                double area = Double.parseDouble(drzaveElem.getElementsByTagName("povrsina").item(0).getTextContent());

                Grad capital = new Grad(cityName,null,0,capitalPop);
                drzave.add(new Drzava(stateName,statePop,area,areaUnit,capital));

            }
        }
        un.setDrzavas(drzave);
        return un;
    }

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

        while (s.hasNext())
        {
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
        UN un = ucitajXml(null);
        System.out.println(un);
    }

}
