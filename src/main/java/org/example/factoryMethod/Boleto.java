package org.example.factoryMethod;

public abstract class Boleto {
    private final double valor;
    private double multa;
    private double juros;

    protected Boleto(double valor) {
        this.valor = valor;
    };

    public double calcularMulta(){
        return this.valor * this.multa;
    }

    public double calcularJuros(){
        return this.valor * this.juros;
    }

    public double getValor() {
        return valor;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
};
