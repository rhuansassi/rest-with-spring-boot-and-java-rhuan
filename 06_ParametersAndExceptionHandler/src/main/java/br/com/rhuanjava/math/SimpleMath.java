package br.com.rhuanjava.math;

import br.com.rhuanjava.exceptions.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;

public class SimpleMath {

    public Double sum(Double numberOne, Double numberTwo){
        return numberOne + numberTwo;
    }

    public Double subtraction(Double numberOne, Double numberTwo){
        return numberOne - numberTwo;
    }

    public Double multiplication(Double numberOne, Double numberTwo){
        return numberOne * numberTwo;
    }

    public Double division(Double numberOne, Double numberTwo){
        return numberOne / numberTwo;
    }

    public Double mean(Double numberOne, Double numberTwo){
        return (numberOne + numberTwo)/2;
    }

    public Double squareRoot(Double numberOne){
        return Math.sqrt(numberOne);
    }
}
