package trabajo_practico_2.model;

import java.util.Objects;

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
        if (this.oro != o.oro) {
            return Integer.compare(o.oro, this.oro);
        }
        if (this.plata != o.plata) {
            return Integer.compare(o.plata, this.plata);
        }
        if (this.bronce != o.bronce) {
            return Integer.compare(o.bronce, this.bronce);
        }
        return this.pais.compareTo(o.pais);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Jjoo jjoo = (Jjoo) obj;
        return Objects.equals(this.pais, jjoo.pais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.pais);
    }

}
