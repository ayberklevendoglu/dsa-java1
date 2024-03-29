import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(int item){
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int item){
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public int indexOf(int item){
        int index = 0;
        var current = first;
        while(current != null){
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item){
        var current = first;
        while(current != null){
            if (current.value == item) return true;
            current = current.next;
        }
        return false;
    }

    public void removeFirst(){
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last)
            first = last = null;
        else{
            var second = first.next;
            first.next = null;
            first = second;
        }

        size--;
    }

    public void removeLast(){
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last)
            first = last = null;
        else{
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }

        size--;
    }

    public int[] toArray(){
        int[] array = new int[size];
        var current = first;
        var index = 0;
        while(current != null){
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    public int size(){
        return size;
    }

    private Node getPrevious(Node node){
        var current = first;
        while(current != null){
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    private boolean isEmpty(){
        return first == null;
    }
}
