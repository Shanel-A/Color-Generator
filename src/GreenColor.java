
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alcaraz
 */
public class GreenColor implements IColoring{
    
    @Override
    public Color getColor() {
        return Color.GREEN;
    }

    @Override
    public String colorName() {
        return "GREEN";
    }
    
}
