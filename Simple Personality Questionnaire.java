import java.util.Scanner;


public class CodingCauseImBored {
    public static void main(String[] args){
        
        String[] attributeListOne = {"low class", "empoverished", "sad", "struggling", "paycheck-to-paycheck"};
        String[] attributeListTwo = {"average", "middle of the road", "normal", "somewhat stable", "plain Jane"};
        String[] attributeListThree = {"high class", "high value", "gold status", "disirable", "sought after"};

        String[] titleListOne = {"trash", "loser", "dead-beat", "broke"};
        String[] titleListTwo = {"normie", "cog in the machine", "office worker", "Joe"};
        String[] titleListThree = {"elite", "aristicrat", "high earner", "one percenter"};

        int attListIndexOne = attributeListOne.length;
        int attListIndexTwo = attributeListTwo.length;
        int attListIndexThree = attributeListThree.length;

        int titleListIndexOne = titleListOne.length;
        int titleListIndexTwo = titleListTwo.length;
        int titleListIndexThree = titleListThree.length;

        java.util.Random randomGenerator = new java.util.Random();

        int randAttOne = randomGenerator.nextInt(attListIndexOne);
        int randAttTwo = randomGenerator.nextInt(attListIndexTwo);
        int randAttThree = randomGenerator.nextInt(attListIndexThree);

        int randTitleOne = randomGenerator.nextInt(titleListIndexOne);
        int randTitleTwo = randomGenerator.nextInt(titleListIndexTwo);
        int randTitleThree = randomGenerator.nextInt(titleListIndexThree);


        System.out.println("            Welcome to something to decide who you are!!!           ");
        System.out.println("====================================================================\n");

        System.out.print("how much is your annual salary?:  ");
        Scanner scanObj = new Scanner(System.in);
        int firstAnswer = scanObj.nextInt();

        System.out.println("");
        System.out.println("what is your life strategy?: ");
        System.out.println("1.) working for a company\n 2.) Entrepenuer\n 3.) Cocaine runner");
        int secondAnswer = scanObj.nextInt();

        scanObj.close();

        
        if((firstAnswer < 30000)&&(secondAnswer == 3)){
            System.out.println("you are: " + attributeListOne[randAttOne] + " " + titleListOne[randTitleOne]);
        }else if(((firstAnswer > 30000))&&(firstAnswer < 70000)&&(secondAnswer == 3)){
            System.out.println("you are: " + attributeListTwo[randAttTwo] + " " + titleListOne[randTitleOne]);
        }else if((firstAnswer > 70000)&&(secondAnswer == 3)){
            System.out.println("you are: " + attributeListThree[randAttThree] + " " + titleListOne[randTitleOne]);
        }else if((firstAnswer < 30000)&&(secondAnswer == 2)){
            System.out.println("you are: " + attributeListOne[randAttOne] + " " + titleListTwo[randTitleTwo]);
        }

    }
}
