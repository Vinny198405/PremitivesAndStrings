package util.performance;

public class JoinStringsPerformance extends PerformanceTests {
    private String[] strings;
    private JoinStringsInterface joinStrings;

    public JoinStringsPerformance(String testName, Integer nRuns, String[] strings, JoinStringsInterface joinStrings) {
        super(testName, nRuns);
        this.strings = strings;
        this.joinStrings = joinStrings;
    }

    @Override
    protected void runTest() {
        joinStrings.join(strings, " ");
    }
}
