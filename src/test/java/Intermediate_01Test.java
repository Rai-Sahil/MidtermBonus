import org.example.Intermediate_01;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Intermediate_01Test {
    Intermediate_01 i;

    @BeforeEach
    void setup(){
        i = new Intermediate_01();
    }

    @Test
    void leftCheck(){
        i.move("LEFT", 10);

        assertEquals(0, i.x);
    }

    @Test
    void rightCheck(){
        i.move("RIGHT", 10);

        assertEquals(10, i.x);
    }

    @Test
    void upCheck(){
        i.move("UP", 10);

        assertEquals(10, i.y);
    }

    @Test
    void downCheck(){
        i.move("DOWN", 10);

        assertEquals(0, i.y);
    }
}