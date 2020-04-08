package util.performance;

public abstract class PerformanceTests {
    private String testName;
    private Integer nRuns;

    public PerformanceTests(String testName, Integer nRuns) {
        this.testName = testName;
        this.nRuns = nRuns;
    }

    protected abstract void runTest();

    public void run() {
        double startTime = System.currentTimeMillis();

        for (int i = 0; i < nRuns; i++) {
            runTest();
        }

        double endTime = System.currentTimeMillis();

        System.out.format(
                "Test %s [total runs: %d] performed in %f milliseconds",
                testName,
                nRuns,
                endTime - startTime
        );
        System.out.println();
    }
}
