package br.com.dominio;

import lombok.*;

import java.util.ArrayList;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Divida {
  private double total;
  private String credor;
  @Setter(AccessLevel.NONE)
  private Cnpj cnpjCredor = new Cnpj();
  private Pagamentos pagamentos = new Pagamentos();

}
