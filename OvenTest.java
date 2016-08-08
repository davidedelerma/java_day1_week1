import static org.junit.Assert.assertEquals;
import org.junit.*;

public class OvenTest{
  Cake cake;
  Oven oven;

  @Before
  public void before(){
    cake = new Cake();
    oven = new Oven("AEG");
  }

  @Test
  public void ovenHasABrand(){
    assertEquals("AEG",oven.getBrand());
  }

  @Test 
  public void stuffsStartsEmpty(){
    assertEquals(0, oven.stuffCount());
  }

  @Test
  public void ovenCanBakeCake(){
    oven.bake(cake);
    assertEquals(1, oven.stuffCount());
  }

  @Test
  public void theOvenIsNotFull(){
    for (int i=0; i < 10; i++){
      oven.bake(cake);
    }
    assertEquals(true, oven.ovenFull());
  }

  @Test
  public void cannotAddCakesWhenOvenIsFull(){
    for (int i = 0; i<20; i++){
      oven.bake(cake);
    }
    assertEquals(10, oven.stuffCount());
  }

  @Test
  public void shouldEmptyOvenAfterCooked(){
    oven.bake(cake);
    assertEquals(1,oven.stuffCount());
    oven.takeOut();
    assertEquals(0,oven.stuffCount());
  }

}






