package org.programm.tasks;

public class Task1 {
    public String getComputers(int number){

        if(number < 10){
            char numChar = (char)(number + '0');

            if(numChar =='1'){
                return numChar + " компьютер";

            }else if(numChar =='2'||
                    numChar =='3'||
                    numChar =='4'){
                return numChar + " компьютера";

            }else {
                return numChar + " компьютеров";
            }

        }else{

            char[] chars = (String.valueOf(number)).toCharArray();
            int lastDigit = Integer.parseInt(String.valueOf(chars[chars.length - 2]) + chars[chars.length - 1]);
            char numChar =  chars[chars.length - 1];

            if(lastDigit>=11 && lastDigit<=14){
                return number+" компьютеров";}

            else if(chars[chars.length - 1] =='1'){
                    return number + " компьютер";

            }else if(numChar =='2'||
                    numChar =='3'||
                    numChar =='4'){
                return number + " компьютера";

            }else {
                return number+ " компьютеров";
            }
        }
    }
}
