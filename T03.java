// 12S24054 - Rahel Juri Elisabet Silaban
// 12S24010 - Artha Liebe Siregar

import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, penerbit, format, kategori, tub, diskon;
        int tahun, stok;
        double harga, margin, rating, kategoridiskon;

        do {
            iSBN = input.nextLine();
            if (iSBN.equals("---")) {
            } else {
                judul = input.nextLine();
                penulis = input.nextLine();
                tahun = Integer.parseInt(input.nextLine());
                penerbit = input.nextLine();
                format = input.nextLine();
                harga = Double.parseDouble(input.nextLine());
                margin = Double.parseDouble(input.nextLine());
                stok = Integer.parseInt(input.nextLine());
                rating = Double.parseDouble(input.nextLine());
                if (rating >= 4.7) {
                    kategori = "Best Pick";
                } else {
                    if (rating >= 4.5 && rating < 4.7) {
                        kategori = "Must Read";
                    } else {
                        if (rating >= 4.0 && rating < 4.5) {
                            kategori = "Recommended";
                        } else {
                            if (rating >= 3.0 && rating < 4.0) {
                                kategori = "Average";
                            } else {
                                if (rating < 3.0) {
                                    kategori = "Low";
                                } else {
                                    kategori = "";
                                }
                            }
                        }
                    }
                }
            }
            kategoridiskon = margin / harga * -1;
            if (kategoridiskon >= (double) 40 / 100) {
                diskon = "Once in a lifetime";
            } else {
                if (kategoridiskon > (double) 20 / 100) {
                    diskon = "Never come twice";
                } else {
                    if (kategoridiskon > 0) {
                        diskon = "No regret";
                    } else {
                        diskon = "---";
                    }
                }
                if (kategori.equals("Best Pick") && diskon.equals("Once in a lifetime")) {
                    tub = "The ultimate best";
                } else {
                    tub = "---";
                }
                System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahun + "|" + penerbit + "|" + format + "|" + toFixed(harga,2) + "|" + toFixed(margin,2) + "|" + stok + "|" + toFixed(rating,1) + "|" + kategori + "|" + diskon + "|" + tub);
            }
        } while (!iSBN.equals("---"));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
