/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laba;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nshs7-132
 */
public class ColectOfTest {
    
    List<PieceOfTest> totalTests = new ArrayList();
    
    
    void addTest(){
        // ітератором захєрячити всю діч
        //
        //  там не get а шось інше має бути... треба зберегти дані кудась
        totalTests.get(0).addQuestion();
        totalTests.get(0).addAnswer();
    }
    
}
