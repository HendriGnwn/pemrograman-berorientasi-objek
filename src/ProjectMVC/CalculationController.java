/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectMVC;

import com.sun.javafx.css.CalculatedValue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Hendri Gunawan - 41815120093
 */
public class CalculationController {
    
    private CalculatorView calculatorView;
    private CalculatorModel calculatorModel;
    
    public CalculationController(CalculatorView calculatorView, CalculatorModel calculatorModel) {
        this.calculatorView = calculatorView;
        this.calculatorModel = calculatorModel;
        
        this.calculatorView.addCalculationListener(new CalculateListener() {});
    }
    
    abstract class CalculateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            int firstNumber, secondNumber = 0;
            try {
                firstNumber = calculatorView.getFirstNumber();
                secondNumber = calculatorView.getSecondNumber();
                
                calculatorModel.addTwoNumbers(firstNumber, secondNumber);
                calculatorView.setCalSolution(calculatorModel.getCalculationValue());
                
            } catch (NumberFormatException ex) {
                calculatorView.displayErrorMessage("You need to Enter 2 integers, " + ex.getMessage());
            }
        }
    }
    
    
}
