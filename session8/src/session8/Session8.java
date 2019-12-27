/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session8;

/**
 *
 * @author Admin
 */
public class Session8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OneDimension oneDimenObj=new OneDimension();
        oneDimenObj.storeMarks();
        oneDimenObj.displayMarks();
        TwoDimension twoDimenObj=new TwoDimension();
        twoDimenObj.storeMarks();
        twoDimenObj.displayMarks();
        oneDimenObj.displayMark();
        twoDimenObj.displayMark();
        oneDimenObj.displayMark2();
        twoDimenObj.totalMarks();
        ArrayLists objar=new ArrayLists();
        objar.storeMarks();
        objar.displayMarks();
        Strings objString = new Strings();
        objString.displayString();
        StringBuilders objStrBuild=new StringBuilders();
        objStrBuild.displayStrings();
        StringArray objStrArray= new StringArray();
        objStrArray.createArray();
        objStrArray.printArray();
        if (args.length==3){
            System.out.println("First name is : "+args[0]);
            System.out.println("Last name is : "+args[1]);
            System.out.println("Designation is : "+args[2]);
            
        }else{
            System.out.println("Specify the first name ,last name ,and designation");
        }
        if(args.length==3){
            int num1=Integer.parseInt(args[0]);
            int num2=Integer.parseInt(args[1]);
            Wrappers objWrap= new Wrappers();
            objWrap.calcResult(num1,num2,args[2]);
        }else{
            System.out.println("Usage : num1 num2 operator");
        }
        Character chBox='A';
        char chUnbox=chBox;
        System.out.println("Character after autoboxing is :"+chBox);
        System.out.println("Character after unboxint is :"+chUnbox);
        
        
        
    }
    
}
