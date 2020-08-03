package lunamary.readData;

public class AbstractFactory {

    public ReadWriteCSV createFile(String path) {
        String[] pathSplit = path.split("\\.");
        String extension = pathSplit[pathSplit.length - 1];
        if (extension.toUpperCase().equals("CSV")) {
            return new ReadWriteCSV(path);
        } else if (extension.toUpperCase().equals("JSON")) {
            return new ReadWriteCSV(path);
        } else {
            return null;
        }
    }
}


