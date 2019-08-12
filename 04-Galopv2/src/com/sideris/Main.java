package com.sideris;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Nea Dimokratia:");
            double nd = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Syriza:");
            double syriza = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Kinal:");
            double kinal = scanner.nextInt();
            scanner.nextLine();

            System.out.println("KKE:");
            double kke = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Xrysi Avgi:");
            double xa = scanner.nextInt();
            scanner.nextLine();

            System.out.println("MeRA25:");
            double mera = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Elliniki Lysi:");
            double lysi = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enwsi Kentrwwn:");
            double enwsi = scanner.nextInt();
            scanner.nextLine();

            System.out.println("ANEL:");
            double anel = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Allo komma:");
            double allo = scanner.nextInt();
            scanner.nextLine();

            System.out.println("DG/DA:");
            double dgda = scanner.nextInt();
            scanner.nextLine();

            scanner.close();
            System.out.println(" ");
            double synolo = nd + syriza + kinal + kke + xa +
                    mera + lysi + enwsi + anel + allo + dgda;
            System.out.println("Synolo erwtithentwn: " + synolo);

            ypologismosPosostou("Nea Dimokratia",nd,synolo);
            ypologismosPosostou("Syriza",syriza,synolo);
            ypologismosPosostou("Kinal",kinal,synolo);
            ypologismosPosostou("KKE",kke,synolo);
            ypologismosPosostou("Xrysi Avgi",xa,synolo);
            ypologismosPosostou("MeRA25",mera,synolo);
            ypologismosPosostou("Elliniki Lysi",lysi,synolo);
            ypologismosPosostou("Enwsi Kentrwwn",enwsi,synolo);
            ypologismosPosostou("ANEL",anel,synolo);
            ypologismosPosostou("Allo komma",allo,synolo);
            ypologismosPosostou("DG/DA",dgda,synolo);
        }
        private static void ypologismosPosostou(String onomaKommatos, double psifoforoi, double synolo){
            double pososto = 100 * psifoforoi / synolo;
            DecimalFormat posostoFormatted = new DecimalFormat("0.00");
            String posostoTelos = posostoFormatted.format(pososto);
            System.out.println("Pososto " + onomaKommatos + ": " + posostoTelos + "%");
        }
    }