import java.util.Random;

public class Arvuuttaja {

    private Random random;

    public Arvuuttaja() {
        random = new Random();
    }

    public void arvaaLuku(Object o, int arvaus) {
        int arvottu = ((Memento) o).getLuku();
        if (arvaus == arvottu) {
            System.out.println("arvasit oikein");
        } else {
            System.out.println("arvasit väärin, oikea luku: " + arvottu);
        }

    }

    public Object liityPeliin() {

        return new Memento(random.nextInt(10) + 1);

    }

   }