/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectMVC;

/**
 * the main class
 * 
 * @author Hendri Gunawan - 41815120093
 */
public class ProjectMVC {
    public static void main(String[] args) {
        CalculatorView calculatorView = new CalculatorView();
        CalculatorModel calculatorModel = new CalculatorModel();
        CalculationController calculationController = new CalculationController(calculatorView, calculatorModel);
        calculatorView.setVisible(true);
    }
}
