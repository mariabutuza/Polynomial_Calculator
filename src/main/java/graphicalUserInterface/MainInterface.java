package graphicalUserInterface;

public class MainInterface {
    public static void main(String[] args) {
        View v = new View();
        Model m = new Model(v);
        new Controller(m,v);
    }
}
