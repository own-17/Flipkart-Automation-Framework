# Flipkart Automation Framework

Starter framework using Java 17, Maven, Playwright for Java, TestNG and Page Object Model.

## Open in IntelliJ IDEA
1. Extract the ZIP file.
2. IntelliJ IDEA → Open → select the extracted `FlipkartAutomationFramework` folder.
3. Allow IntelliJ to import the Maven project and download dependencies.
4. Install Playwright browsers from the IntelliJ Terminal:
   `mvn exec:java -Dexec.mainClass=com.microsoft.playwright.CLI -Dexec.args="install chromium"`
   If the command is not available, use the Playwright CLI setup instructions for Java.
5. Run the suite with: `mvn test`

## Notes
- This is a learning starter scaffold, not a guarantee that every live Flipkart locator will remain stable.
- Flipkart may display login prompts, regional content, bot checks or change its UI. Update locators after inspecting the current page.
- Do not automate OTP/CAPTCHA bypasses, real payments, or unauthorized purchases. Use safe test flows.
- Browser launches in headed mode so you can watch the test.
