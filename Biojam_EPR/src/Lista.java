public class Lista {
    private String kodikos;
    private String onoma;

    public Lista(String kodikos, String onoma) {
        this.kodikos = kodikos;
        this.onoma = onoma;
    }

    public String getKodikos() { return kodikos; }
    public void setKodikos(String kodikos) { this.kodikos = kodikos; }

    public String getOnoma() { return onoma; }
    public void setOnoma(String onoma) { this.onoma = onoma; }
}