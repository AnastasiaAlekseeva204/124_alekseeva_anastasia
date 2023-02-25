package task;
public class DoubleLinkedListItem<T extends Comparable<T>> {
    private DoubleLinkedListItem<T> next;
    private DoubleLinkedListItem<T> prev;
    private T data;

    public DoubleLinkedListItem(T data){
        prev = null;
        next = null;
        this.data = data;
    }

    public DoubleLinkedListItem<T> getOwnNext() {
        this.next = next;
        return next;
    }

    public DoubleLinkedListItem<T> getOwnPrev() {
        this.prev = prev;
        return prev;
    }

    public T getData() {
        this.data = data;
        return data;
    }

    public void setNext(DoubleLinkedListItem<T> takeNext) {
        this.next = takeNext;
    }

    public void setPrev(DoubleLinkedListItem<T> takePrev) {
        this.prev = takePrev;
    }

    public void setData (T takeData) {
        this.data = takeData;
    }
}
