package com.automate;

import java.util.LinkedList;

public interface Saveable {
    LinkedList<String> write();
    void read(LinkedList<String> saveableValues);
}
