package util;

import util.performance.JoinStringsPerformance;

public class JoinStringsPerformanceTestAppl {
    public static void main(String[] args) {
        int runsAmount = 10000;
        int nStrings = 1000;

        JoinStringsPerformance stringTest = new JoinStringsPerformance("String Test", runsAmount, nStrings, new JoinStringsImplString());
        JoinStringsPerformance builderTest = new JoinStringsPerformance("Builder Test", runsAmount, nStrings, new JoinStringsImplBuilder());

        stringTest.run();
        builderTest.run();
        int e = new int[4][8].length;
        System.out.println(e);
    }
}
