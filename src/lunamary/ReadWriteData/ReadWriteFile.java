package lunamary.ReadWriteData;

import datastructures.arraylist.MyArrayList;
import datastructures.hashmap.MyHashMap;

public abstract class ReadWriteFile {
    protected String path;

    public ReadWriteFile(String path) {
        this.path = path;
    }


    public abstract MyArrayList<MyHashMap<String, String>> readLines();

    public abstract boolean writeEntries(MyArrayList<MyHashMap<String, String>> lines);
}