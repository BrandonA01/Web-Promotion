public class Main {
    public static void main(String[] args) {

        System.out.println("Solution 1:\n----------------");
        int dayMax = 31;
        String weekday = "Monday";
        for(int i = 1; i <= dayMax; i++){
            switch (i%7){
                case 0:
                    weekday = "Sunday";
                    break;
                case 1:
                    weekday = "Monday";
                    break;
                case 2:
                    weekday = "Tuesday";
                    break;
                case 3:
                    weekday = "Wednesday";
                    break;
                case 4:
                    weekday = "Thursday";
                    break;
                case 5:
                    weekday = "Friday";
                    break;
                case 6:
                    weekday = "Saturday";
                    break;
            }
            if((i%3)==0){
                System.out.println("Day: "+i+" "+weekday);
            }
        }
        System.out.println("\nSolution 2:\n----------------");
        String[] weekdays = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        for(int i = 0; i<=dayMax; i++){
            if((i+1)%3 == 0){
                System.out.println("Day: "+(i+1)+" "+weekdays[i%7]);
            }
        }
    }
}