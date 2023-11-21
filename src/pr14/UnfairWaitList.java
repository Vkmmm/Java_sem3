package pr14;

public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() {
        super();
    }
    public void remove (E element){  // Метод для удаления элемента из очереди
        boolean removed = false;
        for(int i = 0; i < components.size(); i++){
            E el = components.remove();
            if(!removed && el.equals(element)){
                removed = true; // Пропускаем удаленный элемент, но не добавляем его обратно
            }else{ // После удаления, добавляем удаленный элемент в конец очереди
                components.add(el);
            }
        }
        if(removed){
            components.add(components.remove());
        }
    }
    public void moveToBack(E element){ // Метод для перемещения элемента в конец очереди
        int prevSize = components.size();
        remove(element);
        if(components.size() < prevSize){
            components.add(element);   // Если элемент был удален (размер очереди уменьшился), то добавляем его в конец очереди
        }
    }
}