package vector_array;

public class Vector {

    private String[] elements;

    public Vector(int size) {
        this.elements = new String[size];
    }

    public void add(String element) {
        for (int i = 0; i < this.elements.length; i++) {
            if (this.elements[i] == null) {
                this.elements[i] = element;
                break;
            }
        }
    }

}
