package lunamary.readData;

import datastructures.arraylist.MyArrayList;
import datastructures.hashmap.MyHashMap;
import java.io.FileReader;
import java.util.Iterator;

public class ReadWriteJSON extends ReadWritedFile {

    public ReadWriteJSON(String path) {
        super(path);
    }

    @Override
    public MyArrayList<MyHashMap<String, String>> readLines() {
        MyArrayList<MyHashMap<String, String>> entries = new MyArrayList<>();
        try {

        } catch (Exception exception) {
            System.out.println(exception);
        }
        return entries;
    }

    @Override
    public boolean writeEntries(MyArrayList<MyHashMap<String, String>> lines) {
        return false;
    }


}
