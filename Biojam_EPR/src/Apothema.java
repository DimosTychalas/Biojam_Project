public class Apothema {
    private String onoma;
    private double posotita;
    private double timi;
    private String promitheftis;

    public Apothema(String onoma, double posotita, double timi, String promitheftis) {
        this.onoma = onoma;
        this.posotita = posotita;
        this.timi = timi;
        this.promitheftis = promitheftis;
    }

    public String getOnoma() { return onoma; }
    public void setOnoma(String onoma) { this.onoma = onoma; }

    public double getPosotita() { return posotita; }
    public void setPosotita(double posotita) { this.posotita = posotita; }

    public double getTimi() { return timi; }
    public void setTimi(double timi) { this.timi = timi; }

    public String getPromitheftis() { return promitheftis; }
    public void setPromitheftis(String promitheftis) { this.promitheftis = promitheftis; }
}