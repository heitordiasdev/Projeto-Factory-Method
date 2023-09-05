package org.example.factoryMethod.cartaoA;

import org.example.factoryMethod.Boleto;

public class BoletoCartaoASessentaDias extends Boleto {
    protected BoletoCartaoASessentaDias(double valor) {
        super(valor);
        setJuros(0.12);
        setMulta(0.20);
    }
}
