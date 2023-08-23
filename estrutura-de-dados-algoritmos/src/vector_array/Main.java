package vector_array;

public class Main {

    public static void main(String[] args) {

        Vector vetor = new Vector(2);

        vetor.addToEnd("Elemento 1");
        vetor.addToEnd("Elemento 2");
        vetor.addToEnd("Elemento 3");

        System.out.println(vetor);

        System.out.println(vetor.getSize());
//        System.out.println(vetor.getByIndex(3));
        System.out.println(vetor.find("Elemento 3"));
    }
}
