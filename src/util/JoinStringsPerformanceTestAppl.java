package util;

import util.performance.JoinStringsPerformance;

public class JoinStringsPerformanceTestAppl {
    public static void main(String[] args) {
        int runsAmount = 10000;
        String[] str = {"Hello", "World"};

        JoinStringsPerformance concatenationTest = new JoinStringsPerformance("Concatenation", runsAmount, str, new JoinStringsImplString());

        JoinStringsPerformance builderTest = new JoinStringsPerformance("Builder", runsAmount, str, new JoinStringsImplBuilder());

        concatenationTest.run();
        builderTest.run();
    }
}
