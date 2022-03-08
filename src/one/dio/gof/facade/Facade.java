package one.dio.gof.facade;

import one.dio.gof.subsistem.cep.CepApi;
import one.dio.gof.subsistem.crm.CrmService;

public class Facade {

    void migracaoCliente(String nome, String cep){
        String cidade = CepApi.getInstance().getCidade(cep);
        String endereco = CepApi.getInstance().getEndereco(cep);
        String estado = CepApi.getInstance().getEstado(cep);

        CrmService.gravarCliente(nome, cep, endereco, estado, cidade);
    }
}
