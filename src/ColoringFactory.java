/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alcaraz
 */
public class ColoringFactory extends IFactory {
    private IColoring color;
    
    @Override
    
    
        public IColoring generateColor(int colPick){
            
            if (colPick==0)
                color = new RedColor();
            else if (colPick==1)
                color = new BlueColor();
            else if (colPick==2)
                color = new CyanColor();
            else if (colPick==3)
                color = new GrayColor();
            else if (colPick==4)
                color = new GreenColor();
            else if (colPick==5)
                color = new MagentaColor();
            else if (colPick==6)
                color = new OrangeColor();
            else if (colPick==7)
                color = new PinkColor();
            else if (colPick==8)
                color = new WhiteColor();
            else if (colPick==9)
                color = new YellowColor();
            return color;
    }
}
