package view;

import controller.OperacaoController;

public class Teste {
    
    public static void main(String[] args) {
        OperacaoController operacaoController = new OperacaoController();
        
 
        int numeroPar = 10;
        try {
            int resultado = operacaoController.operacaoValor(numeroPar);
            System.out.println("Resultado para " + numeroPar + ": " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
   
        int numeroImpar = 3;
        try {
            int resultado = operacaoController.operacaoValor(numeroImpar);
            System.out.println("Resultado para " + numeroImpar + ": " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        int numeroNegativo = -5;
        try {
            int resultado = operacaoController.operacaoValor(numeroNegativo);
            System.out.println("Resultado para " + numeroNegativo + ": " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
