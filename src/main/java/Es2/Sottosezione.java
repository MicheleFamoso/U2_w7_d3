package Es2;

import java.util.List;

public class Sottosezione implements Elemento{
    private List<Elemento> elementi;

    public Sottosezione(List<Elemento> elementi) {
        this.elementi = elementi;
    }

    @Override
    public int getpagine() {
         return elementi.stream().mapToInt(Elemento::getpagine).sum();
    }
}
