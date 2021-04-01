package com.example.magic8ball;

import java.util.Random;

public class Magic8Ball {

    public static void main(String[] args) {
        Magic8Ball myMagic8 = new Magic8Ball();
        Random randMagic8 = new Random();
            int randNum = 1 + randMagic8.nextInt(20);
            System.out.println(randNum);
            switch (randNum) {
                case 1:
                    System.out.println("ASK AGAIN LATER.");
                    break;
                case 2:
                    System.out.println("BETTER NOT TELL YOU NOW.");
                    break;
                case 3:
                    System.out.println("CANNOT PREDICT NOW.");
                    break;
                case 4:
                    System.out.println("CONCENTRATE AND ASK AGAIN.");
                    break;
                case 5:
                    System.out.println("DON'T COUNT ON IT.");
                    break;
                case 6:
                    System.out.println("IT IS CERTAIN.");
                    break;
                case 7:
                    System.out.println("IT IS DECIDEDLY SO.");
                    break;
                case 8:
                    System.out.println("MOST LIKELY.");
                    break;
                case 9:
                    System.out.println("MY SOURCES SAY NO.");
                    break;
                case 10:
                    System.out.println("MY REPLY IS NO.");
                    break;
                case 11:
                    System.out.println("OUTLOOK NOT SO GOOD.");
                    break;
                case 12:
                    System.out.println("OUTLOOK GOOD.");
                    break;
                case 13:
                    System.out.println("REPLY HAZY TRY AGAIN.");
                    break;
                case 14:
                    System.out.println("SIGNS POINT TO YES.");
                    break;
                case 15:
                    System.out.println("VERY DOUBTFUL.");
                    break;
                case 16:
                    System.out.println("WITHOUT A DOUBT.");
                    break;
                case 17:
                    System.out.println("YES.");
                    break;
                case 18:
                    System.out.println("YES DEFINITELY.");
                    break;
                case 19:
                    System.out.println("YOU MAY RELY ON IT.");
                    break;
                case 20:
                    System.out.println("AS I SEE IT YES.");
                    break;
        }
    }
}
