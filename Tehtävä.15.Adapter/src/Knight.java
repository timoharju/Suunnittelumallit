public class Knight implements Fighter {
    @Override
    public void attack() {
        System.out.println("Knight attacks!");
    }

    @Override
    public void defend() {
        System.out.println("Knight defend!s");
    }

    @Override
    public void escape() {
        System.out.println("Knight runs away!");
    }
}
