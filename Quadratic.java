import java.util.Scanner;

public class Main {
  public static int solveQuadratic(double eqn[], double[] roots) {
    double a = eqn[0];
    double b = eqn[1];
    double c = eqn[2];

    double delta = Math.pow(b, 2) - 4 * a * c;
    if (delta < 0)
      return 0;
    else if (delta == 0) {
      roots[0] = -b / (2 * a);
      roots[1] = -b / (2 * a);
      return 1;
    } else {
      roots[0] = (-b + Math.sqrt(delta)) / (2 * a);
      roots[1] = (-b - Math.sqrt(delta)) / (2 * a);
      return 2;
    }

  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a, b, c");
    double[] eqn = new double[3];

    for (int i = 0; i < eqn.length; i++) {
      eqn[i] = input.nextDouble();
    }
    double[] roots = new double[2];

    int numberOfRoots = solveQuadratic(eqn, roots);

    if (numberOfRoots == 0) {
      System.out.println("Equation has no roots");
    } else if (numberOfRoots == 1) {
      System.out.println("Equation has double roots");
    } else {
      System.out.println("Equation has single roots");
    }
  }
}
