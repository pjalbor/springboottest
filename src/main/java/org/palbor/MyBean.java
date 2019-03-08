package org.palbor;

import org.springframework.stereotype.Component;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

@Component
public class MyBean {
    private Deque<String> collection = new LinkedList<>();

    public void addElement(String element) {
        if (collection.size() == 5) {
            collection.removeFirst();
        }
        collection.addLast(element);
    }

    public String elements() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Iterator<String> iter = collection.descendingIterator(); iter.hasNext(); ) {
            stringBuilder.append(iter.next()).append(" ");
        }

        return stringBuilder.toString();
    }
}
