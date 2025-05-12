/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb.bl;

import javax.ejb.Stateless;


/**
 *
 * @author Obakeng
 */
@Stateless
public class FinalMarkCalculator implements FinalMarkCalculatorLocal {

    
    

    @Override
    public Double CalculateMark(Double semesterMark, Double examMark) {
        Double total = (semesterMark/2) + (examMark/2);
        return total;
    }

    @Override
    public String Result(Double total) {
        
        if(total >= 50 && total < 75)
        {
            return "Passed";
        }
        else if(total >= 75)
        {
            return "Passed with Distinction";
        }
        else if(total <= 49 && total >= 40)
        {
            return "Supplementary";
        }
        else
        {
            return "Fail";
        }
    }
    

    
}

