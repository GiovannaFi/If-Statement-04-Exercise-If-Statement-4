public class Person {
    private int age;

    public Person(){
        int randomN = (int) Math.floor(Math.random()*(80-6)+5);
        System.out.println(randomN);
        age = randomN;
    }

    public void getLifeStage(){
        if (age <= 12) System.out.println("The person is in the childe stage of life");
        else if (age >= 13 && age <= 19) System.out.println("The person is in the teen stage of life");
        else if (age >= 20 && age <= 59) System.out.println("The person is in the adult stage of life");
        else System.out.println("The person is in the senior adult stage of life");
        }
    }
    /*<=12 is a Child
13-19 is a Teen
20-59 is an Adult
+60 is a Senior Adult*/

