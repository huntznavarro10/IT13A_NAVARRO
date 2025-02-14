
package Prelim;

public class lab_act1_Arithmetics {

    public static void main(String[] args) {

        int dog1 = 10;
        int cat2 = 6;
        int tiger3 = 4;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
        int lion4 = 3;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           

        int net1 = dog1 * tiger3 + cat2;
        int backup1 = dog1 - tiger3;
        int net2 = backup1 % cat2;
        int backup2 = dog1 + tiger3 + cat2;
        int net3 = backup2 / lion4;
int backup3 = tiger3 * tiger3;
        int net4 = dog1 * cat2 - backup3;

        System.out.println(" 10 * 4 + 6 = " + net1);
        System.out.println("(10-4) % 6 = " + net2);
        System.out.println("(10 + 4 + 6)/3 = " + net3);
        System.out.println("10 * 6 -(4 * 4 ) = " + net4);

    }
}