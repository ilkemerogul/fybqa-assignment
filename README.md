# fybqa-assignment
This repository includes assignment results.

**Note 1:** After cloning the code, open the project with IntelliJ Idea. Click on **"Terminal"**;

Type **"mvn clean install -Dbrowser=firefox"** and press **"Enter"** to run the tests on Firefox browser,

Type **"mvn clean install -Dbrowser=chrome"** and press **"Enter"** to run the tests on Chrome browser.

**Note 2:** In order to view intentional fail case as well, navigate to;

"md5.feature" and delete the **"@ignore"** tag from the second scenario. Afterwards, run the tests on desired browser as described above.

**Note 3:** Please see the test automation results from; 

"target->cucumber-html-reports->cucumber-html-reports->overview-features.html" right click and click on **"Open in Browser"**. Select the default browser to view the results.

**Environment Info:**
- Mac OS Sierra - 10.12.1
- IntelliJ Idea 15.0.3
- Java 1.8
- Apache Maven 3.3.9
- Selenium Standalone Server 3.4.0
- Cucumber JVM 1.2.5
- Firefox 53.0.3 (64-bit)
- Chrome  58.0.3029.110 (64-bit)
