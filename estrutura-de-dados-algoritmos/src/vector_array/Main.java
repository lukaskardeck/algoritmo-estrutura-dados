package vector_array;

public class Main {

    public static void main(String[] args) {

        Vector vetor = new Vector(5);

        vetor.add("Elemento 1");
        vetor.add("Elemento 2");
        vetor.add("Elemento 3", 2);
        vetor.add("Elemento 4", vetor.getSize());
        vetor.add("Elemento 5");


        System.out.println(vetor);
        System.out.println(vetor.getSize());
        System.out.println(vetor.contains("Elemento 1"));

    }
}
