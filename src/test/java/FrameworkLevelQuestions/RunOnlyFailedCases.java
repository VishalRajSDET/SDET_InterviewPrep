package FrameworkLevelQuestions;

public class RunOnlyFailedCases {
    /**
     * 🧠 Question:
     *
     * Interview Question:
     *
     * “Suppose you have a regression suite with 1000 tests, and in your last Jenkins build 20 of them failed.
     * How would you re-run only those failed tests instead of executing the entire suite again?
     * Can TestNG XML help you in this scenario? Explain with a real-time example.”
     *
     * “If only 20 out of 1000 tests failed in the last run, is using Cucumber rerun.txt or TestNG-failed.xml the only option?
     * Or can TestNG XML also help re-run only failed tests?
     */

    /**
     * ✅ Short Answer:
     * 👉 You can absolutely use TestNG XML to re-run only failed tests — in fact, that’s the simplest and most common approach in a Java + Selenium + TestNG framework.
     * But to make it clear:
     * Cucumber rerun.txt = for Cucumber-based frameworks
     * testng-failed.xml = for pure TestNG (or TestNG + Allure) frameworks
     * So yes, TestNG XML helps you re-run only failed tests — and it integrates cleanly with CI/CD and Allure reporting.
     */

    /**
     * Final Interview-style Summary Answer
     *
     * In my automation framework, we handle failed test reruns efficiently using TestNG’s in-built mechanism.
     * After the main regression suite runs in Jenkins, TestNG automatically generates test-output/testng-failed.xml, which lists only the failed test methods.
     * In the next stage of the CI/CD pipeline, I rerun that XML file to execute only failed tests instead of the entire suite.
     * Once rerun completes, I merge the new results into the same allure-results folder and regenerate the Allure report, which updates the test trend and pass rate automatically.
     * This approach saves execution time, reduces CI cost, and keeps Allure history clean and accurate.
     */

    /**
     * ⚙️ Detailed Explanation
     *
     * When TestNG runs your test suite, it automatically creates a file-->  test-output/testng-failed.xml
     * That XML file contains only those test methods that failed in your last run.
     * You can directly use that file in your CI/CD pipeline to rerun just the failed ones.
     */


    /**
     * ✅ Stage 1 → Runs all tests
     * ✅ Stage 2 → Automatically reruns failed ones
     * ✅ Stage 3 → Generates and publishes Allure report
     */

    /**
     * pipeline {
     *     agent any
     *
     *     stages {
     *         stage('Run Full Regression') {
     *             steps {
     *                 sh 'mvn clean test -DsuiteXmlFile=testng.xml'
     *             }
     *         }
     *
     *         stage('Re-run Failed Tests') {
     *             steps {
     *                 script {
     *                     if (fileExists('test-output/testng-failed.xml')) {
     *                         sh 'mvn test -DsuiteXmlFile=test-output/testng-failed.xml'
     *                     }
     *                 }
     *             }
     *         }
     *
     *         stage('Allure Report') {
     *             steps {
     *                 sh 'allure generate allure-results --clean -o allure-report'
     *                 allure([
     *                     includeProperties: false,
     *                     jdk: '',
     *                     results: [[path: 'allure-results']]
     *                 ])
     *             }
     *         }
     *     }
     * }
     */
}
