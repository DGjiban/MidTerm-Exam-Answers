/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

import java.util.Scanner;

/** This class takes String input from user 
 * and calls method statusDetail to print the 
 * status of User-Rejected,Pending,Processing and Approved.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the status details. 
 * @author srinivsi date:Feb 22
 */
public class Status {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
    Scanner in =new Scanner(System.in);
        
        StatusDetail status0 = StatusDetail.ZERO;
        StatusDetail status1 = StatusDetail.ONE;
        StatusDetail status2 = StatusDetail.TWO;
        StatusDetail status3 = StatusDetail.THREE;
              
        System.out.println("Enter the user status code (zero,one,two,three)");
        String code = in.next();
        
        if(code.equalsIgnoreCase("zero") || code.equals("0")){
            System.out.println(status0.getDesc());
        }else if(code.equalsIgnoreCase("one") || code.equals("1")){
            System.out.println(status1.getDesc());
        }else if(code.equalsIgnoreCase("two") || code.equals("2")){
            System.out.println(status2.getDesc());
        }else if(code.equalsIgnoreCase("three") || code.equals("3")){
            System.out.println(status3.getDesc());
        }else{
            System.out.println("Wrong Status!");
        }
   
    }
    
}
