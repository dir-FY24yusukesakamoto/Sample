package sample;

public class Logical {

    public static void main(String[] args) {
        int score = 59;//成績
        
        //and.scoreが40以上、かつ50以下
        System.out.print("SCOREが40以上、かつ50以下：");
        System.out.println(score >=40 && score <= 50);
        
        //OR:SCOREが40以上、または50以下
        System.out.print("SCREが40以上、または50以下：");
        System.out.println(score >= 40 || score <= 50);
        
        //NOT:SCOREが60以上でない
        System.out.print("SCOREが60以上でない：");
        System.out.println(!(score >= 60));
        
        
        
        
        

    }

}
