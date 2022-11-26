package task;
public class DoubleLinkedList<T extends Comparable<T>> {
    private DoubleLinkedListItem<T> beginning;
    private DoubleLinkedListItem<T> finale;
    private int pocket;

    public DoubleLinkedList () {
        beginning= null;
        finale = null;
        pocket = 0;
    }

    public DoubleLinkedListItem<T> findFirstItem (T value_1) {
        if (pocket == 0)
        {
            return null;
        }
        DoubleLinkedListItem<T> item = beginning;
        while (!item.getData().equals(value_1) && item!=null ) {
            item = item.getOwnNext();
        }
        return item;
    }


    public DoubleLinkedListItem<T> findLastItem (T value_2) {
        if (pocket == 0)
        {
            return null;
        }
        DoubleLinkedListItem<T> item = finale;
        while (!item.getData().equals(value_2) && item != null) {
            item = item.getOwnPrev();
        }
        return item;
    }


    public void  insertAfter(DoubleLinkedListItem<T> value_3, T data) {
        if (pocket == 0)
        {
            beginning = finale = new DoubleLinkedListItem<>(data);
            pocket ++;
            return;
        }
        var item = new DoubleLinkedListItem<>(data);
        if (value_3 == null)
        {
            item.setNext(beginning);
            beginning.setPrev(item);
            beginning = item;
        }
        else if (value_3 == finale)
        {
            finale.setNext(item);
            item.setPrev(finale);
            finale = item;
        }
        else
        {
            item.setPrev(value_3);
            item.setNext(value_3.getOwnNext());
            value_3.getOwnNext().setPrev(item);
            value_3.setNext(item);
        }
        pocket++;
    }

    public void  insertBefore(DoubleLinkedListItem<T> value_4, T data) {
        if (pocket == 0)
        {
            beginning = finale = new DoubleLinkedListItem<>(data);
            pocket = pocket + 1;
            return;
        }
        var item = new DoubleLinkedListItem<>(data);
        if (value_4 == null)
        {
            finale.setNext(item);
            item.setPrev(finale);
            finale = item;
        }
        else if (value_4 == beginning)
        {
            item.setNext(beginning);
            beginning.setPrev(item);
            beginning = item;
        }
        else
        {
            item.setNext(value_4);
            item.setPrev(value_4.getOwnPrev());
            value_4.getOwnPrev().setNext(item);
            value_4.setPrev(item);
        }
        pocket++;
    }

    public void remove(DoubleLinkedListItem<T> value_5){
        if (pocket==1){
            beginning = null;
            finale = null;
        }
        else if (value_5 == beginning){
            value_5.getOwnNext().setPrev(null);
            beginning = value_5.getOwnNext();
        }
        else if (value_5 == finale){
            value_5.getOwnPrev().setNext(null);
            finale = value_5.getOwnPrev();
        }
        else{
            value_5.getOwnNext().setPrev(value_5.getOwnPrev());
            value_5.getOwnPrev().setNext(value_5.getOwnNext());
        }
        pocket--;
    }

    public int getSize() {
        this.pocket = pocket;
        return pocket;
    }

    public DoubleLinkedListItem<T> getFirst() {
        this.beginning = beginning;
        return beginning;
    }

    public DoubleLinkedListItem<T> getLast() {
        this.finale = finale;
        return finale;
    }
}
