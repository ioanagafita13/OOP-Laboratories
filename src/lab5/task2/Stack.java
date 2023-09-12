package lab5.task2;

import lab5.task1.Task;

import java.util.ArrayList;
import java.util.List;

public class Stack implements Container{

    List<Task> elements = new ArrayList<>();

    @Override
    public Task pop() {
        if (isEmpty()) {
            return null;
        }
        Task ret = elements.get(elements.size() - 1);
        elements.remove(ret);
        return ret;
    }

    @Override
    public void push(Task task) {
        elements.add(task);
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public void transferFrom(Container container) {
        while (!container.isEmpty()) {
            push(container.pop());
        }
    }
}
