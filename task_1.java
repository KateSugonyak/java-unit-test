@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	assertEquals("Ожидается что 19 больше, чем 18",true,isAdult);// Напиши код здесь
                 }
