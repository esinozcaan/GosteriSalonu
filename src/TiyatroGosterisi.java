public class TiyatroGosterisi extends GosteriSalonu{

    private int PerdeSayisi;
    private int SatilanKoltukSayisi;
    private String OyunAdi;

    TiyatroGosterisi(String SalonAdi, String SalonKapasitesi, String SalonMevkisi, int PerdeSayisi, String SatilanKoltukSayisi, String OyunAdi){
        this.setSalonAdi(SalonAdi);
        this.setSalonKapasitesi(Integer.parseInt(SalonKapasitesi));
        this.setSalonMevkisi(SalonMevkisi);
        this.PerdeSayisi=PerdeSayisi;
        this.SatilanKoltukSayisi= Integer.parseInt(SatilanKoltukSayisi);
        this.OyunAdi=OyunAdi;
    }

    public int getPerdeSayisi() {
        return PerdeSayisi;
    }

    public int getSatilanKoltukSayisi() {
        return SatilanKoltukSayisi;
    }

    public String getOyunAdi() {
        return OyunAdi;
    }
}
