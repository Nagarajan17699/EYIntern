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
public class KaithanFan2  {
    
    public static void main(String[] args) throws Exception {
        while(true)
        {
          String spdclass = new Scanner(System.in).nextLine();
          Container2 c = new Container2();
          FanSpeed2 fs =  c.getFanSpeed("Day6."+spdclass);
          fs.printSpeed();
        }
    }
}
class Container2 
{
    public FanSpeed2 getFanSpeed(String spd) throws Exception
    {
        FanSpeed2 fs = new FanSpeed2();
        Speed sd = (Speed) Class.forName(spd).newInstance();
        fs.setFanspeed(sd);
        return fs;
    }
}

class FanSpeed2
{
    Speed fanspeed;

    public void setFanspeed(Speed fs) {
        this.fanspeed = fs;
    }
    
    public void printSpeed(){
    System.out.println("Fan Speed is "+fanspeed);
    }
    
}
abstract class Speed_
{
    
}

class LowSpeed_ extends Speed{}
class MediumSpeed_ extends Speed{}
class HighSpeed_ extends Speed{}
class Off_ extends Speed{}