package br.com.dominio;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pagamento {
    private String pagador;
    private String cnpjPagador;
    private double valor;
    private Calendar data;
}
