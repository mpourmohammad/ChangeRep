public class GenericList<T>  {
    private T[] items = (T[]) new Object[10];

    public T[] getItems() {
        return items;
    }

    public void setItems(T[] items) {
        this.items = items;
    }
}
