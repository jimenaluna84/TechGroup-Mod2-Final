package lunamary.readData;

import datastructures.arraylist.MyArrayList;
import datastructures.hashmap.MyHashMap;

public abstract class ReadWritedFile {
    protected String path;

    public ReadWritedFile(String path) {
        this.path = path;
    }


    public abstract MyArrayList<MyHashMap<String, String>> readLines();

    public abstract boolean writeEntries(MyArrayList<MyHashMap<String, String>> lines);
}
