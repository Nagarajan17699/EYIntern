/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day06;

import java.util.Scanner;

/**
 *
 * @author Nagarajan
 */
public class KaithanFan  {
    
    public static void main(String[] args) throws Exception {
        while(true)
        {
          String spdclass = new Scanner(System.in).nextLine();
          Container c = new Container();
          FanSpeed fs =  c.getFanSpeed("Day6."+spdclass);
          fs.printSpeed();
        }
    }
}
class Container 
{
    public FanSpeed getFanSpeed(String spd) throws Exception
    {
        FanSpeed fs = new FanSpeed();
        Speed sd = (Speed) Class.forName(spd).newInstance();
        fs.setFanspeed(sd);
        return fs;
    }
}

class FanSpeed
{
    Speed fanspeed;

    public void setFanspeed(Speed fs) {
        this.fanspeed = fs;
    }
    
    public void printSpeed(){
    System.out.println("Fan Speed is "+fanspeed);
    }
    
}
abstract class Speed
{
    public void changeSpeed(){};
}

class LowSpeed extends Speed{
    
    public void ChangeSpeed(){
            
    }
}
class MediumSpeed extends Speed{}
class HighSpeed extends Speed{}
class Off extends Speed{}