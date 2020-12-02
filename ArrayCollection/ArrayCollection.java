
public class ArrayCollection {

    private Object[] elementData;
    private int size;

    public ArrayCollection() {
        elementData = new Object[100];
        size = 0;
    }

    public ArrayCollection(int c) {
        elementData = new Object[c];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(Object e) {
        ensureCapacity(size + 1);
        elementData[size++] = e;
    }

    public void addAll(ArrayCollection c) {
        for (int i = 0; i < c.size; i++) {
            add(c.elementData[i]);
        }
    }

    public boolean contains(Object e) {
        return indexOf(e) != -1;
    }

    public void remove(Object e) {
        int i = indexOf(e);
        if (i != -1) {
            elementData[i] = elementData[--size];
            elementData[size] = null;
        }
    }

    private int indexOf(Object e) {
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    private void ensureCapacity(int capacity) {
        if (capacity > elementData.length) {
            int s = Math.max(capacity, 2 * elementData.length);
            Object[] arr = new Object[s];
            for (int i = 0; i < size; i++) {
                arr[i] = elementData[i];
            }
            elementData = arr;
        }
    }

    public int count(Object e) {
        int c = 0;
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(e)) {
                c++;
            }
        }
        return c;
    }

    public int countUnique() {
        ArrayCollection y = new ArrayCollection();
        for (int i = 0; i < size; i++) {
            if (!y.contains(elementData[i])) {
                y.add(elementData[i]);
            }
        }
        return y.size();
    }

    public String toString() {
        String s = "[";
        for (int i = 0; i < size; i++) {
            s += elementData[i];
            if (i != size - 1) {
                s = s + ", ";
            }
        }
        return s + "]";
    }

    public Object[] toArray() {
        Object[] a = new Object[size];
        for (int i = 0; i < size; i++) {
            a[i] = elementData[i];
        }
        return a;
    }

    public boolean containsDup() {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (elementData[i].equals(elementData[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elementData[i] = null;
            size = 0;
        }
    }

    public void removeAll(Object e) {
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(e)) {
                elementData[i--] = elementData[--size];
                elementData[size] = null;
            }
        }
    }

}
