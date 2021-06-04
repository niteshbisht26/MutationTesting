public class Calculator {
    public Calculator() {
    }

    public int add(int a, int b) {
        return a+b;
    }

    public int subtract(int a, int b) {
        return a-b;
    }


    public boolean isPositive(int a) {
        return a >= 0;
    }
//
    // Mutant 1: Changed conditional boundary
//    public boolean isPositive(int a) {
//        return a > 0;
//    }

    // Mutant 2: negated conditional
//    public boolean isPositive(int a) {
//        return !(a >= 0);
//    }

    // Mutant 3: Changed return boolean value to true
//    public boolean isPositive(int a) {
//        return true;
//    }
}
