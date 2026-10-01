public class App {
    public static void main(String[] args) throws Exception {
     
        tulostaOhjelmanNimi();
        laskePintaAla(5,10);

    }  // mainin loppu

    public static void tulostaOhjelmanNimi() {
        System.out.println("Metodi-ohjelma");
        System.out.println("**************");
    }  // tulostaOhjelmanNimi-metodin loppu

    public static void laskePintaAla(int pit, int lev) {
        int pintaAla = pit * lev;
        System.out.println("Pinta-ala on " + pintaAla);
    }


}
