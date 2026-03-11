package Exercicio03;

import java.util.Random;

public class BilheteUnico {

    Random rd = new Random();
    int numero;
    String usuario;
    double saldo;
    String tipoTarifa;
    final static double tarifa = 5.50;



    public BilheteUnico(String usuario, String tipoTarifa){

    this.numero = rd.nextInt(1000, 9999);
    this.usuario = usuario;
    this.tipoTarifa = tipoTarifa;
    this.saldo = 0;

    }

    public void passarNaCatraca(){
        double valor = tarifa;
        if (tipoTarifa.equalsIgnoreCase("professor") ||
                tipoTarifa.equalsIgnoreCase("estudante")){
            valor = tarifa/2;
        }
        if (saldo < valor){
            return;
        }
        saldo -= valor;
    }
