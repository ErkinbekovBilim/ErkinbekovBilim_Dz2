public class Pepsi extends Drinks implements Printable{
    private int releaseDate;
    private String owner;
    private String placeOfAppearance;

    @Override
    public void print() {
        System.out.println(releaseDate);
        System.out.println(owner);
        System.out.println(placeOfAppearance);
    }
}
