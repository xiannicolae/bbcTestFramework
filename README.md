# bbcTestFramework

This demo framework was created to proof my Java and Selenium skills.

The framework is:
- following the Page Object Model (POM)
- using singleton design pattern for the Driver
- using BDD technique
- Cucumber tool used for Features 

Languages used:
- Java
- Gherkin

In order to run it, the following JUnit configs are required:
Class: cucumber_test_runner.TestRunner
VM options: -Dbrowser="chrome" -Dcucumber.options=""

To re-run the failed scnearios, a new JUnit config is required:
Class: cucumber_test_runner.FailedScenariosRunner
VM options: -Dbrowser="chrome" -Dcucumber.options=""
