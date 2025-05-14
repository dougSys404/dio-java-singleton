package susystem.cep;

public class CepApi {

    private static CepApi instance = new CepApi();

    private CepApi(){}

    public static CepApi getInstance(){
        return instance;
    }

    public String getCidade(String cep){
        return "São Paulo";
    }

    public String getEstado(String cep){
        return "SP";
    }
}
