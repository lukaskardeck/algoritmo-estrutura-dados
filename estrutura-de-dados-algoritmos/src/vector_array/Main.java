package vector_array;

public class Main {

    public static void main(String[] args) {

        Vector vetor = new Vector(5);

        vetor.add("Elemento 1");
        vetor.add("Elemento 2");
        vetor.add("Novo", 2);
        vetor.add("Novo2", 1);
        vetor.add("Elemento");

        System.out.println(vetor);
        vetor.printFull();

        System.out.println(vetor.getSize());
    }
}
