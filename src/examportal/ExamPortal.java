/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examportal;

/**
 *
 * @author HP
 */
public class ExamPortal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Start s=new Start();
       OptionFrame f=new OptionFrame();
        
        s.setVisible(true);
        try {
            
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                s.prognum.setText(Integer.toString(i)+"%");
                s.progbar.setValue(i);
                if(i==100)
                {
                    s.setVisible(false);
                    f.setVisible(true);
                }
            }
        } catch (Exception e) {
        }
    }
    
}
