package pr14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList <E> implements IWaitList<E> {

        protected ConcurrentLinkedQueue<E> components;// Объявление и инициализация поля для хранения элементов очереди


        public WaitList(){
            components = new ConcurrentLinkedQueue<>();// Конструктор по умолчанию инициализирует пустую очередь
        }


        public WaitList(Collection<E> collection){ // Конструктор, который инициализирует очередь с элементами из переданной коллекции.
            components = new ConcurrentLinkedQueue<>(collection);
        }
        @Override
        public String toString() {
            return "WaitList{" +
                    "components=" + components +
                    '}';
        }


        @Override // Метод добавления элемента в очередь
        public void add(E element) {
            components.add(element);
        }


        @Override // Метод удаления и возврата элемента из очереди
        public E remove() {
            if(isEmpty()) throw new IllegalStateException("Очередь пуста!");
            return components.remove();
        }


        @Override // Метод проверки наличия элемента в очереди
        public boolean contains(E element) {
            boolean res = false;
            for(int i = 0; i < components.size(); i++){
                E el = components.remove();
                if(el.equals(element)) res = true;
                components.add(el);
            }
            return res;
        }


        @Override // Метод проверки наличия всех элементов из переданной коллекции в очереди
        public boolean containsAll(Collection<E> collection) {
            ArrayList<E> al = new ArrayList<>(collection);
            for(int i = 0; i < collection.size(); i++){
                boolean res = false;
                for(int j = 0; j < components.size(); j++){
                    E el = components.remove();
                    if(el.equals(al.get(i))) res = true;
                    components.add(el);
                }
                if(!res) return false;
            }
            return true;
        }


        @Override // Метод проверки, пуста ли очередь.
        public boolean isEmpty() {
            return components.isEmpty();
        }
}
