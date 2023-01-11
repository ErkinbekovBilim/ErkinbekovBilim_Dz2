import java.lang.constant.Constable;
    public class Main {
    public static void main(String[] args) {
    }
    Drinks createObject(String className) {
        createObject("Fanta");
        createObject("CocaCola");
        createObject("Pepsi");
        switch (className) {
            case "CocaCola":
                CocaCola cocaCola = new CocaCola();
                cocaCola.print();
                return cocaCola;
            case "Fanta":
                Fanta fanta = new Fanta();
                fanta.print();
                return fanta;
            case "Pepsi":
                Pepsi pepsi = new Pepsi();
                pepsi.print();
                return pepsi;
        }
        return null;
    }
}