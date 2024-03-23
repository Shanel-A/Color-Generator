/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alcaraz
 */
public abstract class IFactory {
    
    protected abstract IColoring generateColor(int colPick);
    
    public IColoring doSomething(int col) {
        
        IColoring color = generateColor(col);
        return color;
    }
    
}
