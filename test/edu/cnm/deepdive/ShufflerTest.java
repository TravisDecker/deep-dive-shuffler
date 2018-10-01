package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class ShufflerTest {

  @Test
  void shuffleByte() {
    byte[] source = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5,};
    byte[] dest = Arrays.copyOf(source, source.length);
    Shuffler.shuffle(dest);
    assertFalse(Arrays.equals(source, dest));
    Arrays.sort(source);
    Arrays.sort(dest);
    assertArrayEquals(source, dest);
  }

  @Test
  void shuffleInt() {
    int[] source = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5,};
    int[] dest = Arrays.copyOf(source, source.length);
    Shuffler.shuffle(dest);
    assertFalse(Arrays.equals(source, dest));
    Arrays.sort(source);
    Arrays.sort(dest);
    assertArrayEquals(source, dest);
  }

  @Test
  void shuffleDouble() {
    double[] source = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5,};
    double[] dest = Arrays.copyOf(source, source.length);
    Shuffler.shuffle(dest);
    assertFalse(Arrays.equals(source, dest));
    Arrays.sort(source);
    Arrays.sort(dest);
    assertArrayEquals(source, dest);
  }

  @Test
  void shuffleFloat() {
  }

  @Test
  void shuffleChar() {
    char[] source = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    char[] dest = Arrays.copyOf(source, source.length);
    Shuffler.shuffle(dest);
    assertFalse(Arrays.equals(source, dest));
    Arrays.sort(source);
    Arrays.sort(dest);
    assertArrayEquals(source, dest);

  }

  @Test
  void shuffleLong() {
    long[] source = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5,};
    long[] dest = Arrays.copyOf(source, source.length);
    Shuffler.shuffle(dest);
    assertFalse(Arrays.equals(source, dest));
    Arrays.sort(source);
    Arrays.sort(dest);
    assertArrayEquals(source, dest);
  }

  @Test
  void shuffleShort() {
    short[] source = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5,};
    short[] dest = Arrays.copyOf(source, source.length);
    Shuffler.shuffle(dest);
    assertFalse(Arrays.equals(source, dest));
    Arrays.sort(source);
    Arrays.sort(dest);
    assertArrayEquals(source, dest);
  }

  @Test
  void shuffleT() {
    Integer[] source = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5,};
    Integer[] dest = Arrays.copyOf(source, source.length);
    Shuffler.shuffle(dest);
    assertFalse(Arrays.equals(source, dest));
    Arrays.sort(source);
    Arrays.sort(dest);
    assertArrayEquals(source, dest);
  }
}