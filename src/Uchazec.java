public class Uchazec {
    private String jmeno;
    private String vzdelani;
    private String pozice;
    private int vek;

    public Uchazec(String jmeno, String vzdelani, String pozice, int vek) {
        this.jmeno = jmeno;
        this.vzdelani = vzdelani;
        this.pozice = pozice;
        this.vek = vek;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getVzdelani() {
        return vzdelani;
    }

    public void setVzdelani(String vzdelani) {
        this.vzdelani = vzdelani;
    }

    public String getPozice() {
        return pozice;
    }

    public void setPozice(String pozice) {
        this.pozice = pozice;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    @Override
    public String toString() {
        return "Jmeno: " + jmeno+", Vzdelani: "+vzdelani+", Pozice: "+pozice+", vek: "+vek;
    }
}
