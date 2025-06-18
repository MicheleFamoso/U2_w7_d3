package esercizio1;

public class UserData  {

    private String nomeCompleto;
    private int eta;





    public void getData(DataSource dataSource){
        nomeCompleto = dataSource.getNomeCompleto();
        eta = dataSource.getEta();
    }
}
