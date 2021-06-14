package Assignment2.ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex31Test {

    @Test
    void main() {

        int num1 = 30;
        int num2 = 80;
        double num3 = .95;

        double result;

        result = (int) ((((220 - num1)-num2)*num3)+num2);

        assertEquals(184,result,0.001);
    }

    }
