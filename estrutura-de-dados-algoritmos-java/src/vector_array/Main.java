package vector_array;

public class Main {

    public static void main(String[] args) {

        Vector vetor = new Vector(5);

        vetor.add("A");
        vetor.add("B");
        vetor.add("C");
        vetor.add("A");



        System.out.println(vetor);
        System.out.println(vetor.getSize());
        System.out.println(vetor.lastIndexOf("E"));

    }
}
