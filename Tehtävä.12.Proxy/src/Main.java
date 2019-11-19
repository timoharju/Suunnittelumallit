import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(final String[] arguments) {

        List<Image> kuvakansio = new ArrayList<Image>();

        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");

        kuvakansio.add(image1);
        kuvakansio.add(image2);

        for(Image kuvat: kuvakansio) {
            kuvat.showData();
        }

        //Kuvien selaus
        int i = 0;
        Scanner sc = new Scanner(System.in);
        String input = "";
        boolean loop = true;
        while(loop) {
            Image img = kuvakansio.get(i);
            img.displayImage();
            System.out.println("Next image: n");
            System.out.println("Previous image: p");
            System.out.println("Exit: e");
            input = sc.nextLine();
            switch(input) {
                case "n":
                    i++;
                    break;
                case "p":
                    i--;
                    break;
                case "e":
                    loop = false;
                    break;
            }
            if(i < 0) {
                i = kuvakansio.size()-1;
            } else if(i >= kuvakansio.size()) {
                i = 0;
            }
        }
        sc.close();
    }

    }

