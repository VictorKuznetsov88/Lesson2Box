package fruitBox

class BoxTest extends GroovyTestCase {
    void testGetWeight() {
        Box<Orange> or = new Box<>();
        Box<Apple> ap = new Box<>();
        or.addFruit(new Orange(),10);
        ap.addFruit(new Apple(),8);

        assertEquals(15, or.getWeight());
        assertEquals(8, ap.getWeight());
    }

    void testCompare() {
        Box<Orange> or = new Box<>();
        Box<Apple> ap = new Box<>();
        or.addFruit(new Orange(),1);
        ap.addFruit(new Apple(),1);

        assertEquals(true,or.compare(or));
        assertEquals(false,or.compare(ap));
        assertEquals(true,ap.compare(ap));
        assertEquals(false,ap.compare(or));

   }

    void testPourFruit(){
        Box<Orange> or = new Box<>();
        Box<Apple> ap = new Box<>();
        or.addFruit(new Orange(),1);
        ap.addFruit(new Apple(),1);

        assertEquals(null,ap.pourFruit(or));
        assertEquals(null,or.pourFruit(ap));


   }

}
