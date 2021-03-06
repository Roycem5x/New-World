/*
    Program Name:
        New-World

    Developers:
        Royce Mathew
        Xinghao Li
        Jien Terence Laure

    Date:
        2021-01-28
        
    Description:
        This project is a story based immersive rpg experience. The player will be able to choose what the future of the character will be. 
        Every option that the player chooses could potentially lead to a different outcome. 
        The player is able to fight bosses by solving math problems randomly generated by the program. 

        The program includes modules such as:
            check : This module helps check input, it is normally used for checking and converting input to integers.
            combatSystem : This module handles everything related to combat.
            optionHandler : This module handles how to run the story, and give options to the player
            player : This module keeps data on the player.
            questionHandler : Generates random questions for the player to answer, used for combat system.
            story : Handles everything related to the main story
            util : Contians utility that most methods use; such as print, nextLine and more.

    This java program is designed in VSCode, for JavaSE-11, specifically AdoptOpenJDK\jdk-11.09.11-hotspot


    Note:
        Sounds in the resources folder are sounds from www.soundsnap.com. 
        Ending music is Read Dead Redemption 2 Ending Soundtrack.
        We do not take credit for any of these sounds.

*/

// Import player class from modules folder
import modules.player;
// Import utility class from modules
import modules.util;
// Import optionHandler
import modules.optionHandler;
// Import check class (Checks strings and integers)
import modules.check;
// Import story
import modules.story;


// Main Class
class Run {
    // Main Method
    public static void main(String[] args){       

        // Clear the screem
        util.clearScreen();
        // Give the enter prompt
        util.enterPrompt();

        
        util.print("Hello, welcome to new world.");
        // Wait until user presses enter
        util.nextLine();

        util.print("To play this game you must verify your age.");
        // Clear screen when user presses enter and then give enter prompt
        util.nextClearEnter();

        // Prompt user to enter age
        util. print("Please enter your age");
        // Get user input
        String stringAge = util.nextLine();

        // Check user input
        int age = check.checkIfNumber(stringAge);

        // If age is bigger than 12
        if ( age > 12){
            util.print("Your age is: " + age);
        // If age is not bigger than 12
        } else {
            util.print("You cannot play this game");
            // close the program
            System.exit(0);
        }
        
        // Clear screen when user presses enter and then give enter prompt
        util.clearEnter();

        // get name of user (This is done using util class)
        String name = util.getName();
        // Make a new player with parameters (name)
        player plr = new player(name);

        // Make a new story with the player
        story mainStory = new story(plr);

        // Optionhandler is private because it stores private variables such as time
        optionHandler oHandler = new optionHandler(plr, mainStory);

        // Set optionHandler inside mainstory since both classes are private
        mainStory.setOptionHandler(oHandler);
        
        // Tell part 0 of the story
        oHandler.tellPart(0);
        // Ask option 0 of the story
        oHandler.askOption(0);

        // The rest is handled inside the story class

    }
    
}

