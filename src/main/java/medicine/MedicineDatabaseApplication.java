package medicine;

import java.io.IOException;

class MedicineDatabaseApplication {

    static final Database database = new InMemoryLvDatabaseImpl();

    public static void main(String[] args) throws IOException {
        database.parseJasonToList();
        database.getDatabase().forEach(System.out::println);
        System.out.println(database.getDatabase().size());
    }

}
