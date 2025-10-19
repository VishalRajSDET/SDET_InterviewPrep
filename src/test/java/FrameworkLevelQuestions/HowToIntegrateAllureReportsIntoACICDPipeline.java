package FrameworkLevelQuestions;

public class HowToIntegrateAllureReportsIntoACICDPipeline {
    /**
     * Interview Question:
     *
     * “Can you explain how to integrate Allure Reports into a CI/CD pipeline like Jenkins or GitHub Actions?”
     *
     * (Sometimes phrased as: “How do you publish Allure reports automatically after test execution in CI/CD?”)
     */

    /**
     * Real-time Explanation in Interview
     *
     * “In my current project, we use Jenkins for CI/CD.
     * I integrated Allure reporting by adding the Allure Jenkins plugin and configuring it in the pipeline.
     * After test execution, Allure results are generated inside the target/allure-results folder.
     * Then, using a pipeline step, we generate and publish the Allure HTML report automatically.
     * Jenkins shows an ‘Allure Report’ link on each build, which provides detailed execution results, screenshots, and historical trends.
     *
     * We also preserve the Allure history folder between builds to maintain trends over time, so stakeholders can easily track test stability.”
     */
}
