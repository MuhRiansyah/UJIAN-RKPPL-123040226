/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testingApp;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertSame;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
/**
 *
 * @author SB 604-16
 */
public class SoalTest extends TestCase{
    private static Soal s = new Soal();
    
    /*
     * test case 1: melakukan pengujian apakah 
     * nilai kembalian dari method pangkat bernilai null atau tidak
    */       
    public void testNotNullPangkat(){        
        assertNotNull("Hasilnya tidak Null",s.pangkat(10, 2));
    }
    
    /*
     * test case 2: melakukan pengujian apakah 
     * nilai kembalian dari method pangkat sesuai hasil pemangkatan 
     * yang seharusnya
    */       
    public void testSamePangkat(){                
        assertSame("Harusnya",100,s.pangkat(10,2));
    }    
    
    /*
     * test case 3: melakukan pengujian apakah 
     * nilai kembalian dari method faktorial sesuai hasil faktorial
     * yang seharusnya
    */       
    public void testNotSameFaktorial(){                
        assertNotSame("Harusnya",6,s.faktorial(3));
    }        
}
