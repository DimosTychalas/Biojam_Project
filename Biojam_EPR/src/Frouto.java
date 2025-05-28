public class Frouto {
    private String onoma;
    private String kodikos;
    private double timi;

    public Frouto(String onoma, String kodikos, double timi) {
        this.onoma = onoma;
        this.kodikos = kodikos;
        this.timi = timi;
    }

    public String getOnoma() { return onoma; }
    public void setOnoma(String onoma) { this.onoma = onoma; }

    public String getKodikos() { return kodikos; }
    public void setKodikos(String kodikos) { this.kodikos = kodikos; }

    public double getTimi() { return timi; }
    public void setTimi(double timi) { this.timi = timi; }
}