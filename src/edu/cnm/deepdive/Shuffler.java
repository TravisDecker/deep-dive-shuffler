package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Shuffler {

  public static void main(String[] args) {

    int[] deck = new int[52];

    for (int i = 0; i < deck.length; i++) {
      deck[i] = i + 1;
    }
    System.out.println(Arrays.toString(deck));
    shuffleIterate(deck);
    System.out.println(Arrays.toString(deck));

  }

  public static void shuffleIterate(int[] deck) {
    shuffle(deck, new Random());
  }


  private static void shuffle(Integer[] deck) {
    Random rng = new Random();
    Integer[] newDeck = new Integer[52];
    ArrayList<Integer> deckList =
        new ArrayList<>(Arrays.asList(deck));
    for (int i = 0; i < deck.length; i++) {
      newDeck[i] = deckList.remove(rng.nextInt(deckList.size()));
    }
    System.arraycopy(newDeck, 0, deck, 0, deck.length);
  }

  public static void shuffle(int[] deck, Random rng) {

    for (int i = deck.length - 1; i > 0; i--) {
      int swap = rng.nextInt(i + 1);
      int temp = deck[swap];
      deck[swap] = deck[i];
      deck[i] = temp;

    }
  }

  public static void shuffle(byte[] deck, Random rng) {

    for (int i = deck.length - 1; i > 0; i--) {
      int swap = rng.nextInt(i + 1);
      byte temp = deck[swap];
      deck[swap] = deck[i];
      deck[i] = temp;

    }
  }
  public static void shuffleIterate(byte[] deck) {
    shuffle(deck, new Random());
  }



  public static void shuffle(long[] deck, Random rng) {

    for (int i = deck.length - 1; i > 0; i--) {
      int swap = rng.nextInt(i + 1);
      long temp = deck[swap];
      deck[swap] = deck[i];
      deck[i] = temp;

    }
  }

  public static void shuffleIterate(long[] deck) {
    shuffle(deck, new Random());
  }

  public static void shuffle(char[] deck, Random rng) {

    for (int i = deck.length - 1; i > 0; i--) {
      int swap = rng.nextInt(i + 1);
      char temp = deck[swap];
      deck[swap] = deck[i];
      deck[i] = temp;

    }
  }
  public static void shuffleIterate(char[] deck) {
    shuffle(deck, new Random());
  }

  public static void shuffle(short[] deck, Random rng) {

    for (int i = deck.length - 1; i > 0; i--) {
      int swap = rng.nextInt(i + 1);
      short temp = deck[swap];
      deck[swap] = deck[i];
      deck[i] = temp;

    }
  }
  public static void shuffleIterate(short[] deck) {
    shuffle(deck, new Random());
  }

  public static void shuffle(double[] deck, Random rng) {

    for (int i = deck.length - 1; i > 0; i--) {
      int swap = rng.nextInt(i + 1);
      double temp = deck[swap];
      deck[swap] = deck[i];
      deck[i] = temp;

    }
  }
  public static void shuffleIterate(double[] deck) {
    shuffle(deck, new Random());
  }

  public static void shuffle(float[] deck, Random rng) {

    for (int i = deck.length - 1; i > 0; i--) {
      int swap = rng.nextInt(i + 1);
      float temp = deck[swap];
      deck[swap] = deck[i];
      deck[i] = temp;

    }
  }
  public static void shuffleIterate(float[] deck) {
    shuffle(deck, new Random());
  }

}

