// 12S24054 - Rahel Juri Elisabet Silaban
// 12S24010 - Artha Liebe Siregar

import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int stok;
        String judul, penulis, penerbit, formatbukuelektronik, iSBN, kategori, tahunterbit, jenisdiskon, conclusion;
        double hargapembelian, minimummargin, rating;

        iSBN = input.nextLine();
        while (!iSBN.equals("---")) {
            judul = input.nextLine();
            penulis = input.nextLine();
            tahunterbit = input.nextLine();
            formatbukuelektronik = input.nextLine();
            hargapembelian = Double.parseDouble(input.nextLine());
            minimummargin = Double.parseDouble(input.nextLine());
            if (-(minimummargin / hargapembelian) > 0.4) {
                jenisdiskon = "Once in a lifetime";
            } else {
                if (0.2 < -(minimummargin / hargapembelian) && minimummargin / hargapembelian < 0.4) {
                    jenisdiskon = "Never come twice";
                } else {
                    if (-(minimummargin / hargapembelian) <= 0.2 && -(minimummargin / hargapembelian) > 0) {
                        jenisdiskon = "No regret";
                    } else {
                        jenisdiskon = "---";
                    }
                }
            }
            stok = Integer.parseInt(input.nextLine());
            rating = Double.parseDouble(input.nextLine());
            if (rating >= 4.7) {
                kategori = "Best pick";
            } else {
                if (rating >= 4.5 && rating < 4.7) {
                    kategori = "Must read";
                } else {
                    if (rating >= 4.0 && rating < 4.5) {
                        kategori = "Recommended";
                    } else {
                        if (rating > 3.0 && rating < 4.0) {
                            kategori = "Average";
                        } else {
                            if (rating < 3.0) {
                                kategori = "Low";
                            } else {
                                kategori = "Low";
                            }
                        }
                    }
                }
            }
            if (jenisdiskon.equals("Once in a lifetime") && kategori.equals("Best pick")) {
                conclusion = "The ultimate best";
            } else {
                conclusion = "---";
            }
            System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbukuelektronik + "|" + hargapembelian + "|" + minimummargin + "|" + stok + "|" + rating + "|" + kategori + "|" + jenisdiskon + "|" + conclusion);
            iSBN = input.nextLine();
        }
    }
}
