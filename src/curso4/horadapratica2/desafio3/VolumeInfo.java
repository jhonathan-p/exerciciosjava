package curso4.horadapratica2.desafio3;

import java.util.Collections;
import java.util.List;

public class VolumeInfo {
    private String title;
    private List<String> authors;
    private String publisher;

    public String getTitle() {
        return title;
    }

    public List<String> getAuthors() {
        if (authors == null) {
            return Collections.singletonList("Não disponível");
        } else {
            return authors;
        }
    }

    public String getPublisher() {
        if (publisher == null) {
            return "Não disponível";
        } else {
            return publisher;
        }
    }
}
