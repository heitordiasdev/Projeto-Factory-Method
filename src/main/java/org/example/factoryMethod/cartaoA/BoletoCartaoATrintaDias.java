package org.example.factoryMethod.cartaoA;

import org.example.factoryMethod.Boleto;

public class BoletoCartaoATrintaDias extends Boleto {
    protected BoletoCartaoATrintaDias (double valor) {
        super (valor);
        setJuros(0.05);
        setMulta(0.10);
    }
}
