                        SauceDemo Automation Framework

This project is an example of an automated testing framework using Selenium WebDriver, Cucumber, and Java. It tests the functionalities of the SauceDemo web application.


                        Project Overview

The framework is designed to perform end-to-end testing of the SauceDemo website. It includes test scenarios written in Gherkin language using Cucumber, and the tests are executed on both Chrome and Firefox browsers based on configuration settings.


		        Features

Login Test: Validates successful login and navigation to the products page.
Cart Operations: Adds the most expensive two products to the cart and verifies the cart contents.
Checkout Process: Simulates the checkout flow by filling out forms and verifying the order overview.
Parallel Execution: Tests are designed to execute in parallel on multiple browsers.
Data-Driven Testing: Utilizes test data from external files to run tests with different data sets.

			Technologies Used

Java: Core programming language.
Selenium WebDriver: Automation tool for web applications.
Cucumber: BDD framework for test scenarios.
TestNG: Test execution and reporting.
Maven: Build automation and dependency management.
Page Object Model (POM): Design pattern for better test maintenance.


	               Test Data

The test data is stored in excel file (readData.xlsx) located in src/test/java/testdata/ directory.

			Reporting
Test execution results are generated using TestNG and Allure. You can view the HTML reports in the allure-result directory after running the tests.


			Contributing

Contributions are welcome! If you find any issues or want to add new features, please submit a pull request or open an issue on GitHub.





