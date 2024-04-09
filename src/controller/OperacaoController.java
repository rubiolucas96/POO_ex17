package controller;

public class OperacaoController {
    
    public int operacaoValor(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("O parâmetro não pode ser negativo.");
        }
        
        if (numero % 2 == 0) {
            return numero * numero; 
        } else {
            return numero * numero * numero; 
        }
    }
}

