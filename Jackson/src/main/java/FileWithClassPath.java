import lombok.NonNull;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;

public class FileWithClassPath {

    @NonNull
    public static String getFilePath(String file) throws URISyntaxException, IOException {

        return String.join("",
                Files.readAllLines(Paths.get(Objects.requireNonNull(Main.class.getResource("/" + file)).toURI())));

    }
}
