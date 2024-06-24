public class SinemaGosterisi extends GosteriSalonu{
    private String FilmAdi;
    private int FilmSure;
    private String FilmFormat;

    SinemaGosterisi(String SalonAdi, int SalonKapasitesi, String SalonMevkisi, String FilmAdi, int FilmSure,String FilmFormat){
        this.setSalonAdi(SalonAdi);
        this.setSalonKapasitesi(Integer.parseInt(String.valueOf(SalonKapasitesi)));
        this.setSalonMevkisi(SalonMevkisi);
        this.FilmAdi=FilmAdi;
        this.FilmSure=Integer.parseInt(String.valueOf(FilmSure));
        this.FilmFormat=FilmFormat;
    }

    public String getFilmAdi() {
        return FilmAdi;
    }

    public int getFilmSure() {
        return FilmSure;
    }

    public String getFilmFormat() {
        return FilmFormat;
    }
}
