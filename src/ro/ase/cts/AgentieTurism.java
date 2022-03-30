package ro.ase.cts;

import java.util.List;

public class AgentieTurism {
    String locatie;
    int nrAngaj;
    String denumire;
    List<Serviciu> listaServ;
    List<Client> listaClienti;
    static AgentieTurism instanta= null;


    //constructor privat (singletone)
    private AgentieTurism(String locatie, int nrAngajati,String denumire,
                          List<Serviciu> servicii,List<Client> clienti){
        if(locatie.length()>10)
            this.locatie = locatie;
        if(nrAngajati>0)
            this.nrAngaj = nrAngajati;
        if(denumire.length()>5)
            this.denumire = denumire;
        listaServ = servicii;
        listaClienti=clienti;
    }

    //metoda pentru crearea unei singure instante (prop singleton)
    public static synchronized AgentieTurism getInstance(String locatie, int
            nrAngaj,String denumire,List<Serviciu> servicii,List<Client> clienti){

        if(instanta==null){
            instanta = new AgentieTurism( locatie,  nrAngaj, denumire, servicii,clienti);
        }
        return instanta;
    }

    public static synchronized AgentieTurism getInstance(){
        return instanta;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        if(locatie.length()>0)
            this.locatie = locatie;
    }

    public int getNrAngajati() {
        return nrAngaj;
    }

    public void setNrAngajati(int nrAngajati) {
        if(nrAngajati>0)
            this.nrAngaj = nrAngajati;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        if(denumire.length()>5)
            this.denumire = denumire;
    }

    public List<Serviciu> getServicii() {
        return listaServ;
    }

    public void setServicii(List<Serviciu> servicii) {
        listaServ = servicii;
    }

    public List<Client> getClienti() {
        return listaClienti;
    }

    public void setClienti(List<Client> clienti) {
        listaClienti = clienti;
    }


}