package textbasedgame;

import java.util.Scanner;

/**
 *
 * @author Μιχαηλ
 */
public class Story {
    private static boolean shave = false;
    private static boolean love = false;
    private static boolean possesed = false;
    private static Player player = null;
    
    public static int Narrate(int score){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name :");
        player = new Player(input.nextLine());
        int choice;
        System.out.println("Last night you went out in a local bar with your friends( to celebrate the promotion of the team you all support to the first division).");
        System.out.println("Your mind though wasn’t at  the celebration you o just wanted an excuse to get drunk.. And so you did.. A lot ..");
        System.out.println("You wake up in the morning with a minor headache  your phone missing and with some blurred memories from last night .");
        System.out.println("After debading with yourself about who was more abnormal the guys you meet last night or the drinks they  bought you you decide to get up .");
        do{
            System.out.println("1. Go to kitchen");
            System.out.println("2. Go to bathroom");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            if(choice < 1 || choice > 2) System.out.println("Invalid choice. Try again.");
        }while(choice < 1 || choice > 2);
        if(choice == 1){
            score = Chapter1a(score);
        }
        else{
            score = Chapter1b(score);
            shave = true;
        }
        System.out.println("You buy coffee, a cheap frozen sandwich and a small bottle of alcohol.");
        System.out.println("You leave the confused clerk and the store and go to the place where you spent a lot of time with your best friend, before his disappearance.");
        System.out.println("You sit down, light a cigarette and drink a sip of coffee, ");
        System.out.println("then pour a little alcohol on the ground\n as you hear a familiar voice.");        
        System.out.println("You turn around and there HE was\n exaclty one year since everyone lost track of him.");   
        System.out.println("He was wearing a huge black cloak covering his entire body, except from the two black swords hanging on his belt.");
        System.out.println("“I'm not dead you fool, you never found my body … I could have been abducted by some kind of boogeyman!”");
        do
        {
            System.out.println("1.Say: ”You are too old to get abducted by the boogeyman”");
            System.out.println("2.Smoke and drink from the bottle");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            if(choice < 1 || choice > 2) System.out.println("Invalid choice. Try again.");
        }while(choice < 1 || choice > 2);
        if(choice == 1){
            score = Chapter2a(score);
        }
        else{
            score = Chapter2b(score);
        
        }
        System.out.println("”You know he has changed his ways... the boogeyman that is.");
        System.out.println("”After some time he figured that children wouldn’t live long enough to finish the training and reach their full potential");
        System.out.println("so he started abducting more mature people.");
        System.out.println("He is not the brightest but he can teach you a lot. “");       
        do
        {
            System.out.println("1.Say: ”Nice! So the mystery of the pedophile monster is solved I guess... Any other news ?”");
            System.out.println("2.Smoke and drink from the bottle ");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            if(choice < 1 || choice > 2) System.out.println("Invalid choice. Try again.");
        }while(choice < 1 || choice > 2);
        if(choice == 1){
            score = Chapter3a(score);
        }
        else{
            score = Chapter3b(score);
        
        }
        System.out.println("YEAH, wanna tell me why you smashed your phone on the face of the son of the most evil tyrant in all dimensions ? ");
        System.out.println("Nevermind it doesn't matter...we don't have much time!");
        System.out.println("Tell me quickly, are you coming with me or not? , says your friend as a portal to a strange world opens.");
         do
        {
            System.out.println("1.Say: ”Sorry man i dont follow ghosts!”,then drink another sip of booze");
            System.out.println("2.Join him ");
            choice = input.nextInt();
            if(choice < 1 || choice > 2) System.out.println("Invalid choice. Try again.");
        }while(choice < 1 || choice > 2);
        if(choice == 1){
            if(shave){   
                score = Chapter4a(score); 
                return score;
            }
            else{
                score = Chapter4aa(score); 
                return score;
            }
        }
        else {
            if(shave){     
               
                score = Chapter4b(score);
                player.addWeapon(new Weapon("Iron sword of fire","A sword engulfed in hellish flames",25));
                player.Battle(new MuscularMan());
                if(player.getHealth()<=0) return score;
            }
            else{
                score = Chapter4bb(score);
            }
        }
        System.out.println("\n\tAt the other end of the portal, there is an enormous wheat field so big your eyes can’t see anything but wheat.");
        System.out.println("You walk silently for about 4 hours until you find a tree and decide to take a break there.");
        System.out.println("Your friend insists to sit under the tree cause the corn hounds would found you, but you want to climb it and see if there’s anything near you.");
        System.out.println("YOU: “Why are corn dogs in a wheat field ?”");
        System.out.println("YOUR FRIEND: They used to live in corn fields but many years ago a corn farmer s wife refused to marry the area tyrant so he burned all corn fields killed all corn farmers and put a curse on the ground to never grow corn...”");
        System.out.println("YOU: “So what happened to the wife ?”");
        System.out.println("YOUR FRIEND: “I never asked about that and no one mentions it...I guess the war against corn monopolozises the interest...”");
        do{
            System.out.println("1.Climb the tree.");
            System.out.println("2. Sit under and continue talking. ");
            choice = input.nextInt();
            if(choice < 1 || choice > 2) System.out.println("Invalid choice. Try again.");
        }while(choice < 1 || choice > 2);
        if(choice == 1){
            score = Chapter5a(score);
            if(player.getHealth()<=0) return score;
        }
        else{
            score = Chapter5b(score);
        }
        System.out.println("your side \n");
        System.out.println("You won the fight but you  can t  calm.. you feel a burn inside you.. suddenly you feel a lot stronger the swords colour has turned into the colour of the fire you stare your friend into his eyes and you see the reflection of self with sparks coming out of your eyes and a huge smile in your face even thougth you couldn’t feel happy .\n");
        System.out.println("-what s happening to me \n");
        System.out.println("-the warrior trapped inside you has come into the spotlight \n");
        System.out.println("-Oh I see ….  I must be the chosen one from an ancient  prophesy who came here to bring peace ?\n");
        System.out.println("-Prophets had  been wiped out  before they could  write one ..\n" );
        System.out.println("-Damn .. And now what \n");
        System.out.println("-Now we walk \n");
        System.out.println("You walked for two days str8 without any rest talking about what happened in your friends one year absence and slaying enormous corn dogs  . it was night of the third day when you reached your destination .. A weirdly peacefull village  surrounded by wheat of course by its ¾ . also there was a river next to the village and at the other side of the river wheat..\n");
        System.out.println("You take a good sleep and at the other day in the morning you see your best friend  sitting in the table with a man looking like a human but he had lizard skin and a tail . ");
 
        do{
            System.out.println("1 hey what s going on  here ");
            System.out.println("2 you know its gonna be a good day when u wake up and you see Godzilla sitting on your table  ");
            choice = input.nextInt();
            if(choice < 1 || choice > 2) System.out.println("Invalid choice. Try again.");
        }while(choice < 1 || choice > 2);
        if(choice == 1){
            score = Chapter6a(score);
        }
        else{
            score = Chapter6b(score);
            score = Sidequest(score);
        }       
        System.out.println("You get on a small wooden raft and you go down the river.");
        System.out.println("This town is very big and its at the at the border of the area you are living and it is considered as a trading spot.");
        System.out.println("Its gonna be filled with many ethinicities of this dimension so you must always be covering your face");
        System.out.println("You go to most bad famed inn of the city and your friend is telling you to wait him outside while he is going into to the inn");
        do{
            System.out.println("1.Stay outside ");
            System.out.println("2.Wait about a minute, then go inside the in.");
            choice = input.nextInt();
            if(choice < 1 || choice > 2) System.out.println("Invalid choice. Try again.");
        }while(choice < 1 || choice > 2);
        if(choice == 1){
            score = Chapter7a(score);
        }
        else{
            score = Chapter7b(score);
            if(player.getHealth()<=0) return score;
        }       
        if(love==true){
            System.out.println("After 3 days of hard training you wake up in the morning and you find your friend sitting in the kitchen");
            System.out.println("-Look who s back back again "); 
            System.out.println("-Tell me how exactly you want me to kill you\n");
            System.out.println("-Why you dint tell me about that girl \n");
            System.out.println("-I didn’t think that was necessary \n");
            System.out.println("-She is very dangerous fool … She has contacted some of the deadliest assasins in the area .. She wants someone dead and that someone is a very important person\n");
            System.out.println("-How do you know all these things \n");
            System.out.println("-I was wondering for 3 days in the streets and  asked the right people\n");
            System.out.println("-Its ok man I don’t think we will see her again any other quests for today" );
            System.out.println("KNOCK KNOCK KNOCK You open the door and there she was full in fear she hags you and slams the door behind her .You need to hide me PLS");
            System.out.println("How did you find us?");
            System.out.println("I followed this idiot asking about me all over the town …He had the same physique with so I guessed you must be connected somehow and followed him …You need to help asdsdad mens are after me …His son is mad in love with me and wants me as his wife ");
            System.out.println("And you don’t want to" );
            System.out.println("No of course I don’t want to! I was raised to hate on the tyrrants of this area!");
            System.out.println("Many years ago, a tyrant fell in love with one of my ancestors and after she refused to leave her husband for him they killed many people...");
            System.out.println("Thankfully my ancestor escaped to your dimension and  that s how my bloodline continued  \n");
            System.out.println("You smell fire coming from the outside and you ran  to see what's going on … the asdas man with his son are burning the village");
            do{
                System.out.println("1.Go on a rampage.");
                System.out.println("2.Protect the girl.");
                choice = input.nextInt();
                if(choice < 1 || choice > 2) System.out.println("Invalid choice. Try again.");
            }while(choice < 1 || choice > 2);
            if(choice == 1){
                score = village1(score);
            }
            else{
                score = village2(score);
            }           
        }
        else{
        System.out.println("3 days later you wake up in the morning and you see your friend in the couch sitting and talking to stamates");
        System.out.println("we have a big problem pal  ");
        System.out.println("what happened ");
        System.out.println("I found her bordeline dead in an alley and took her with me .. she told me her story the same target is hunting you  ");
        System.out.println("And now what man ?  ");
        System.out.println("Now we must hide her (You smell fire coming from outside).. They are here what do you want to do    ");
        do{
            System.out.println("1.Go on a rampage.");
            System.out.println("2.Protect the girl.");
            choice = input.nextInt();
            if(choice < 1 || choice > 2) System.out.println("Invalid choice. Try again.");
        }while(choice < 1 || choice > 2);
        if(choice == 1){
            score = village1(score);
        }
        else{
            score = village2(score);
        }   
    }
    if (possesed==false) ;{
        System.out.println("You found yourself and your friend in the hill next to stamatis castle.");
        System.out.println("What is your plan ,sneak your way in or go all in from the front door?");
        do{
            System.out.println("1.Sneak");
            System.out.println("2.Go all in");
            choice = input.nextInt();
            if(choice < 1 || choice > 2) System.out.println("Invalid choice. Try again.");
        }while(choice < 1 || choice > 2);
        if(choice == 1){
            score = EndingStealth(score);
        }
        else{
            score = EndingBerserk(score);
            if(player.getHealth()<=0) return score;
        }
    }
        System.out.println("--GAME OVER--");
        return score;
    }
    
    private static int Chapter1a(int score){
        System.out.println("You shave yourself and take a quick bath.");
        System.out.println("Afterwards,you decide to buy a cup coffee and some food from the shop in the corner and go to THAT PLACE .");
        System.out.println("Today is the one year anniversary of your best friend's dissapearnce");
        score+=5;
        
        return score;
    }
    
    private static int Chapter1b(int score){
        System.out.println("You can't find anything to eat but you make one cold cup coffee to wake you up for good.");
        System.out.println("You open your laptop but as soon you see the 300 unread messages in your group chat you spill your coffee to the floor and a bit on your computer .");
        System.out.println("You go out to the store at the corner to buy food.");
        score+=3;
        return score;
    }


    private static int Chapter2a(int score){
        score+=6;
        return score;
    }
     
    private static int Chapter2b(int score){
        score+=7;
        return score;
    }
    
    private static int Chapter3a(int score){
        score+=6;
        return score;
    }
     
    private static int Chapter3b(int score){
        score+=7;
        return score;
    }
    
    private static int Chapter4a(int score){
        System.out.println("Within a blink of an eye you faint from the alchohol.");
        System.out.println("You wake up in your bed again with a huge headache this time thinking how real this dream seemed...");
        System.out.println("You do your daily routine, go to the kitchen and see stains of coffee on the floor so");
        System.out.println("you run to the spot but it was too late you are spotted by some shady muscular men and you die at their hands ,not knowing why.");
        System.out.println("--GAME OVER--");
        score+=5;
        
        return score;
    }
    
    private static int Chapter4aa(int score){
        System.out.println("Within a blink of an eye you faint from the alchohol.");
        System.out.println("You wake up in your bed again with a huge headache this time thinking how real this dream seemed...");
        System.out.println("You do your daily routine, go to the kitchen and talk with your friends about how you beat up a weird guy with phone and when you go to brush your teeth at night you realize that you don’t have any beard ..");
        System.out.println("--GAME OVER--");
        score+=3;
        return score;
        
    }
       private static int Chapter4b(int score){
        System.out.println("You enter through the portal and find yourself in a new world. A muscular man is attacked by your friend and he drops his sword. You pick it up.");
        
        score+=5;
        
        return score;
    }
    
    private static int Chapter4bb(int score){
        System.out.println("or  You woke up in your bed again with a huge headache this time thinking how real this dream was.. .. then you do your daily routine go to the kδςitchen you talk with your friends about how you beat up an weird guy with phone and when you go to brush your teeth at night you realize that you don’t have any beard ..");
        score+=3;
        return score;
    }
 private static int Chapter5a(int score){
             
        System.out.println("You climb at the top of the tree and as it come to no surprise to you you can only see fields of wheat .. you find a branch to lean on and think of whats going on … After 30 minutes of starring your swords you hear some very loud barks coming to your way .. Its time for action you  climb down the tree take positions to fight with your best friend to your side ");
        for(int i=0; i<3; i++){
            player.Battle(new CornHound());
            if(player.getHealth()<=0) return score;
        }
        score+=5;
        
        return score;
    }
    
    private static int Chapter5b(int score){
        System.out.println("-So any other active wars on any plant or vegetable I need to know ?\n" +
"-You are so naïve this place is mostly like hell ..You could die at any moment \n" +
"-OH I see we have the scenery also the good and the ugly where is the bad though ?\n" +
"- if you continue to have that attitude you are gonna me regret saving your life.. Cause you will die soon !..WUF WUF WUF WUF WUF You hear loud barks coming to your way\n" +
"-I thought they wouldn’t find us if we had stayed under the tree\n" +
"- they are dogs they can also smell … I just wanted to clarify some things.. And talk with my buddy after a long time …w the barks stops and you see 2 very muscular and pretty tall dogs starring you … ");
        for(int i=0; i<3; i++){
            player.Battle(new CornHound());
            if(player.getHealth()<=0) return score;
        }
        score+=3;
        return score;
    }

private static int Chapter6a(int score){
             
        System.out.println("–Here is the one who took me here and trained me for one year!");
        System.out.println("His name is jeff,he is the protector of this village …");
        System.out.println("He told me that you can hide here until the storm calms down!");
        System.out.println("Also our village's wood was stolen by a city down by the river");
        System.out.println("If you hide your self and don’t talk much  we can do this, so suit up we have a job to do...");
        score+=5;
        
        return score;
    }
    
    private static int Chapter6b(int score){
        System.out.println("Jeff jumps from the table onto you,grabs both of your hands,");
        System.out.println("puts them behind your back puts his feet around your waist and grabs your neck with his hands");
        System.out.println("You are now dead I have killed you...");
        System.out.println("You own me your life from this point on!");
        System.out.println("Go out and run,don't stop until I say so");
        System.out.println("You turn your eyes  towards your friends but he is at the door leaving the house");
        System.out.println("-He has a job to do, can help him after we are done here");
        score+=3;
        return score;
}

private static int Chapter7a(int score){
    int choice;
    Scanner input = new Scanner(System.in);
    System.out.println("You sit in an alley next to the inn and you watch carefully all the weird creatures that are passing by … This was the first time you feel scared and lost in this new world ..Also you can feel the hidden mysteries that are to be found ..Your eye catches a girl and you cant let her of your sight  because she is the most weird of them all.. She is like you and your friend small compared to all the other human skin blonde hair and brown eyes … As she s getting away from you you feel an urge to follow her .. ");
    do{
        System.out.println("1.You follow her ");
        System.out.println("2. go inside the in. ");
        choice = input.nextInt();
        if(choice < 1 || choice > 2) System.out.println("Invalid choice. Try again.");
    }while(choice < 1 || choice > 2);
    if(choice == 1){
        score = Story1a(score);
    }
    else{
        score = Chapter7b(score);
        if(player.getHealth()<=0) return score;
    }
    score+=5;
    return score;
}
    
private static int Chapter7b(int score){
    Scanner input = new Scanner(System.in);
    int choice;
    score+=3;
    System.out.println("You go inside and you see a huge fight taking place inn");
    System.out.println("the in but your best friend is in a corner talking with a raccoon like creature ..");
    System.out.println("They laugh they shake hands and within a blink your friend cuts the raccoon s head of… ");
    System.out.println("TWO other raccoons approach you !!! ");
    for(int i=0; i<2; i++){
        player.Battle(new Racoon());
        if(player.getHealth()<=0) return score;
    }
    System.out.println("-The wood is either in a warehouse down the port or in the house about 20 minutes from here where do you wanna go ");
           do
    {
        System.out.println("1.go to the haunted house ");
        System.out.println("2.go to the warehouse ");
        choice = input.nextInt();
        if(choice < 1 || choice > 2) System.out.println("Invalid choice. Try again.");
    }while(choice < 1 || choice > 2);
    if(choice == 1){
        score = Haunted1(score);
    }
      else{
        score = Story1a(score);

    }
    return score;
}
    private static int Sidequest(int score){
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("You go outside and run like your life depends on it,until you finaly collapse..");
        System.out.println("The lizard man walks up to you and says in a cocky voice: ");
        System.out.println("-You were so full of yourself just because you beat up some dogs...you're NEVER gonna last at this rate!");
        System.out.println("-I realize that, im sorry...What can i do to improve?");
        System.out.println("-The people from your reality have better genes than ours..You can improve fives times faster so i wouldn't worry about your physical strength...");
        System.out.println("There is something to do however that will improve that naiveness of yours.");
        System.out.println("-What would that be? you said");
        System.out.println("-You have been rushing your decisions up until this point right?Think about what to say and to whom you are speaking to before you speak... it will have an impact on your adventure.");
        System.out.println("-That's it?? I expected something more...");
        System.out.println("-No that is your weakness at the moment...think things through and with a calm mind and you will succeed.");
        System.out.println("-Thank you.I'll go and meet my friend now...");
        System.out.println("-WAIT YOU FOOL !!!! I JUST SAID TO THINK THINGS THROUGH AND YOU ASUMED I HAD NOTHING MORE TO SAY!!");
        System.out.println("-But you said that was all...");
        System.out.println("-AND THAT WAS A TEST!!! NOW FIGHT ME AGAIN AND BEAT ME !!");
        System.out.println("You try to fight him but he takes you down with a swift move.");
        System.out.println("-You're still not thinking clearly...Get up and fight me again...");
        System.out.println("You get up angrily but he puts you down with ease yet again");
        System.out.println("The two times he whooped you around have taken their toll in you...you're all bloodied up and in so much pain...");
        do
        {
            System.out.println("Do you: ");
            System.out.println("1.Get up and fight him fairly again ");
            System.out.println("2.Try to sneak attack him while he waits for you to get up");
            System.out.println("3.Lie about giving up and attack him with a sneak attack.");
            System.out.println("4.Give up");
            choice = input.nextInt();
            if(choice < 1 || choice > 4) System.out.println("Invalid choice. Try again.");
        }while(choice < 1 || choice > 4);
        if(choice == 1){
            score = Sidequest1a(score);
        }
        else if(choice == 2){
            score = Sidequest1b(score);
        }
        else if(choice == 3){
            score = Sidequest1c(score);
        }
        else{
            score = Sidequest1d(score);
        
        }
        System.out.println("Your friend comes and picks you up ... He needs help ... You are going undercover in the city ");
        return score;
    }
    
     private static int Story1a (int score){
        score+=3;
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("2 You found yourself in a  warehouse down at the port ..Pretty weird there s no windows in the warehouse you sneak and you find a small hole and you slip into the warehouse .when you walk into theres a lot of loads next to you  ");
        do{
            System.out.println("1.go left ");
            System.out.println("2.go right ");
            choice = input.nextInt();
            if(choice < 1 || choice > 2) System.out.println("Invalid choice. Try again.");
        }while(choice < 1 || choice > 2);
        if(choice == 1){
            score = Story2a(score);
            if(player.getHealth()<=0) return score;
        }
        else{
            score = Story2a(score);
            if(player.getHealth()<=0) return score;
        }
        return score;
}

 private static int Story2a(int score){
    int choice;
    Scanner input = new Scanner(System.in);
    score+=3;
    System.out.println(" ,you find some stairs and you go up and find a good spot to see what s going on .. ");
    System.out.println("At the middle  there is a big pile of wood next to it it’s someone  talking with a  raccoon like creature  ");
    System.out.println("This must the be the pile of wood that was stolen from the village ... You missstep and the racoon sees you .. There s no way back its time to fight");
    player.Battle(new Racoon());
    if(player.getHealth()<=0) return score;
    System.out.println("You  turn and look at her …You cant talk…She s not that beautifull but you fell enchanted by her presence");
    System.out.println("-You need to take a bath");
    System.out.println("-I forgot my deodorize in my homedimension .. Do you know any supermarket near by") ;
    System.out.println("-You must be new here ");
    System.out.println("-Yes my physique can tell that");
    System.out.println("-Your attitude also change it ..Anyhow thank you you put me out of the trouble killing that idiot he was about to rob me");
    System.out.println("-ROB YOU ? I don’t think these woods belong to you … what s your name ?");
    System.out.println("-… Neither to you ..But you are gonna take them from me ");
    System.out.println("n- why??");
    System.out.println("-cause we will not talk again if you turn me in.{she blins at you smilling } .. Its up to you now I have some bissunes to do bye.");
    System.out.println ("You go out and you see your friend coming towards the warehouse … Its up to you now");
    do{
        System.out.println("1.Protect her");
        System.out.println("2.Turn her in");
        choice = input.nextInt();
        if(choice < 1 || choice > 2) System.out.println("Invalid choice. Try again.");
    }while(choice < 1 || choice > 2);
    if(choice == 1){
        score = Story3a(score);
    }
      else{
        score = Story3b(score);

    }
    return score;
}
 
private static int Story3a (int score){
    score+=3;
    System.out.println("You tell him that s the warehouse is empty …");
    System.out.println("You search at the harbor and you a small pile of wood… ");
    System.out.println("You steal it and and your friend decides to stay in the town and search a little more…");
    System.out.println("You will escort the shipment back to the village.. You will meet again in 3 days ");
    love=true;
    return score; 
}
  private static int Story3b (int score){
    score+=3;
    System.out.println("You go inside the warehouse secure the wood and you tell the whole story to your friend you deside to split .. ");
    System.out.println("You will escort the wood back to the village and he will find her and find out what  is going on ");
    System.out.println("You will meet again in 3 days ");
    return score;
}

private static int Haunted1 (int score){
    Scanner input = new Scanner(System.in);
    score+=3;
    int choice;
    System.out.println("You arrive at  a pretty spooky house ..");
    System.out.println("The rumor of this house is 	that it has never been seen by the sun …  You Search the house ..Pretty clean house for an abandoned house ..");
    System.out.println("after a while you end up in the cellar .");
    System.out.println(".You open the door and inside it it’s a two small axes … ");
    do{
        System.out.println("1.take the axes ");
        System.out.println("2.go to the port  ");
        choice = input.nextInt();
        if(choice < 1 || choice > 2) System.out.println("Invalid choice. Try again.");
    }while(choice < 1 || choice > 2);
    if(choice == 1){
        player.addWeapon(new Weapon("Twin Cursed Axes","Two pitch black axes, giving of an eerie aura",35));
        score = Haunted2(score);
    }
      else{
        score = Story1a(score);
    }
    return score;
}

private static int Haunted2 (int score){
    score+=3;
    possesed=true;
    System.out.println("You fall to the ground and you everything starts to spin around … ");
    System.out.println("you start to hear loud noises like a strong wind coming into the room … ");
    System.out.println("then you loose you sight and your hear someone talking to you …");
    System.out.println(" “better than I expected “ and fall down and loose your senses ..");
    System.out.println("You wake up infront of a warehouse at the city harbor");
    score += Story1a(score);
    return score;
}
private static int village1 (int score){
         score+=3;
         Scanner input = new Scanner(System.in);
       int choice;
System.out.println("You are going into fury slayghtering everyone in your way … The sand had turned red and after you found yourself again you are headed towards your house ..There tyou find your best friend over asdas  dead body …\n" +
"-They took her … So now what");
   do
        {
            System.out.println("1.Go rescue her");
            System.out.println("2.Stay");
            choice = input.nextInt();
            if(choice < 1 || choice > 2) System.out.println("Invalid choice. Try again.");
        }while(choice < 1 || choice > 2);
        if(choice == 1){
            score +=14;
        }
        else{
            score = end1(score);
        }       
        return score;


}

private static int Sidequest1a(int score){
    System.out.println("You lost again...");
    System.out.println("-You still havent learnt... this training ends now before i kill you.");
    score+=0;
    return score;
}

private static int Sidequest1b(int score){
    System.out.println("You lost again...");
    System.out.println("-That was better but it lacked something...good enough for now i guess.");
    score+=50;
    return score;
}

private static int Sidequest1c(int score){
    System.out.println("You barely manage to beat him!");
    System.out.println("-THAT'S IT! IN THIS WAR THE MEANS JUSTIFY THE ENDS...you finaly get it ");
    score+=100;
    return score;
}

private static int Sidequest1d(int score){
    System.out.println("-You give up? That is a huge dissapointment. I hope you dont get your friend killed...");
    score+=0;
    return score;
}

private static int end1 (int score){
         score+=3;
         System.out.println("You spend your days at the village rebuilding it and protecting for you rest of your lives without ");
         System.out.println("Hearing from any tyrant or the the girl again");
         return score;
}


private static int village2 (int score){
         score+=3;
         Scanner input = new Scanner(System.in);
       int choice;
System.out.println("YOU guard the girl but at some point some one knocks you down and you fall down ...When you open tyour eyes it was night and there was no village your best friend is over jeff s dead body ");
   do
        {
            System.out.println("1 go rescue her ");
            System.out.println("2 stay  ");
            choice = input.nextInt();
            if(choice < 1 || choice > 2) System.out.println("Invalid choice. Try again.");
        }while(choice < 1 || choice > 2);
        if(choice == 1){
            score +=42;
        }
        else{
            score = end1(score);
        
        }       
        return score;


}
private static int EndingBerserk (int score){
         int choice;
         Scanner input = new Scanner(System.in);
         System.out.println("You destroy the front door and see 3 muscular men blocking your way to the second floor");
        for(int i=0; i<3; i++){
            player.Battle(new MuscularMan());
            if(player.getHealth()<=0) return score;
        }
         System.out.println("You reach the second floor but the alarm has been raised! 5 muscular men stand against you yet again.");
         for(int i=0; i<5; i++){
            player.Battle(new MuscularMan());
            if(player.getHealth()<=0) return score;
        }
         System.out.println("You finally reach the third floor, your breath indicates you are exhausted.");
         System.out.println("3 men stand before you and the throne room.");
       for(int i=0; i<3; i++){
            player.Battle(new MuscularMan());
            if(player.getHealth()<=0) return score;
        }
         System.out.println("As you take the out the last one he tries a suicide attack against you...");
         System.out.println("Your friend gets in the way and loses his sword arm.");
         System.out.println("-NOOO");
         System.out.println("-It's ok,I will be fine … Continue without me");
         System.out.println("-Are you sure?");
         System.out.println("-Yes , please go and end this madness");
         System.out.println("You go in throne room where the evil tyrant and his son eagerly wait for you.");
         System.out.println("-You know that I cannot allow you to live any longer!");
         System.out.println("-You beat my son! How disrespectful!You are gonna pay for this insolence dearly boy");
         do
        {
            System.out.println("1.Say “I heard that the tyrants of this area are tough but the only thing I see is a soft man … Do you want to die with a smile on your face, prick? ”");
            System.out.println("2.Attack them.");
            choice = input.nextInt();
            if(choice < 1 || choice > 2) System.out.println("Invalid choice. Try again.");
        }while(choice < 1 || choice > 2);
         if(choice == 1){
            score = EndingBerserka(score);
            if(player.getHealth()<=0) return score;
        }
          else{
            score = EndingBerserkb(score);
            if(player.getHealth()<=0) return score;
         }
         
         return score;
     }
     
     private static int EndingBerserka(int score){
         System.out.println("The tyrant kills  his son and attacks you");
        
            player.Battle(new Boss());
            if(player.getHealth()<=0) return score;
        System.out.println("You Finally deafeted the evil of this area and the people can live for a little time in peace ");
          System.out.println("But now you go on a quest alone in order to end this world from the pressure of the tyrrants");
         score+=5;
         return score;
     } 
     
     private static int EndingBerserkb(int score){
         
            player.Battle(new Boss());
            if(player.getHealth()<=0) return score;
            player.Battle(new BossJr());
            if(player.getHealth()<=0) return score;
         System.out.println("You Finally deafeted the evil of this area and the people can live for a little time in peace ");
          System.out.println("But now you go on a quest alone in order to end this world from the pressure of the tyrrants");
         score+=10;
         return score;
     }

private static int EndingStealth (int score){
         int choice;
         Scanner input = new Scanner(System.in);
         System.out.println("You sneak your way around and you found a tunnel in which you go in.");
         System.out.println("You make your way to the first floor’s courtyard.");
         System.out.println("There are two guards sleeping  near a pillar to your right and another one  the left side in the room awake. ");
         System.out.println("You are in the left side of the room. Do you:");
         do
        {
            System.out.println("1.Distract the left guard with a noise and sneak past him");
            System.out.println("2.Throw a rock to the guards to the right to focus all of their attention to that spot");
            choice = input.nextInt();
            if(choice < 1 || choice > 2) System.out.println("Invalid choice. Try again.");
        }while(choice < 1 || choice > 2);
         if(choice == 1){
            score = EndingStealth1a(score);
        }
          else{
            score = EndingStealth1b(score);
        
        }
        
        System.out.println("You reach the second floor. There are no guards on this one,");
        System.out.println("however there is a door with an intricate mechanism attached and the room gets narrower as you proceed.");
        System.out.println("There is an inscription. Do you ");
         do
        {
            System.out.println("1.Read it out loud to your friend.");
            System.out.println("2.Try to budge the door open");
            choice = input.nextInt();
            if(choice < 1 || choice > 2) System.out.println("Invalid choice. Try again.");
        }while(choice < 1 || choice > 2);
         if(choice == 1){
            score = EndingStealth2(score);
        }
          else{
            System.out.println("Nothing happens so you read the description anyway");
            score = EndingStealth2(score);
         }
         
        System.out.println("THE WALLS START TO CLOSE SLOWLY AND THE DOOR BEHIND YOU SHUTS. ");
        System.out.println("YOU HAVE NO WAY OUT EXCEPT FORWARD.");
        System.out.println("-WHAT ARE WE GONNA DO? WHAT DO WE EVEN KNOW ABOUT HIM ?");
        System.out.println("-I DON’T KNOW, BRAINSTORM GOD DAMMIT ! YOU’RE THE ONE WHO HAS LIVED HERE A YEAR! ");
        System.out.println("-I don’t know … Evil? ");
        do
        {
            System.out.println("1.Shout “Evil”");
            System.out.println("2.Do nothing.");
            choice = input.nextInt();
            if(choice < 1 || choice > 2) System.out.println("Invalid choice. Try again.");
        }while(choice < 1 || choice > 2);
         if(choice == 1){
            score = EndingStealth3(score);
        }
          else{
            System.out.println("Nothing happens so you read the description anyway");
            score = EndingStealth3(score);
         }
        
        System.out.println("-COME ON IM NOT ABOUT TO DIE HERE !!  says your friend"); 
        System.out.println("-WHAT ABOUT THE CORN FAMILY? ");
        System.out.println("-YOU ARE A GENIUS . THEY ALL WISHED FOR THEIR DEATHS !!!");
        do
        {
            System.out.println("1.Shout “DEATH TO THE CORN FAMILY”");
            System.out.println("2.Do nothing.");
            choice = input.nextInt();
            if(choice < 1 || choice > 2) System.out.println("Invalid choice. Try again.");
        }while(choice < 1 || choice > 2);
         if(choice == 1){
            score = EndingStealth4a(score);
            if(player.getHealth()<=0) return score;
        }
          else{
            score = EndingStealth4b(score);
         }
        
         return score;
     }
     
     private static int EndingStealth1a (int score){
        System.out.println("You manage to sneak by undetected. You are in the second floor.");
        score+=10;
        return score;
     }
     
     private static int EndingStealth1b (int score){
        System.out.println("The rock flies in front of the guards but the one on the left notices where it came from.");
        score+=2;
        for(int i=0; i<3; i++){
        player.Battle(new Guard());
        if(player.getHealth()<=0) return score;
        }
        return score;   
     }
     
     private static int EndingStealth2 (int score){
        System.out.println("The descripton says “ If crushed to death you wish not to be , shout the nature of our kings decree ! “ ");
        score+=4;
        return score;   
     }
     
     private static int EndingStealth3 (int score){
        System.out.println("Either way THE WALLS START CLOSING ON YOU MORE QUICKLY .");
        System.out.println("A VOICE ECHOES “THE NEXT MISTAKE SHALL BE YOUR LAST , NAÏVE ONE”");
        score+=4;
        return score;   
     }
     
     private static int EndingStealth4a (int score){
        System.out.println("The walls slow down and end their attempt at taking your life just before they succeed. ");
        System.out.println("The door opens and you go up the third floor ");
        System.out.println("You pass through the dim corridors in a quick stride and slam the door to the throne room open! ");
        System.out.println("The king yells “ YOU HAVE FINALLY COME TO TASTE DEFEAT AT OUR HANDS”"); 
        System.out.println("He and his son unsheathe their weapons with a daunting poise");
        player.Battle(new Boss());
        if(player.getHealth()<=0) return score;
        player.Battle(new BossJr());
        if(player.getHealth()<=0) return score;
         System.out.println("You Finally deafeted the evil of this area and the people can live for a little time in peace ");
          System.out.println("But now you go on a quest alone in order to end this world from the pressure of the tyrrants");
        score+=50;
        return score;
     }
     
     private static int EndingStealth4b (int score){
        System.out.println("You are crushed  to death swifly ,your feeble attempt at overtaking the king ending in vain");
        System.out.println("–-GAME OVER--");
        score+=0;
        return score;   
     }












}