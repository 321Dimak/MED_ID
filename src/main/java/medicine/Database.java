package medicine;

import java.io.IOException;
import java.util.List;

public interface Database {

    void parseJasonToList() throws IOException;

    List<Medicine> getDatabase();
}
