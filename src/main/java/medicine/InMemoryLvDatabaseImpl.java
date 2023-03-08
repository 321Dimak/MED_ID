package medicine;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class InMemoryLvDatabaseImpl implements Database {

    static List<Medicine> lvDatabase = new ArrayList<>();
    static String jason;

    static {
        try {
            jason = FileUtils.readFileToString(new File("Files/HumanProducts.json"), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void parseJasonToList() {
        Gson gson = new Gson();
        Type medicinesType = new TypeToken<ArrayList<Medicine>>() {
        }.getType();
        lvDatabase = gson.fromJson(jason, medicinesType);
    }

    @Override
    public List<Medicine> getDatabase() {
        return lvDatabase;
    }

}
