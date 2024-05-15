
package nurseryrhymes;

public class Nurseryrhymes {
    

    public static void farm(String animal, String sound) {
        System.out.println("The " + animal + " goes " + sound);
        
    }
    
    public static void monkey_song(int number_of_monkeys) {
        while (number_of_monkeys > 0) {
            System.out.println(number_of_monkeys + " monkeys jumping on the bed");
            System.out.println("One fell off and bumped his head");
            System.out.println("Mama called the doctor, and the doctor said");
            System.out.println("\"No more monkeys jumping on the bed!\"");
            number_of_monkeys -= 1;
            System.out.println("----------------------------------"); //clenliness 
        }
    }
            
    public static void hickory_dickory(int time) {
        System.out.println("Hickory Dickory Dock\n"
                + "The mouse ran up the clock\n"
                + "The clock struck " + time +"\n"
                + " The mouse ran down\n"
                + " Hickory Dickory Dock");
        System.out.println("----------------------------------"); //clenliness 

    }
    public static void bottles(int bottles) {
        while (bottles > 0){
            System.out.println(bottles + " of milk on the wall\n"
                        + bottles + " bottles of milk.\n"
                        + "Take one down, pass it around\n"
                        + --bottles + " of milk on the wall");
            System.out.println("----------------------------------");
        }
    }
    
    public static void hokey_pokey(String thing_that_in) {
        System.out.println("You put your "+ thing_that_in +" in\n"
                + "You put your " + thing_that_in + " out\n"
                + "You put your "+ thing_that_in +" in\n"
                +"And you shake it all about\n"
                + "You do the Hokey Pokey\nAnd you turn yourself about\nThat's what it's all about!");
        
    }
    
    public static void bingo(String bingo_word){
        System.out.println("There was a farmer who had a dog\n"
                + "And bing was his name-o\n"
                + "(" + bingo_word + ") - I - N - G - O\n"
                + "(" + bingo_word + ") - I - N - G - O\n"
                + "(" + bingo_word + ") - I - N - G - O\n"
                + "And bing was his name-o");
    }
    
    public static void frogs(int num_of_frogs){
        while (num_of_frogs > 0){
            System.out.println(num_of_frogs + " little speckles frogs\n"
                    + "Sitting on a speckled log\n"
                    + "eating the most delicious bugs\n"
                    + "yum, yum"
                    + "one jumped into the pool"
                    + "where it was nice and cool"
                    + "now there are " + --num_of_frogs +" little speckled frogs!\n"
                            + "ribbit ribbit");
            
            System.out.println("-----------------------------------------");
        }
    }
        

    public static void main(String[] args) {
        String clean = "----------------------------------";
        farm("Dog","Bark");
        System.out.println(clean);
        System.out.println(clean); //IDK how to multply a string like in python
        System.out.println(clean);
        System.out.println(clean);
        System.out.println(clean);
        monkey_song(20);
        
        System.out.println(clean);
        System.out.println(clean); //IDK how to multply a string like in python
        System.out.println(clean);
        System.out.println(clean);
        System.out.println(clean);
        hickory_dickory(9);
        System.out.println(clean);
        System.out.println(clean); //IDK how to multply a string like in python
        System.out.println(clean);
        System.out.println(clean);
        System.out.println(clean);
        bottles(10);
        System.out.println(clean);
        System.out.println(clean); //IDK how to multply a string like in python
        System.out.println(clean);
        System.out.println(clean);
        System.out.println(clean);
        hokey_pokey("thing");
        System.out.println(clean);
        System.out.println(clean); //IDK how to multply a string like in python
        System.out.println(clean);
        System.out.println(clean);
        System.out.println(clean);
        frogs(10);
        // this toook to long.
    }
    
}
