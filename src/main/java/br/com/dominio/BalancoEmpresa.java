package br.com.dominio;

import java.util.HashMap;

import static java.util.Objects.nonNull;

public class BalancoEmpresa {

  private HashMap<String, Divida> dividas = new HashMap<String, Divida>();

  public void registraDivida(String credor, String cnpjCredor, double valor) {
    var divida = new Divida();
    divida.setTotal(valor);
    divida.setCredor(credor);
    divida.setCnpjCredor(cnpjCredor);
    dividas.put(cnpjCredor, divida);
  }

  public void pagaDivida(String cnpjCredor, double valor) {
    var divida = dividas.get(cnpjCredor);
    if (nonNull(divida)) {
      divida.paga(valor);

      //Código refatorado
      //      if (valor > 100) {
      //        valor = valor - 8;
      //      }
      //      divida.setValorPago(divida.getValorPago() + valor);
    }
  }
}
