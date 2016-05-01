/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatranning;

/**
 *
 * @author ravinder
 */
public class AbstractTester  extends AbstractClass{
    
    @Override 
    public void Play()
    {
       System.out.println("Playing "+Name);
    }
    String Name="";
    public String getName()
    {
      return Name;
    }
    public void setName(String _name)
    {
      this.Name=_name;
    }
}
