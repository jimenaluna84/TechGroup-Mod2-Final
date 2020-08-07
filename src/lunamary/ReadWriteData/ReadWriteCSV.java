package lunamary.ReadWriteData;

import datastructures.arraylist.MyArrayList;
import datastructures.hashmap.MyHashMap;

public class ReadWriteCSV extends ReadWriteFile {

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
