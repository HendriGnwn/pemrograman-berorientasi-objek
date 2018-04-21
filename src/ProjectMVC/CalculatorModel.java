/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectMVC;

/**
 * Calculator Model Class
 * 
 * @author Hendri Gunawan - 41815120093
 */
public class CalculatorModel {
    private int calculationValue;
    public void addTwoNumbers(int firstNumber, int secondNumber) {
        this.calculationValue = firstNumber + secondNumber;
    }
    
    public int getCalculationValue() {
        return this.calculationValue;
    }
}
