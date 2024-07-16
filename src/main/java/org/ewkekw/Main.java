package org.ewkekw;

import org.ewkekw.model.Cliente;
import org.ewkekw.model.ContaCorrente;
import org.ewkekw.model.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente ewkekw = new Cliente();
        ewkekw.setNome("nome do caba");

        ContaCorrente corrente = new ContaCorrente(ewkekw);
        ContaPoupanca poupanca = new ContaPoupanca(ewkekw);

        corrente.depositar(1000);
        corrente.transferir(100, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}