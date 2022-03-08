package one.dio.gof.subsistem.crm;

public class CrmService {

    private CrmService(){
        super();
    }
    public static void gravarCliente(String nome, String cep, String endereco, String estado, String cidade) {
        System.out.println("Cliente salvo no CRM: ");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(endereco);
        System.out.println(estado);
        System.out.println(cidade);

    }
}
