package lunamary.readData;

import datastructures.arraylist.MyArrayList;
import datastructures.hashmap.MyHashMap;

public class ReadWriteCSV extends ReadWritedFile {

    public ReadWriteCSV(String path) {
        super(path);
    }

    @Override
    public MyArrayList<MyHashMap<String, String>> readLines() {
        return null;
    }

    @Override
    public boolean writeEntries(MyArrayList<MyHashMap<String, String>> lines) {
        return false;
    }
}
