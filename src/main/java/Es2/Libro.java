package Es2;

import java.util.List;
import java.util.PrimitiveIterator;

public class Libro implements Elemento {
    private Double prezzo;
    private List<String> autori;
    private List<Elemento> elementi;

    public Libro(Double prezzo, List<String> autori, List<Elemento> elementi) {
        this.prezzo = prezzo;
        this.autori = autori;
        this.elementi = elementi;
    }

    @Override
    public int getpagine() {
        return elementi.stream().mapToInt(Elemento::getpagine).sum();
    }
}
