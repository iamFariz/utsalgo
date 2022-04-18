import Model.modelfacebook;

import java.util.ArrayList;
import java.util.Scanner;

public class facebook {
    public static void main(String[] args) {
        modelfacebook[] post = new modelfacebook[3];
        post[0] = new modelfacebook();
        post[0].user = "SparkAR";
        post[0].photo = """
                ini contoh gambar postingan nya ya""";
        post[0].caption = """
                We are hosting our first #spark play me competition workshop tumorow""";
        ArrayList komen0 = new ArrayList<>();
        post[0].komen = komen0;
        post[0].like = 0;
        post[0].share = "http://facebook/SparkAR/post0";

        post[1] = new modelfacebook();
        post[1].user = "Nana Nini";
        post[1].photo = """
                ini contoh gambar postingannya kwkwkwk""";
        post[1].caption = """
                happy sunday love""";
        ArrayList komen1 = new ArrayList<>();
        post[1].komen = komen1;
        post[1].like = 0;
        post[1].share = "http://facebook/Nana/post1";

        System.out.println("FACEBOOK");
        System.out.println("---------------");
        System.out.println("\nPostingan 1");
        post[0].post();
        System.out.println("\nPostingan 2");
        post[1].post();

        Scanner input = new Scanner(System.in);
        char pilihPost = 0;
        do {
            System.out.println("Pilih Postingan (1, 2, 3): ");
            pilihPost = input.next().charAt(0);
            switch (pilihPost) {
                case '1' -> {
                    post[0].postingan();
                    char pilihan = 0;
                    do {
                        System.out.println("Pilih Perintah (0-4): ");
                        pilihan = input.next().charAt(0);
                        switch (pilihan) {
                            case '1' -> {
                                post[0].likes(1);
                                post[0].postingan();
                            }
                            case '2' -> {
                                System.out.print("Masukkan Komentar: ");
                                Scanner input2 = new Scanner(System.in);
                                String komen = input2.nextLine();
                                post[0].Comments(komen);
                                post[0].postingan();
                            }
                            case '3' -> {
                                System.out.println("Daftar Komentar: ");
                                post[0].showComment();
                            }
                            case '4' -> {
                                System.out.println("Link Copied: " + post[0].share);
                            }
                            default -> {
                            }
                        }
                    } while (pilihan != '0');
                }
                case '2' -> {
                    post[1].postingan();
                    char pilihan = 0;
                    do {
                        System.out.println("Pilih Perintah (0-4): ");
                        pilihan = input.next().charAt(0);
                        switch (pilihan) {
                            case '1' -> {
                                post[1].likes(1);
                                post[1].postingan();
                            }
                            case '2' -> {
                                System.out.print("Masukkan Komentar: ");
                                Scanner input2 = new Scanner(System.in);
                                String komen = input2.nextLine();
                                post[1].Comments(komen);
                                post[1].postingan();
                            }
                            case '3' -> {
                                System.out.println("Daftar Komentar: ");
                                post[1].showComment();
                            }
                            case '4' -> {
                                System.out.println("Link Copied: " + post[1].share);
                            }
                            default -> {
                            }
                        }
                    } while (pilihan != '0');
                }
            }
        } while (pilihan != '0');
    }
}
