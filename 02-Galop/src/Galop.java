import java.text.DecimalFormat;

public class Galop {

    public static void main(String[] args) {

        double neadimokratia = 195_879;
        double syriza = 162_987;
        double kinal = 39_237;
        double kke = 22_568;
        double xrysiavgi = 13_512;
        double mera25 = 17_565;
        double ellhnikilysi = 19_236;
        double enwsikentrwwn = 12_846;
        double anel = 9_112;
        double allokomma = 1_987;
        double dgda = 33_568;
        double synolo = neadimokratia + syriza + kinal + kke + xrysiavgi + mera25 + ellhnikilysi + enwsikentrwwn + anel + allokomma + dgda;
        System.out.println("Synolo erwtithentwn: " + synolo);

        double posneadimokratia = 100 * neadimokratia / synolo;
        DecimalFormat nd = new DecimalFormat("0.00");
        String formattednd = nd.format(posneadimokratia);
        System.out.println("Pososto ND: " + formattednd + "%");

        double possyriza = 100 * syriza / synolo;
        DecimalFormat sr = new DecimalFormat("0.00");
        String formattedsr = sr.format(possyriza);
        System.out.println("Pososto SYRIZA: " + formattedsr + "%");

        double poskinal = 100 * kinal / synolo;
        DecimalFormat kn = new DecimalFormat("0.00");
        String formattedkn = kn.format(poskinal);
        System.out.println("Pososto KINAL: " + formattedkn + "%");

        double poskke = 100 * kke / synolo;
        DecimalFormat kk = new DecimalFormat("0.00");
        String formattedkk = kk.format(poskke);
        System.out.println("Pososto KKE: " + formattedkk + "%");

        double posxrysiavgi = 100 * xrysiavgi / synolo;
        DecimalFormat xa = new DecimalFormat("0.00");
        String formattedxa = xa.format(posxrysiavgi);
        System.out.println("Pososto XA : " + formattedxa + "%");

        double posmera25 = 100 * mera25 / synolo;
        DecimalFormat me = new DecimalFormat("0.00");
        String formattedme = me.format(posmera25);
        System.out.println("Pososto MERA25: " + formattedme + "%");

        double posellinikilysi = 100 * ellhnikilysi / synolo;
        DecimalFormat ly = new DecimalFormat("0.00");
        String formattedly = ly.format(posellinikilysi);
        System.out.println("Pososto LYSI: " + formattedly + "%");

        double posenwsikentrwwn = 100 * enwsikentrwwn / synolo;
        DecimalFormat en = new DecimalFormat("0.00");
        String formatteden = en.format(posenwsikentrwwn);
        System.out.println("Pososto ENKEN: " + formatteden + "%");

        double posanel = 100 * anel / synolo;
        DecimalFormat an = new DecimalFormat("0.00");
        String formattedan = an.format(posanel);
        System.out.println("Pososto ANEL: " + formattedan + "%");

        double posallokomma = 100 * allokomma / synolo;
        DecimalFormat ak = new DecimalFormat("0.00");
        String formattedak = ak.format(posallokomma);
        System.out.println("Pososto Allo Komma: " + formattedak + "%");

        double posdgda = 100 * dgda / synolo;
        DecimalFormat dd = new DecimalFormat("0.00");
        String formatteddd = dd.format(posdgda);
        System.out.println("Pososto Den Gnwrizw/Den Apantw: " + formatteddd + "%");
    }
}
