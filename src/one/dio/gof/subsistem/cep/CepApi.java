package one.dio.gof.subsistem.cep;

public class CepApi {

    private static CepApi instance = new CepApi();

    private CepApi(){
        super();
    }
    public static CepApi getInstance(){
        return instance;
    }

    public String getCidade(String cep){
        return "Cidade";
    }

    public  String getEstado(String cep){
        return "Estado";
    }

    public  String getEndereco(String cep){
        return "Endereço";
    }
}
