package de.GolderosDR;

import jdk.jfr.Name;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToolsTest {
    @Nested
    @DisplayName("Тесты для метода firstToUpperCase")
    class ForFirstToUpperCaseTests {
        @Test
        void apple_to_Apple_firstToUpperCase() {
            assertEquals("Apple", StringTools.firstToUpperCase("apple"));
        }

        @Test
        void Apple_to_Apple_firstToUpperCase() {
            assertEquals("Apple", StringTools.firstToUpperCase("Apple"));
        }

        @Test
        void space_apple_to_space_apple_firstToUpperCase() {
            assertEquals(" apple", StringTools.firstToUpperCase(" apple"));
        }

        @Test
        void NW_apple_to_NW_apple_firstToUpperCase() {
            assertEquals("/apple", StringTools.firstToUpperCase("/apple"));
        }


    }

    @Nested
    @Name("Тесты для метода isStartingFromCapital")
    class ForIsStartingFromCapitalTests {
        @Test
        void true_Apple_isStartingFromCapital() {
            assertTrue(StringTools.isStartingFromCapital("Apple"));
        }
        @Test
        void false_apple_isStartingFromCapital() {
            assertFalse(StringTools.isStartingFromCapital("apple"));
        }
        @Test
        void false_space_Apple_isStartingFromCapital() {
            assertFalse(StringTools.isStartingFromCapital(" Apple"));
        }
        @Test
        void false_NW_Apple_isStartingFromCapital() {
            assertFalse(StringTools.isStartingFromCapital("/Apple"));
        }

    }
}