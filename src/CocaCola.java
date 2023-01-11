public class CocaCola extends Drinks implements Printable {
    private String competitor;
    private int alternative;
    private String colour;

    @Override
    public void print() {
        System.out.println(competitor);
        System.out.println(alternative);
        System.out.println(colour);
    }
}

