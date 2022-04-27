package br.com.dominio;

public class GerenciadorDeDividas {

    public void efetuaPagamento(Divida divida, double valor) {
        divida.paga(valor);
//        Código refatorado
//        if (valor > 100) {
//            valor = valor - 8;
//        }
//        divida.setValorPago(divida.getValorPago() + valor);
    }

}
