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
    public void addToEnd(String element) {
        if (getSize() < this.capacity) {
            this.elements[getSize()] = element;
            this.size++;
        }
        else {
            throw new RuntimeException("O vetor já está preenchido");
        }
    }

    // Retorna um elmento pelo seu índice na estrutura
    public String getByIndex(int index) {
        if (index < 0 || index >= getSize()) {
            throw new IllegalArgumentException("Invalid index");
        }

        return this.elements[index];
    }

    // Realiza uma busca sequencial do elemento e retorna o seu indice. No caso do elemento não ser encontrado, retornará -1
    public Integer find(String element) {
        for (int i = 0; i < getSize(); i++) {
            if (this.elements[i].equals(element)) return i;
        }

        return -1;
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