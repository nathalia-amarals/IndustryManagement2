/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package industrymanagement;

import com.mbr.industrymanagement.screens.InFrame;
import com.mbr.industrymanagement.screens.LoginFrame;

/**
 *
 * @author nsousa
 */
public class IndustryManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Aqui");        
        LoginFrame loginFrame =  new LoginFrame();
        loginFrame.setVisible(true);
        System.out.println("Passou");
    }
    
}
