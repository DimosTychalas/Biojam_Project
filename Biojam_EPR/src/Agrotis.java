public class Agrotis {
    private String onoma;
    private long tilefono;
    private String email;

    public Agrotis(String onoma, long tilefono, String email) {
        this.onoma = onoma;
        this.tilefono = tilefono;
        this.email = email;
    }

    public String getOnoma() { return onoma; }
    public void setOnoma(String onoma) { this.onoma = onoma; }

    public long getTilefono() { return tilefono; }
    public void setTilefono(long tilefono) { this.tilefono = tilefono; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}