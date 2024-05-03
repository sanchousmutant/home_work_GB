import Control.DataValidation;
import Model.SaveInterface;
import Model.SaveToFile;
import View.DataFromConsole;
import View.DataInterface;

public class Main {
    public static void main(String[] args) {
        DataInterface data = new DataFromConsole();
        SaveInterface saveToFile = new SaveToFile();
        saveToFile.save(data);

    }
}
