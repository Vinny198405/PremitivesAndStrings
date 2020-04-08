package util;

import util.performance.JoinStringsPerformance;

public class JoinStringsPerformanceTestAppl {
    public static void main(String[] args) {
        Integer runsAmount = 100000;
        String[] str = {"Hello", "World"};

        JoinStringsPerformance stringTest = new JoinStringsPerformance("String Test", runsAmount, str, new JoinStringsImplString());
        JoinStringsPerformance builderTest = new JoinStringsPerformance("Builder Test", runsAmount, str, new JoinStringsImplBuilder());

        stringTest.run();
        builderTest.run();
    }
}
