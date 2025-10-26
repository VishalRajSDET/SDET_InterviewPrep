package FrameworkLevelQuestions.FlakyOrFlapperTest;

public class FlakyOrFlapperTests {

    /**
     * “Flaky tests can occur at any layer, but they’re most common in UI automation due to timing and dynamic elements.
     * API tests may be flaky due to network or service issues.
     * Integration tests fail randomly if shared DB state or transactions interfere.
     * Even unit tests can be flaky if they use static variables, random numbers, or time-dependent logic.
     * As an SDET, I stabilize tests by using waits, mocks, transaction rollbacks, isolated test data, and retry mechanisms.”
     */


    /**
     * Flaky Tests – Quick Lines by Layer
     * 1️⃣ UI / E2E
     *
     * Most common layer for flaky tests.
     * Fail due to timing, dynamic elements, popups, animations, or CI/browser differences.
     * Example: Selenium “Add to Cart” test sometimes fails because success message appears slowly.
     * Fix: Use explicit waits, stable locators, handle popups, isolate tests, retry if needed.
     *
     * 2️⃣ API / Service
     *
     * Fail due to network latency, dependent service downtime, data conflicts, or environment issues.
     * Example: POST /checkout sometimes returns 504 Gateway Timeout.
     * Fix: Add retry logic, mock external services, use unique test data, increase timeout.
     *
     * 3️⃣ Integration / Database
     *
     * Fail due to shared database state, transaction issues, parallel test conflicts, or timing between services.
     * Example: User creation test fails because another test modified the same DB record.
     * Fix: Rollback transactions after each test, use isolated test data, in-memory DB, parallel-safe design.
     *
     * 4️⃣ Unit / Logic
     *
     * Rare, but can fail due to static/global variables, random number generation, or time-dependent logic.
     * Example: Order ID generator test fails because static counter wasn’t reset.
     * Fix: Reset static variables, use mocks for random/time-based behavior, keep tests isolated.
     *
     * One-line Interview Explanation
     *
     * “Flaky tests are tests that pass or fail randomly. They’re most common in UI due to timing/dynamic elements,
     * happen in API due to network/service issues, in integration tests due to shared DB or transaction conflicts,
     * and rarely in unit tests due to static/global or time-based logic. I fix them using waits, stable locators, mocks,
     * transaction rollbacks, unique test data, and retry mechanisms.”
     */
}
