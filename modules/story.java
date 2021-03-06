// Package : Tells the program that this class is stored inside a folder
package modules;

// Story class (stores everything related to the story)
public class story {
    // Initialize private variables
    // plr stores the current player object
    private player plr;
    // optionSystem stores the current optionHandler object
    private optionHandler optionSystem;
    // combatSystem stores the current combatSystem object
    private combatSystem cSystem;

    // Story line : A 2d array which has the strings from parts of the story. Each subArray inside the mainArray can be indexed, in which, the index is considered the part
    private String[][] storyLine = {
        // Part 0
        {
            "You hear the alarm ringing. ",
            // Play the alarm sound located in ./resources
            "{play: alarm}",
            "Its {systemTime}",
            "The sun shines on your eyes."
        },
        // Part 1
        {
            "You tuck yourself underneath your blanket and attempt to sleep for 10 more minutes.",
            "Accidentally, you sleep for another 30 mins and rush to get out of your house",
            "You shower, brush your teeth and grab some toast before rushing outside",
            "On your way to work, you best friend, Michael, offered you a ride to your work"
        },
        // Part 2
        {
            "You wake up",
            "You rub your eyes while trying to get up from your bed",
            "You stretch and yawn",
            "You open the curtains and see your small town of Hupani",
            "You do your morning routine, shower, dress up, eat a nice breakfast, brush your teeth and then head out to work",
            "",
            "On your way to work, you best friend, Michael, offered you a ride to your work"
        },

        // Part 3
        {
            "After agreeing to have a ride, you hop in his car and start going to work",
            "{play: car}",
            "You talk to him about your favourite food and you guys joke around"
        },
        // Part 4
        {
            "He still insists you go with him.",
            "{play: car}"
        },
        
        // Part 5
        {
            "While traveling you and michael talk about the recent news.",
            "You eventually reach your destination.",
            "",
            "Michael: Here we are, that's the lab. Eisenhower's lab, one of the smartests scientists living, made immense breakthoughs. You're lucky you work here.",
            "{plrName}: I could get you a job here too if you wanted. You and Michael laugh.",
            "You get off the car and say goodbye to Michael",
            "{clearScreen}",
            "Later that evening, you overhear a group of people arguing",
            "They look like the scientists working with Eisenhower.",
            "They were arguing about a potential accident that may occur",
            "",
            "Scientist #1: That idea is too risky, further development of this will cause a catastrophe.",
            "Scientist #2: It is risky, but if it succeeds, we can change the world with this.",
            "Scientist #1: This could cause an explosion that'll' do more harm than good.",
            "Scientist #3: We should be safe and discuss it with Dr. Eisenhower first.",
            "Scientist #4: Why are we waiting for his approval? If we do this ourselves, we'll be the famous ones",
            "Scientist #2: Let’s do this.",
            "Scientist #1 & #3 agree and they start walking back into the laboratory",
            "{clearScreen}",
            "After hearing that, you were concerned, but put your faith in the scientists to not cause an accident",
            "You finally get home and eat dinner and catch up on some shows you have missed due to work",
            "Your eyes became tired and you start to fall asleep",

            // Play the explosion sound
            "{play: explosion}",

            "You are fast asleep until you hear an explosion",
            "",
            "You turn on the tv to check the news and open the curtains to learn what was happening",

            // Play the radio sound
            "{play: radio}",
            "News Anchor: Laboratory 'Future' owned by Dr. Eisenhower has recently been in an accident. Police are searching the area for any bodies and the cause of this explosion",
            "News Anchor: The laboratory seems to be emitting some sort of mysterious fumes. The state is currently in a state of emergency. Health advisors reccommend not to inhale these fumes and go outside, until deemed safe",
            "You take a look outside and see a sort of blue mist covering the whole area",
            "You close your window.",
            "{clearScreen}",
            "It's currently {systemTime}.",
            "What's happening?",
            "You feel a sort of uneasiness.",
            "{play: heartbeat}",
            "Your head starts to hurt, knees become weak and heart starts pounding faster..",
            ".and faster.",
            "",
            "You start coughing up blood.",
            "There is sweat all over your body", 
            "You start feeling heavy",
            "*You blackout*",
            "{clearScreen}",
            "You wake up with Michael looking towards you.",
            "",
            "{plrName}: This looks like.. A hospital.",
            "{plrName}: Where.. Am I?",
            "",
            "Michael: Stay still for now. I'm here.",
            "",
            "Michael: Are you alright?",
            "",
            "{plrName}: Im okay for now. *Coughs*",
            "Michael: You're lucky I was here.",
            "{plrName}: How'd you know I was injured?",
            "",
            "Michael: I was walking past your apartment to go to my family’s apartment and then I heard weird noises from your apartment. That's when I rushed in.",
            "{plrName}: I don't really remember, it's like.. I just can't describe it.",
            "{plrName}: Anyways, I remember waking up at night yesterday. What the hell happened to the lab?",
            "",
            "Michael: The place blew up due to an explosion created by 4 scientists, atleast that's what the police think.",
            "Michael: They say that the scientists were creating a new fuel source. One very strong, could last a long time and doesn’t cause harm to the environment.",
            "Michael: Too bad it was really combustible and it blew up.",
            "Michael: Weren't you near the lab yesterday?",
            "Didn't you hear anything about the experiment they were doing?"
        },

        // Part 6
        {
            "{plrName}: I overheard those scientists debating whether or not they should do the experiment or not. I believed in them so I didn't say anything, I was also really tired and just wanted to get home and rest.",
            "Michael: You should have told them not to risk it! So many people are dead, hospitalized, or sick including you. That was selfish, at least you told me about this. If you lied or did not say anything it would be a lot worse."
        },

        // Part 7
        {
            "{plrName}: I didn't hear the scientists. "
        },

        // Part 8
        {
            "Michael: All of Hupani right now is in utter chaos. Certain people who breathe in specific coloured gases either die, mutate and get stronger. I wonder what Dr. Eisenhower was doing in that lab.",
            "{plrName}: What happened to me? I don’t feel that different right now.",
            "Michael: You look normal right now, I heard it takes a while for the virus to get you. I’m gonna go check on my family, just rest here a while.",
            "",
            "Michael leaves your apartment and ran to his family’s house",
            "",
            "You feel drowsy......",
            "{clearScreen}",
            "{play: scaryAmbience}",
            "Your back starts to hurt",
            "You start sweating heavily again and your arms and legs feel a lot heavier",
            "Your muscles start to ache and you start screaming again",
            "You try to sleep away the pain.",
            "You can't sleep.",
            "You limp over to the mirror to check yourself",
            "{plrName}: What the hell is happening? I feel.. different. I-",
            "In the middle of your sentence, you hear smashing and screaming, it’s coming from outside.",
            "You rush outside and spot a group of thugs trying to rob Michael and his family.",
            "Michael: Hey {plrName}, please help me!",
            "",
            "Help Michael fight the thugs?"
        },


        // Part 9
        {
            "{plrName}: Ok Michael, I'll fight these guys and you help your family.",
            "{plrName} engages on the thugs"
        },
        // Part 10
        {
            "{plrName}: I don't think I can help. I don't know how strong I am yet, this power could kill you too if I get out of control. It’s too risky.",
            "Michael: I BEG YOU, PLEASE HELP ME. MY FAMILY WILL BE INJURED.",
            "{plrName}: I’m sorry, I can't help.",
            "The thugs are laughing at you and calling you weak and a coward",
            "Thugs: What a pathetic guy. HAHAHAHA! Let’s get him too.",
            "Out of anger you want to start fighting", 
            "Two of the thugs try fighting you while Michael and his father defends his family"
        },

        // FIGHT SCENE

        // Part 11
        {
            "You beat two of the thugs",
            "The other thugs from the group are scared off",
            "Michael: Thanks for saving my family, {plrName}. It means a lot.",
            "{plrName}: I didn’t know I wielded so much power and that I could control it. I’m happy that helped you anyways.",
            "Michael: I am in debt to you. What are you gonna do about this town?",
            "{plrName}: I'll try to help everyone in need. There are a lot of people who'll try to take advantage of this chaos.",
            "Micheal: Let’s go help other people!",
        },

        // Part 12
        {
            "[5 days later]",
            "{play: phonecall}",
            "You get a phone call",
            "Anonymous: Hello there, {plrName}",
            "Anonymous: I've been waiting to talk to you.",
            "{plrName}: Who are you?",
            "Anonymous: I'd like to talk to you about something.",
            "Anonymous: Let's meet up at Midstate building in eastern Hupani.",
            "",
            "Should I go?"
        },

        // Part 13
        {
            "You didn't go to the location that the caller called from.",
            "",
            "[2 days later]",
            "{play: doorKnock}",
            "You hear knocks at your door.",
            "You open the door.",
            "There are pictures of Michael's family.",
            "You call the anonymous phone number back.",
            "You tell him you're coming.",
            "",
            "Should I bring Michael with me?"
        },

        // Part 14
        {
            "You decide to go to eastern hupani",
            "Should I bring Michael with me?"
        },
        // Part 15
        {
            "You didn't bring Michael with you.",
            "{play: car}",
            "You travel to eastern Hupani by yourself.",
            "You enter the building.",
            "A bearded man is sitting on a chair.",
            "Bearded Man: Please sit. Make yourself comfortable.",
            "I heard you had some special..",
            "abilities.",
            "I'll forgive you for everything, my dead men, the damage you've done to my reputation, for everything. Just let me take a sample of your blood.",
            "Join Juliano and save michael's family?",
        },
        // Part 16
        {
            "You brought Michael with you. ",
            "You travel to eastern Hupani with Michael.",
            "You and Michael enter the building.",
            "",
            "Michael: There he is, Juliano Capoto. The leader of the crime group that's been terrorizing eastern Hupani.",
            "You two walk into the building and encounter Juliano.",
            "Juliano: Do you know who I am? Do you know who you messed with?",
            "Juliano gets angry and gets up from his chair",
            "You hear a man and woman crying.",
            "Juliano: You see these people? Their child died to the virus.",
            "",
            "*Juliano smirks*",
            "",
            "Juliano: Timothy Eisenhower. He works for me.",
            "Juliano: The virus you have inside you.",
            "Its perfect. It's what the virus was made for.",
            "The superhuman strength you have, the abilities you've gained, it's all because of me.",
            "Join me. We will take over the world together. With your power, and my money.",
            "Michael: Don't do this {plrName}. He has my family. Please.",
            "Juliano: Get this man out of here. Put him with his family.",
            "*Michael gets dragged out of the room*",
            "",
            "Join Juliano?"
        },
        // Part 17
        {
            "You join Juliano.",
            "*You feel a big thump on your head*",
            "*You blackout*"
            // Game over.
            
        },

        // Part 18
        {
            "You decline Juliano's offer and decide to fight him.",
            // Juliano fight
        },

        // Part 19
        {
            "While on his dying breath Juliano says",
            "Juliano: Tell. Timothy.. To activate Protocol.. 102",
            "{plrName}: Where do I find Timothy?",
            "Juliano: He's in.. the second.. floor.",
            "*Juliano stops breathing.*",
            "You travel to the second floor",
            "You see Timothy working on a big robot.",
            "You tell Timothy what Juliano said.",
            "*Timothy smirks*",
            "Timothy presses a button.",
        },

        // Part 20
        {
            "== 2 Days Later ==",
            "It is 8:00 in the night.",
            "News report: It seems the gas is seeming to fade away, thanks to great scientist Timothy Eisenhower",
            "You go back to sleep."
            // Good ending
        }

    };


    // OptionData : A 2d array which stores different options. Each subArray inside the main array can be indexed, in which the index can be considered as the question number.
    private String[][] optionData = {
        // 0 "Wake up"
        {
            "Sleep for 10 more minutes",
            "Wake up"
        },
        // 1 "Should go with michael?"
        {
            "You agree to hop in the car with him",
            "You tell him it's okay"
        },
        // 2 "Did you hear the scientists talking"
        {
           "Tell him you overheard them talking about it",
           "Don’t tell him that you over heard it"
        },

        // 3: "Help Michael fight the thugs"
        {
            "Yes",
            "No"
        },

        // 4: Go to eastern hupani?
        {
            "Go to Eastern Hupani",
            "Don't go to Eastern Hupani"
        },

        // 5: Bring Michael?
        {
            "Bring Michael With you",
            "Don't bring Michael with you"
        },

        // 6: Join Juliano?
        {
            "Join Juliano",
            "Fight to save humanity"
        }
        

        
    };
    
    
    /* Constructor */
    /**
     * Story constructor, each time the program initializes a story, this constructor will make a combat system for the player.
     * The setOptionHandler is done seperately and not inside a constructor because the optionHandler 
     * requires the player and the mainstory as a parameter.
     * 
     * @param _plr The player object that is in use
     */
    public story(player _plr){
        // Initiate the private var plr as the passed parameter
        plr = _plr;

        // Make a new combat system for the player
        cSystem = new combatSystem(plr);
    }

    /**
     * Set option handler
     * 
     * @param _optionHandler The optionHandler that is used for the player (This will be given by the main file (Run.java))
     */
    public void setOptionHandler(optionHandler _optionHandler){
        // Sets the optionhandler as the passed parameter
        optionSystem = _optionHandler;
    }


    /* Part methods */
        /*
            Each part of the story has it's own method because if it was all inside one method, 
            the congitive complexity would increase by a lot. Making the code unreadable.
        */

    // Part 0  (Wake up)
    private void partZero(int optionChose){
        // You sleep for 10 more minutes
        if (optionChose == 0){
            // The tellPart Runs through the story list and tells the user that part
            optionSystem.tellPart(1);
            // Ask option method gets the option of the parameter passed as index for the String list optionData
            optionSystem.askOption(1);

        // You wake up instantly
        } else if (optionChose == 1){
            // Add sanity method adds +1 Sanity to the player (Sanity helps the player do more damage)
            plr.addSanity();
            // Tell part 2 of the story
            optionSystem.tellPart(2);
            // ask option 1
            optionSystem.askOption(1);
        }
    }

    // Part 1 (Should go with michael?)
    private void partOne(int optionChose){
        // You agree to hop in his car
        if (optionChose == 0){
            plr.addSanity();

            optionSystem.tellPart(3);
            optionSystem.tellPart(5);
            optionSystem.askOption(2);

        // You disagree
        } else if (optionChose == 1){
            // Subtract sanity method subtracts 1 sanity from the player which makes the player do less damage
            plr.subtractSanity();  

            optionSystem.tellPart(4);
            optionSystem.tellPart(5);
            // Ask option 2 ()
            optionSystem.askOption(2);
        }
    }

    // Part 2 (Did you hear the scientists talking)
    private void partTwo(int optionChose){

        // You overheard the scientists talking (truth)
        if (optionChose == 0){
            plr.addSanity();

            optionSystem.tellPart(6);
            optionSystem.tellPart(8);

            optionSystem.askOption(3);
            
        // You didn't overhear the scientists talking (lie)
        } else if (optionChose == 1){
            plr.subtractSanity();
            optionSystem.tellPart(7);
            optionSystem.tellPart(8);

            optionSystem.askOption(3);
        }
    }

    // Part 3 (Help Michael Fight thugs?)
    private void partThree(int optionChose){
        // Help Michal Fight The Thugs
        if (optionChose == 0){
            plr.addSanity();
            optionSystem.tellPart(9);

            // Setup combat system for thugs (with 100 hp)
            cSystem.encounter("thugs", 100);
            
            // After the fight is done
            optionSystem.tellPart(11);
            optionSystem.tellPart(12);

            optionSystem.askOption(4);

        // Don't help Michael fight the thugs
        } else if (optionChose == 1){
            plr.subtractSanity();
            optionSystem.tellPart(10);

            // Setup combat system for thugs (with 100 hp)
            cSystem.encounter("thugs", 100);

            // After the fight is done
            optionSystem.tellPart(11);
            optionSystem.tellPart(12);

            optionSystem.askOption(4);
        }
    }

    // Part 4 (Go to eastern hupani?)
    private void partFour(int optionChose){
        // Answer the phone call
        if (optionChose == 0){
            optionSystem.tellPart(14);
            optionSystem.askOption(5);
            
        // Don't answer the phone call
        } else if (optionChose == 1){
            plr.addSanity();
            optionSystem.tellPart(13);
            optionSystem.askOption(5);
        }
    }

    // Part 5 (Bring Michael with you?)
    private void partFive(int optionChose){
        // Bring Michael
        if (optionChose == 0){
            optionSystem.tellPart(16);
            optionSystem.askOption(6);

        // Didn't bring Michael with you
        } else if (optionChose == 1){
            plr.subtractSanity();
            optionSystem.tellPart(15);
            optionSystem.askOption(6);
            
        }
    }

    // Part six (Join Juliano?)
    private void partSix(int optionChose){
        // Bad ending
        if (optionChose == 0){
            optionSystem.tellPart(17);
            // Wait 1 second
            util.wait(1.0);
            // Clear screen
            util.clearScreen();
            // Tell player game over
            util.rollCredits();
            System.exit(0);

        // Good ending
        } else if (optionChose == 1){
            optionSystem.tellPart(18);
            cSystem.encounter("boss", 300);
            optionSystem.tellPart(19);
            optionSystem.tellPart(20);
            util.wait(3.0);
            util.rollCredits();
            System.exit(0);
        }
    }
    

    
    /* Public methods */
    /**
     * ChooseOption Method, this runs before the player chooses an option
     * 
     * @param part The part of the story the player is on (The index of the current optionData subArray)
     * @param optionChose The option that the player has chosen (The index that will be used to show the option inside the current subArray)
     */
    public void chooseOption(int part, int optionChose){
        // Sleep Question
        if (part == 0){
           partZero(optionChose);

        // Should go with michael question
        } else if (part == 1){
            partOne(optionChose);

        // Scientist hearing question
        } else if (part == 2){
            partTwo(optionChose);

        // Help Michael Fight thugs?
        } else if (part == 3){
            partThree(optionChose);

        // Go to eastern hupani?
        } else if (part == 4){
            partFour(optionChose);

        // Bring Michael with you?
        } else if (part == 5){
            partFive(optionChose);

        // Join Juliano?
        } else if (part  == 6) {
            partSix(optionChose);
        }
    }

    /**
     * Returns the storyLine array
     * 
     * @return Return the storyLine 2d array
    */ 
    public String[][] getStory(){
        return storyLine;
    }

    /**
     * Returns the optionData array 
     * 
     * @return The optionData 2d array
     */
    public String[][] getOptionData(){
        return optionData;
    }
}
