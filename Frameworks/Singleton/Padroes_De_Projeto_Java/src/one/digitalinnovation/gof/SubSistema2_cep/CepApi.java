package one.digitalinnovation.gof.SubSistema2_cep;


public class CepApi {

    private static CepApi instancia = new CepApi();

private CepApi(){
    super();
}

public static CepApi getInstancia(){
   
    return instancia;
}

    public String recuperarCidade(String cep){
        return "Cidade Teste";
    }

    public String recuperarEstado(String cep){
        return "Estado Teste";
    }
}
