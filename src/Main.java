public class Main {
    public static void main(String[] args) {
        Rabbit krolik1 = new Rabbit( 50, "Henek", true );
        krolik1.changeName("Stanislaw");
        krolik1.viewName();
        System.out.println(krolik1.viewName());
    }
}