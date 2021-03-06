/** Exercise 1 of WS2
 *
 * Program to compute whether the results in the software workshop module are
 * sufficient to pass.
 *
 * Parameters are (weighting x%)
 *  - continousAssessment1 = ca1  (0.125)
 *  - continousAssessment2 = ca2  (0.075)
 *  - exam                 = ex   (0.7)
 *  - teamWork             = tw   (0.1)
 *
 * MSc students must reach a mark of at least 50 overall
 * ICY students must reach a mark of at least 40 overall
 *  - triggered via studentCategory = sc
 *
 * Each of the parameters are expected to be in a range of 0-100
 * 
 * @author  Lennart Wissel
 * @version 08.10.2014
 *
 */

public class Ex1 {

  /** Tests whether someone passes the test
  * @param ca1 contiAssessment1
  * @param ca2 contiAssess2,
  * @param ex Exam performance,
  * @param tw Teamwork
  * @param sc Student type
  * @return true or false depending on whether the test is passed
  */
  public static boolean hasPassed(double ca1, double ca2, double ex, double tw, String sc){
    double mark = 0.125*ca1 + 0.075*ca2 + 0.7*ex + 0.1*tw; // mark <= 100

    if (sc.equalsIgnoreCase("ICY")){
      return (mark >= 40);
    }
    else if (sc.equalsIgnoreCase("MSc")) {
      return (mark >= 50);
    }
    else {
      return false; // you will never pass the class when you are not MSc/ICY
    }
  }
    
  public static void main(String[] args) {
    String sc1 = "MSc";
    String sc2 = "ICY";
    double ca1 = 40.;
    double ca2 = 40.;
    double ex = 50.;
    double tw = 40.;

    System.out.println(hasPassed(ca1,ca2,ex,tw,sc1)); // not passed
    System.out.println(hasPassed(ca1,ca2,ex,tw,sc2)); // passed
  }
}
