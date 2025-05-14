package br.com.dougSys404.facade;

import subsystem.crm.CrmService;
import susystem.cep.CepApi;

public class Facade {

    public void migrateCustomer(String nome, String cep){

        String cidade = CepApi.getInstance().getCidade(cep);
        String estado = CepApi.getInstance().getEstado(cep);

        CrmService.createCustomer(nome, cep, cidade, estado);
    }
}
