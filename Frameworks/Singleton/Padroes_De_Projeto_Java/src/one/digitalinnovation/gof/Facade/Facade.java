package one.digitalinnovation.gof.Facade;

import one.digitalinnovation.gof.SubSistema1_crm.CrmService;
import one.digitalinnovation.gof.SubSistema2_cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }

}
