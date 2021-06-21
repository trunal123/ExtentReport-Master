package testscript;

import java.lang.ref.Reference;

public class Test {
    public static void main(String args[]) {

        int i = 0;
        int[] test = new int[10];
        /*test[0] = 10;
        test[1] = 20;
        test[2] = 30;
        test[3] = 40;
        test[4] = 45;*/

        calculateAndPopulate(test);
        display(test);
        //pass by Reference Pass by Value //


    }


    static void display(int[] test) {

        //prints array length
        for ( int i = 0; i < test.length; i++)
            System.out.println(test[i]);

    }

    static void calculateAndPopulate(int[] test) {

        for ( int i = 0; i < test.length; i++) {

            if (i % 2 == 0) {

                test[i] = i;

            }
            else
            {
                test[i] = 2 * i;

            }
        }

    }

}
