/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testingApp;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNotSame;
import static junit.framework.Assert.assertNull;
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
        assertNotSame("Nilainya tidak boleh",6,s.faktorial(3));
    }        
    
    /*
     * test case 4: melakukan pengujian apakah 
     * nilai kembalian dari method faktorial bernilai null atau tidak
    */       
    public void testNullFaktorial(){                
        assertNotNull("Nilainya tidak null",s.faktorial(6));
    }            
    
    /*
     * test case 5: melakukan pengujian apakah 
     * nilai kembalian dari method perkalian bernilai null atau tidak
    */       
    public void testNullPerkalian(){                
        assertNull("Seharusnya Nilainya null",s.perkalian(6,9));
    }                
    
    /*
     * test case 6: melakukan pengujian apakah 
     * nilai kembalian dari method perkalian sesuai 
     * hasil perkalian yang sebenarnya 
    */       
    public void testSamePerkalian(){                
        assertSame("Seharusnya Nilainya sama",54,s.perkalian(6,9));
    }                    
}
