
package trabajo_practico_2.model;


public class Jjoo {
    
    private String pais;
    private int oro;
    private int plata;
    private int bronce;
    private int ranking;

    public Jjoo(String pais, int oro, int plata, int bronce) {
        this.pais = pais;
        this.oro = oro;
        this.plata = plata;
        this.bronce = bronce;
    }

    public Jjoo() {
    }
    
    

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public int getPlata() {
        return plata;
    }

    public void setPlata(int plata) {
        this.plata = plata;
    }

    public int getBronce() {
        return bronce;
    }

    public void setBronce(int bronce) {
        this.bronce = bronce;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
    
    
}
