import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    public void fiftyNineShouldReturnF (){

        Grader grader = new Grader();
        assertTrue(grader.determineLetterGrade(59) == 'F');
    }


    @Test
    public void sixtyNineShouldReturnD (){

        Grader grader = new Grader();
        assertTrue(grader.determineLetterGrade(69) == 'D');
    }

    @Test
    public void seventyNineShouldReturnC (){

        Grader grader = new Grader();
        assertTrue(grader.determineLetterGrade(79) == 'C');
    }

    @Test
    public void eightyNineShouldReturnB (){

        Grader grader = new Grader();
        assertTrue(grader.determineLetterGrade(89) == 'B');
    }

    @Test
    public void nintyNineShouldReturnA (){

        Grader grader = new Grader();
        assertTrue(grader.determineLetterGrade(99) == 'A');
    }

    @Test
    public void zeroShouldReturnF (){

        Grader grader = new Grader();
        assertTrue(grader.determineLetterGrade(0) == 'F');
    }

    @Test
    public void negativeOneShouldReturnIllegalArgumentException (){

        Grader grader = new Grader();
        assertThrows(IllegalArgumentException.class,
                ()-> {
                    grader.determineLetterGrade(-1);
                });

    }

}