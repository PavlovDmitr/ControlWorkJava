package game;

import toys.*;
import java.util.*;


public class Game {
    public static ArrayList<BaseToy> gameToyList = new ArrayList<>();
    public static Queue<BaseToy> giftToys = new Queue<BaseToy>(){};

    public static void startGame(int countToys) {
        for (int i = 0; i < countToys; i++) {
            gameToyList.add(createBaseToy(i))
        }
        
    }

    private static BaseToy createBaseToy(int index) {
        switch (new Random().nextInt(1,6)) {
            case 1:
                return(new Banny(index));
                break;
            case 2:
                return(new Bear(index));
                break;
            case 3:
                return(new Wolf(index));
                break;
            case 4:
                return(new Tiger(index));
                break;
            case 5:
                return(new Fox(index));
                break;
            
        }
        
    }

    public static void addToy(BaseToy: toy) {
        this.giftToys.offer(toy);

    }

    public static BaseToy dropToy() {
        return giftToys.poll()
        
    }
}
