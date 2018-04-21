/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectMVC;

import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Hendri Gunawan - 41815120093
 */
public class CalculatorView extends JFrame {
    private JTextField firstNumber = new JTextField(10);
    private JLabel additionalLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculationButton = new JButton("Calculate");
    private JTextField calSolution = new JTextField(10);

    public CalculatorView() {
        JPanel calcPanel = new JPanel();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,200);
        
        calcPanel.add(firstNumber);
        calcPanel.add(additionalLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculationButton);
        calcPanel.add(calSolution);
        
        this.add(calcPanel);
    }
    
    public int getFirstNumber() {
        return Integer.parseInt(firstNumber.getText());
    }
    
    public int getSecondNumber() {
        return Integer.parseInt(secondNumber.getText());
    }
    
    public int getCalSolution() {
        return Integer.parseInt(calSolution.getText());
    }
    
    public void setCalSolution(int solution) {
        calSolution.setText(Integer.toString(solution));
    }
    
    public void addCalculationListener(ActionListener listenerForCalButton) {
        calculationButton.addActionListener(listenerForCalButton);
    }
    
    public void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
