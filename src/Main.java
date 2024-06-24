public class Main {
    public static void main(String[] args) {

        GosteriSalonu g=new GosteriSalonu();

        TiyatroGosterisi tg=new TiyatroGosterisi("BBB", "250","bb",'4', "326","Oyunn");
        System.out.println(tg.getSalonAdi());
        System.out.println(tg.getSalonKapasitesi());
        System.out.println(tg.getSalonMevkisi());
        System.out.println(tg.getOyunAdi());
        System.out.println(tg.getSatilanKoltukSayisi());
        System.out.println(tg.getPerdeSayisi());



    }
}