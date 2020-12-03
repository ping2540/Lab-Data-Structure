
public class LinkedCollection {

    private static class LinkedNode {

        Object element;
        LinkedNode next;

        LinkedNode(Object e, LinkedNode next) {
            this.element = e;
            this.next = next;
        }
    }
    LinkedNode first;
    int size;

    public LinkedCollection() {
    }

    public LinkedCollection(LinkedCollection c) {
        LinkedNode p = c.first;
        while (p != null) {
            add(p.element);
            p = p.next;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(Object e) {
        first = new LinkedNode(e, first);
        ++size;
    }

    public boolean contains(Object e) {
        LinkedNode node = first;
        while (node != null) {
            if (node.element.equals(e)) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public void remove(Object e) {
        if (first == null) {
            return;
        }
        if (first.element.equals(e)) {
            first = first.next;
            --size;
        } else {
            LinkedNode p = first;
            while (p.next != null && !p.next.element.equals(e)) {
                p = p.next;
            }
            if (p.next != null) {
                p.next = p.next.next;
                --size;
            }
        }
    }

    @Override
    public String toString() {
        String s = "[";
        LinkedNode node = first;
        while (node != null) {
            s = s + node.element;
            if (node.next != null) {
                s = s + ",";
            }
            node = node.next;
        }
        return s + "]";
    }

    public Object[] toArray() {
        Object[] arr = new Object[size];
        LinkedNode p = first;
        int k = 0;
        while (p != null) {
            arr[k++] = p.element;
            p = p.next;
        }
        return arr;
    }

    public int count(Object e) {
        int c = 0;
        LinkedNode q = first;
        while (q != null) {
            if (q.element.equals(e)) {
                c++;
            }
            q = q.next;
        }
        return c;
    }

    public Object getDup() {
        if (first == null) {
            return null;
        }
        LinkedNode p = first;
        while (p != null) {
            LinkedNode q = p.next;
            while (q != null) {
                if (p.element.equals(q.element)) {
                    return p.element;
                }
                q = q.next;
            }
            p = p.next;
        }
        return null;
    }

    public void clear() {
        size = 0;
        first = null;
    }
}
