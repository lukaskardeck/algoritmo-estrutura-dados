package vector_array;

import java.util.Arrays;

public class Vector {

    private String[] elements;
    private int capacity;
    private int size;

    public Vector(int capacity) {
        this.capacity = capacity;
        this.elements = new String[capacity];
    }

    // Adiciona um elemento no final da estrutura
    public void add(String element) {

        if (getSize() == this.capacity) throw new RuntimeException("O vetor já está preenchido");

        this.elements[getSize()] = element;
        this.size++;
    }

    // Adiciona um elemento na posição indicada. Válido apenas para indices ja ocupados ou o primeiro indice após a ultima posição ocupada
    public void add(String element, int index) {
        if (getSize() < this.capacity) {

            if (index < 0 || index > getSize()) throw new RuntimeException("Invalid index");

            if (index < getSize()) {
                for (int i = getSize(); i > index; i--) {
                    this.elements[i] = this.elements[i-1];
                }
                this.elements[index] = element;
            }

            this.elements[index] = element;
            this.size++;
            return;
        }

        throw new RuntimeException("Full vector");
    }

    // Retorna um elemento pelo seu índice na estrutura
    public String getByIndex(int index) {
        if (getSize() == 0) throw new RuntimeException("Empty vector");
        if (index < 0 || index >= getSize()) throw new IllegalArgumentException("Invalid index");

        return this.elements[index];
    }

    // Realiza uma busca sequencial do elemento e retorna o seu indice. No caso do elemento não ser encontrado, retornará -1
    public Integer find(String element) {
        for (int i = 0; i < getSize(); i++) {
            if (this.elements[i].equals(element)) return i;
        }

        return -1;
    }

    public void remove(int index) {

        if (getSize() == 0) throw new RuntimeException("Empty vector");
        if (index < 0 || index >= getSize()) throw new IllegalArgumentException("Invalid index");

        for (int i = index; i < getSize()-1; i++) {
            this.elements[i] = this.elements[i+1];
        }
        this.size--;
    }

    public void remove(String element) {

        if (getSize() == 0) throw new RuntimeException("Empty vector");

        int index = this.find(element);
        if (index == -1) throw new IllegalArgumentException("Elemento não encontrado");

        if (index < 0 || index >= getSize()) throw new IllegalArgumentException("Invalid index");

        for (int i = index; i < getSize()-1; i++) {
            this.elements[i] = this.elements[i+1];
        }
        this.size--;
    }


    // Retorna a quantidade de elementos presentes na estrutura
    public int getSize() {
        return this.size;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < getSize(); i++) {
            sb.append(this.elements[i]);
            if (i != (getSize() - 1)) sb.append(", ");
        }
        sb.append("]");

        return sb.toString();
    }
}
