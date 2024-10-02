// 12S24054 - Rahel Juri Elisabet Silaban
// 12S24010 - Artha Liebe Siregar

import java.util.*;
import java.lang.Math;

public class T03{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, penerbit, format, kategori, tub, diskon, kategoridiskon;
        int tahun, stok;
        double harga, margin, rating;

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
                                kategori = "Low";
                            }
                        }
                    }
                }
            }
            kategoridiskon = margin / harga(-1);
            if (kategoridiskon >= (double) 40 / 100) {
                kategoridiskon = "Once in a lifetime";
            } else {
                if (kategoridiskon >= (double) 20 / 100) {
                    kategoridiskon = "Never come twice";
                } else {
                    if (kategoridiskon > 0) {
                        kategoridiskon = "No regret";
                    }
                }
            }
        } while (!iSBN.equals("---"));
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahun + "|" + penerbit + "|" + format + "|" + harga + "|" + margin + "|" + stok + "|" + toFixed(rating,1) + "|" + kategori + "|" + tub + "|" + diskon);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
