/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb.bl;

import javax.ejb.Local;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Obakeng
 */
@Local
public interface FinalMarkCalculatorLocal {

    Double CalculateMark(Double semesterMark, Double examMark);

    String Result(Double total);
    
}

