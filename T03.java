// 12S24054 - Rahel Juri Elisabet Silaban
// 12S24010 - Artha Liebe Siregar

import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, penerbit, formatbukuElektronik, ket, ketRating, ketDiskon, ketBuku;
        int tahunTerbit, stok;
        double hargaPembelian, minimummargin, rating;

        ketRating = "";
        do {
            iSBN = input.nextLine();
            if (iSBN.equals("---")) {
            } else {
                judul = input.nextLine();
                penulis = input.nextLine();
                tahunTerbit = Integer.parseInt(input.nextLine());
                penerbit = input.nextLine();
                if (penerbit.equals("---")) {
                    penerbit = "---";
                } else {
                    penerbit = penerbit;
                }
                formatbukuElektronik = input.nextLine();
                hargaPembelian = Double.parseDouble(input.nextLine());
                minimummargin = Double.parseDouble(input.nextLine());
                if (minimummargin > 0) {
                    ketDiskon = "---";
                } else {
                    if (minimummargin < -(hargaPembelian * 0.4)) {
                        ketDiskon = "Once in a lifetime";
                    } else {
                        if (minimummargin < -(hargaPembelian * 0.2)) {
                            ketDiskon = "Never come twice";
                        } else {
                            ketDiskon = "No regret";
                        }
                    }
                }
                stok = Integer.parseInt(input.nextLine());
                rating = Double.parseDouble(input.nextLine());
                if (rating >= 4.7) {
                    ket = "Best Pick";
                } else {
                    if (rating >= 4.5) {
                        ket = "Must Read";
                    } else {
                        if (rating >= 4.0) {
                            ket = "Recommended";
                        } else {
                            if (rating >= 3.0) {
                                ket = "Average";
                            } else {
                                ket = "Low";
                            }
                        }
                    }
                }
                if (ketDiskon.equals("Once in a lifetime") && ketRating.equals("Best Pick")) {
                    ketBuku = "The Ultimate Best";
                } else {
                    ketBuku = "---";
                }
                System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + formatbukuElektronik + "|" + hargaPembelian + "|" + minimummargin + "|" + stok + "|" + toFixed(rating,1) + "|" + ket + "|" + ketRating + "|" + ketDiskon + "|" + ketBuku);
            }
        } while (!iSBN.equals("---"));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
