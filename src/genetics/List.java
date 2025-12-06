package genetics;

import java.util.Scanner;

public class List {
    int[] items = new int[5];
    int count;

    public void add(int item) {
        items[count] = item;
        count++;
    }

    public void remove(int item) {
        items[count] = item;
        count--;
    }

    public int get(int item) {
        items[count] = item;
        return item;
    }
}
