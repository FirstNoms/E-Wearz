package Cloths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WearsTest {
    Wears wears;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    wears = new Wears();
    }

    @Test
    public void testThatClothHasAPrice(){
        wears.setPrice(5000.0);
        assertEquals(5000.0, wears.getPrice());
    }

    @Test
    public void testThatClothHasASize(){
        wears.setSize(10);
        assertEquals(10, wears.getSize());
    }

    @Test
    public void testThatClothHasACategory(){
        wears.setCategory(Category.CasualWear);
        assertEquals(Category.CasualWear, wears.getCategory());
    }

    @Test
    public void testThatClothHasAGender(){
        wears.setGender(Gender.Male);
        assertEquals(Gender.Male,wears.getGender());
    }

    @Test
    public void testThatClothHasAType(){
        wears.setType(Type.FullFit);
        assertEquals(Type.FullFit, wears.getType());
    }
}