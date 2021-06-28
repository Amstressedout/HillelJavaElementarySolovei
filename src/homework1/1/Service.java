package homework1;

import java.io.IOException;

public interface Service {

    boolean check(Entity entity) throws IOException;

    void writeUserData(Entity entity) throws IOException;

}
