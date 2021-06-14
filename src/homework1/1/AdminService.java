package homework1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AdminService extends homework1.AbstractService implements homework1.Service {
    public void writeUserData(homework1.Entity entity) throws IOException {
        File file = new File(getFilePath());
        FileWriter fileWriter = new FileWriter(file.getAbsoluteFile(), true);
        fileWriter.write(entity.toString());
        fileWriter.close();
    }
}
