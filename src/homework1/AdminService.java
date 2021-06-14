package homework1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AdminService extends AbstractService implements Service{
    public void writeUserData(Entity entity) throws IOException {
        File file = new File(getFilePath());
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(entity.toString());
        fileWriter.close();
    }
}
