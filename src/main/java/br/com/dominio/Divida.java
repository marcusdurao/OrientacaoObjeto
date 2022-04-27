package br.com.dominio;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Divida {
  private double total;
  private double valorPago;
  private String credor;
  private String cnpjCredor;

  public void paga(double valor) {
    if (valor > 100) {
      valor = valor - 8;
    }
    this.valorPago += valor;
  }
}
