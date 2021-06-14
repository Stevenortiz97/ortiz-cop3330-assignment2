package Assignment2.ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex28Test {

    @Test

    void main() {

        int num1 = 2;
        int num2 = 4;
        int num3 = 6;
        int num4 = 8;
        int num5 = 10;

        int result = num1 +num2 +num3 +num4 +num5;

        assertEquals(30,result);
    }
}

