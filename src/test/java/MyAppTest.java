import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyAppTest {
MyApp app = new MyApp();
    @Test
    public void addMe() {
        assertEquals(5, app.addMe(2,3) );

    }

    @Test
    public void subMe() {
        assertEquals(2, app.subMe(5,3));
    }

    @Test
  public void mulMe() {
        assertEquals(6, app.mulMe(2,3));
    }

    @Test
    public void divMe() {
        assertEquals(2, app.divMe(6,3));
    }
}