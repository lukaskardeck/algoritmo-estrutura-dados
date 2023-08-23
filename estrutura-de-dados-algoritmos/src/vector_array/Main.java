package vector_array;

public class Main {

    public static void main(String[] args) {
        Vector vetor = new Vector(5);
        vetor.addToEnd("Elemento 1");
        vetor.addToEnd("Elemento 2");
        vetor.addToEnd("Elemento 3");
        vetor.addToEnd("Elemento 4");
        vetor.addToEnd("Elemento 5");
        vetor.addToEnd("Elemento 6");
        vetor.print();
        System.out.println(vetor.getSize());
    }
}
