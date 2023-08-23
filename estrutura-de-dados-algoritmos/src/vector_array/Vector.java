package vector_array;

public class Vector {

    private String[] elements;
    private int capacity;
    private int size;

    public Vector(int capacity) {
        this.capacity = capacity;
        this.elements = new String[capacity];
    }

    public void addToEnd(String element) {
        if (getSize() < capacity) {
            this.elements[getSize()] = element;
            this.size++;
        }
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < getSize(); i++) {
            System.out.print(this.elements[i]);
            if (i == (getSize() - 1)) System.out.println("]");
            else System.out.print(", ");
        }
    }

    public int getSize() {
        return this.size;
    }
}
