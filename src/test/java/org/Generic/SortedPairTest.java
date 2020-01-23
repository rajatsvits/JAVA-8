package org.Generic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class SortedPairTest {

  @Test
  public void shouldRetainOrderOfOrderedPair(){
    SortedPair<Integer> pair = new SortedPair<>(1,2);
    assertEquals(1,pair.getFirst().intValue());
    assertEquals(2,pair.getSecond().intValue());
  }

  @Test
  public void shouldFlipOrderOfMisOrderedPair(){
    SortedPair<Integer> pair = new SortedPair<>(2,1);
    assertEquals(1,pair.getFirst().intValue());
    assertEquals(2,pair.getSecond().intValue());
  }
}
