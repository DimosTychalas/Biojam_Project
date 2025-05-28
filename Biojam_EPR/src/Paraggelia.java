public class Paraggelia {
    private String kodikos;
    private String imerominia;
    private String katastasi;
    private String prothesei;

    public Paraggelia(String kodikos, String imerominia, String katastasi, String prothesei) {
        this.kodikos = kodikos;
        this.imerominia = imerominia;
        this.katastasi = katastasi;
        this.prothesei = prothesei;
    }

    public String getKodikos() { return kodikos; }
    public void setKodikos(String kodikos) { this.kodikos = kodikos; }

    public String getImerominia() { return imerominia; }
    public void setImerominia(String imerominia) { this.imerominia = imerominia; }

    public String getKatastasi() { return katastasi; }
    public void setKatastasi(String katastasi) { this.katastasi = katastasi; }

    public String getProthesei() { return prothesei; }
    public void setProthesei(String prothesei) { this.prothesei = prothesei; }
}