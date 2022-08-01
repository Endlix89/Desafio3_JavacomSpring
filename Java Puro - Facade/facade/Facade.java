package facade;

import subSistema1.crm.crmservice;
import subSistema2.cep.cep;

public class Facade {

  public void migrarCliente(String nome, String cep, String estado, String cidade){
    cep.getInstancia().recuperarCidade(cep);
    cep.getInstancia().recuperarEstado(cep);

    crmservice.gravarCliente(nome, cep, estado, cidade);



  }
}