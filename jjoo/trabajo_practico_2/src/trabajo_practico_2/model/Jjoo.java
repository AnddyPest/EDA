package trabajo_practico_2.model;

public class Jjoo implements Comparable<Jjoo> {

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

    @Override
    public int compareTo(Jjoo o) {
        if (o.getOro() == this.getOro() && o.getBronce() == this.getBronce() && o.getPlata() == this.getPlata()) {
            return o.getPais().compareTo(this.getPais());
        }
        if (o.getOro() == this.getOro() && o.getPlata() == this.getPlata()) {
            if (o.getBronce() < this.getBronce()) {
                return 1;
            } else {
                return -1;
            }
        }
        if (o.getOro() == this.getOro()) {
            if (o.getPlata() < this.getPlata()) {
                return 1;
            } else {
                return -1;
            }
        }
        if (o.getOro() < this.getOro()) {
            return 1;
        } else {
            return -1;
        }

    }
}
