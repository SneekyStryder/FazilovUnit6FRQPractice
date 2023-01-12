import java.util.Arrays;

public class SoundRunner {
    public static void main(String[] args)
    {
        // ---------------- TEST CODE -----------------
        // The code below contains 5 different tests; if
        // your code is entirely correct, you should see
        // TESTS PASSED: 5 out of 5
        // TESTS FAILED: 0 out of 5
        // --------------------------------------------
        int passed = 0;
        int failed = 0;

        System.out.println("**************************");
        System.out.println("** TEST limitAmplitude: **");
        System.out.println("**************************");

        int[] mySamples = {40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223};
        Sound sound = new Sound(mySamples);

        int testAmp1 = sound.limitAmplitude(2000);
        int[] testSamples1 = sound.getSamples();

        System.out.println("limitAmplitude(2000) should return 5 and returned " + testAmp1);
        if (testAmp1 == 5)
        {
            System.out.println("-- PASSED TEST 1! --");
            passed++;
        }
        else
        {
            System.out.println("-- FAILED TEST 1 --");
            failed++;
        }
        System.out.println("------------------------");
        System.out.println("  The original array is: " + Arrays.toString(testSamples1));
        int[] expected = {40, 2000, 17, -2000, -17, -2000, 2000, 1048, -420, 33, 15, -32, 2000, 2000};
        System.out.println("Changed array should be: " + Arrays.toString(expected));
        if (Arrays.equals(testSamples1, expected))
        {
            System.out.println("-- PASSED TEST 2! --");
            passed++;
        }
        else
        {
            System.out.println("-- FAILED TEST 2 --");
            failed++;
        }
        System.out.println("------------------------");
        int testAmp2 = sound.limitAmplitude(75);
        int[] testSamples2 = sound.getSamples();

        System.out.println("limitAmplitude(75) should return 8 and returned " + testAmp2);
        if (testAmp2 == 8)
        {
            System.out.println("-- PASSED TEST 3! --");
            passed++;
        }
        else
        {
            System.out.println("-- FAILED TEST 3 --");
            failed++;
        }
        System.out.println("------------------------");
        System.out.println("  The original array is: " + Arrays.toString(testSamples2));
        int[] expected2 = {40, 75, 17, -75, -17, -75, 75, 75, -75, 33, 15, -32, 75, 75};
        System.out.println("Changed array should be: " + Arrays.toString(expected2));

        if (Arrays.equals(testSamples2, expected2))
        {
            System.out.println("-- PASSED TEST 4! --");
            passed++;
        }
        else
        {
            System.out.println("-- FAILED TEST 4 --");
            failed++;
        }
        System.out.println("************************************");
        System.out.println("** TEST trimSilenceFromBeginning: **");
        System.out.println("************************************");

        int[] mySamples2 = {0, 0, 0, 0, -14, 0, -35, -39, 0, -7, 16, 32, 37, 29, 0, 0};
        Sound sound2 = new Sound(mySamples2);
        int[] testSamples3 = sound2.getSamples();
        System.out.println("  The original array is: " + Arrays.toString(testSamples3));

        sound2.trimSilenceFromBeginning();
        int[] expected3 = {-14, 0, -35, -39, 0, -7, 16, 32, 37, 29, 0, 0};
        System.out.println("Changed array should be: " + Arrays.toString(expected3));
        System.out.println("       Changed array is: " + Arrays.toString(sound2.getSamples()));
        System.out.println("**************************");
        if (Arrays.equals(sound2.getSamples(), expected3))
        {
            System.out.println("-- PASSED TEST 5! --");
            passed++;
        }
        else
        {
            System.out.println("-- FAILED TEST 5 --");
            failed++;
        }
        System.out.println("TESTS PASSED: " + passed + " out of 5");
        System.out.println("TESTS FAILED: " + failed + " out of 5");
    }
}

