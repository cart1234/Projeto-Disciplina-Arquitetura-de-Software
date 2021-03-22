/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sun.xml.internal.ws.policy.spi.AssertionCreationException;
import  org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Willian
 */
public class TesteCalcIdeal {
    
    public TesteCalcIdeal() {
    }
    
    @Test
    public void  CalcIdealPotassio(double solo){
        
        double solo1 = 0.35;
        double solo2 = 0.25;
       
       assertEquals(solo1, solo2);
    }
    
    public void  CalcIdealFosforo(double solo){
        
        double solo1 = 9.0;
        double solo2 = 12.0;
      
       assertEquals(solo1, solo2);
    }
    
    public void  CalcIdealCalcio(double solo){
        
        double solo1 = 6.0;
        double solo2 = 4.0 ;
        
       assertEquals(solo1, solo2);
    }
    
    public void  CalcIdealMagnesio(double solo){
        
        double solo1 = 1.0;
        double solo2 =  1.0 ;
        
       assertEquals(solo1, solo2);
    }
    
    public void  CalcIdealEnxofre(double solo){
        
        double solo1 = 9.0;
        double solo2 = 6.0;
       
       assertEquals(solo1, solo2);
    }
    
    
    
    
    
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
