package FrameworkLevelQuestions;

public class DifferenceBetweenLoggersReportsAndAllureReports {

    /**
     * “What is the difference between Loggers, Reports, and Allure Reports?
     * Can you explain with a real-time example?”
     */

    /**
     * Basic Understanding
     * Term	  Purpose	                                                  Used For
     * Logger	Captures runtime information, mainly for debugging	      Developer/Test Engineer
     * Report	Summarizes test execution results (pass/fail, duration)	   Test Lead/Manager
     * Allure Report	Advanced visual reporting tool with interactive dashboard, screenshots, logs, steps, trends	QA, Management, DevOps, SDET
     */

    /**
     * “In our automation framework, we use Log4j2 for logging, Allure Reports for visual reporting, and Jenkins to publish them.
     *
     * For example, during login tests, Log4j captures all debug and error information in a .log file — which helps developers trace the issue.
     * Meanwhile, Allure automatically attaches the same logs and screenshots to the HTML report —
     * giving the QA team and managers a visual view of what went wrong.
     *
     * So, if a test fails in Jenkins, I can open the Allure Report, view the step-by-step execution, see the attached screenshot,
     * and check the console log directly — without checking raw logs manually.”
     */
}
