public class Fanta extends Drinks implements Printable{
    private int types;
    private String composition;
    private String shape;

    @Override
    public void print() {
        System.out.println(types);
        System.out.println(composition);
        System.out.println(shape);
    }
}
