public class Pelatis {
    private String onoma;
    private long tilefono;
    private String diefthinsi;

    public Pelatis(String onoma, long tilefono, String diefthinsi) {
        this.onoma = onoma;
        this.tilefono = tilefono;
        this.diefthinsi = diefthinsi;
    }

    public String getOnoma() { return onoma; }
    public void setOnoma(String onoma) { this.onoma = onoma; }

    public long getTilefono() { return tilefono; }
    public void setTilefono(long tilefono) { this.tilefono = tilefono; }

    public String getDiefthinsi() { return diefthinsi; }
    public void setDiefthinsi(String diefthinsi) { this.diefthinsi = diefthinsi; }
}