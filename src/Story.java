import java.util.Scanner;

public class Story {
    String name;
    Character mrCutt = new Character();
    Scanner story = new Scanner(System.in);

    public void StoryTime(){


        System.out.println("What would you like to name Your competitor?");
        name = story.nextLine();

        System.out.println("Hello "+name+" you are a MMA fighter with 8 weeks until your next competition \n" +
                "Your goal is to complete a proper weight cut with the challenges ahead of you.\nGOOD LUCK\n");

        mrCutt.displayStats();
//        System.out.println(checkVitals(mrCutt.getHydration(),mrCutt.getMental(),mrCutt.getPhysical()));

        firstWeeks();
        endGame();

        System.out.println("You have completed the weight cut");

        story.close();
    }
    public int checkVitals(int hydration, int mentalHealth, int physicalHealth){
        return (hydration+mentalHealth+physicalHealth)/3;
    }
    public boolean earlyChallenges(){

            System.out.println("Enter 1 to rest or 2 to train");
            String ans = story.nextLine();
            if(ans.equals("1")){
                mrCutt.increaseMental(1);
                mrCutt.increaseHydration(1);
            }
            else if (ans.equals("2")){
                mrCutt.increasePhysical(1);
            }
            mrCutt.displayStats();
        //story.close();
        return true;
        }

    public void firstWeeks(){
        for (int i = 1; i <= 5; i++){
            earlyChallenges();
        }
    }
    public void endGame(){
        System.out.println("You are to your last week");
        String answer= story.nextLine();
            int end = (int) Math.floor(Math.random() * 1);
            switch(end){
                case 0:
                    System.out.println("You are offered a drug from someone in the gym\nEnter 1 to take 2 to refuse");
                    answer= story.nextLine();
                    if (answer.equals("1")){
                        mrCutt.increasePhysical(2);
                        mrCutt.decreaseHydration(1);
                        mrCutt.decreaseMental(2);
                }
                    if (answer.equals("2")){
                        mrCutt.increaseHydration(1);
                        mrCutt.increaseMental(1);
                    }
                case 1:
                    System.out.println("You are over weight still do you wear a trash bag to cut?\nEnter 1 to take 2 to refuse");
                    answer=story.nextLine();
                    if (answer.equals("1")){
                        mrCutt.decreaseHydration(2);
                        mrCutt.increaseMental(1);
                    }
                    if (answer.equals("2")){
                        mrCutt.increaseHydration(1);
                        mrCutt.increaseMental(1);
                    }
                    case 2:
                        System.out.println("You drink less water to make the weight");
                        mrCutt.decreaseHydration(3);
            }
        }
    }
