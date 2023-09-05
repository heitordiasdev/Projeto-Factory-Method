package org.example.factoryMethod.cartaoA;

import org.example.factoryMethod.Boleto;

public class BoletoCartaoADezDias extends Boleto {

    protected BoletoCartaoADezDias(double valor) {
        super(valor);
        setJuros(0.02);
        setMulta(0.05);
    }
}
