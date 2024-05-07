{\rtf1\ansi\ansicpg1252\deff0\nouicompat\deflang1033{\fonttbl{\f0\fnil\fcharset0 Calibri;}{\f1\fnil\fcharset1 Segoe UI Symbol;}}
{\colortbl ;\red0\green0\blue255;}
{\*\generator Riched20 10.0.22000}\viewkind4\uc1 
\pard\sa200\sl276\slmult1\qc\ul\b\f0\fs36\lang9 SauceDemo Automation Framework\par

\pard\sa200\sl276\slmult1\ulnone\b0\fs22\par
This project is an example of an automated testing framework using Selenium WebDriver, Cucumber, and Java. It tests the functionalities of the SauceDemo web application.\par
\par
\tab\fs28 Project Overview:\fs22\par
\tab\tab\tab\tab The framework is designed to perform end-to-end testing of the \tab\tab\tab\tab\tab SauceDemo website. It includes test scenarios written in Gherkin \tab\tab\tab\tab\tab language using Cucumber, and the tests are executed on both \tab\tab\tab\tab\tab Chrome and Firefox browsers based on configuration settings.\par
\par
\tab  \fs28 Features:\fs22\par
\tab\tab\tab Login Test: Validates successful login and navigation to the products page.\par
\tab\tab\tab Cart Operations: Adds the most expensive two products to the cart and \tab\tab\tab\tab verifies the cart contents.\par
\tab\tab\tab Checkout Process: Simulates the checkout flow by filling out forms and \tab\tab\tab\tab verifying the order overview.\par
\tab\tab\tab Parallel Execution: Tests are designed to execute in parallel on multiple \tab\tab\tab\tab browsers.\par
\tab\tab\tab Data-Driven Testing: Utilizes test data from external files to run tests with \tab\tab\tab different data sets.\par
\par
\tab\fs28 Technologies Used:\fs22\par
\tab\tab\tab\tab Java: Core programming language.\par
\tab\tab\tab\tab Selenium WebDriver: Automation tool for web applications.\par
\tab\tab\tab\tab Cucumber: BDD framework for test scenarios.\par
\tab\tab\tab\tab TestNG: Test execution and reporting.\par
\tab\tab\tab\tab Maven: Build automation and dependency management.\par
\tab\tab\tab\tab Page Object Model (POM): Design pattern for better test \tab\tab\tab\tab\tab\tab maintenance.\par
\par
\par
\tab\fs28 Test Data:\fs22\par
\tab\tab\tab The test data is stored in excel file (readData.xlsx) located in \tab\tab\tab\tab\tab src/test/java/testdata/ directory.\par
\par
\fs28\tab Reporting:\fs22\par
\tab\tab\tab Test execution results are generated using TestNG and Allure. You can \tab\tab\tab\tab view the HTML reports in the allure-result directory after running the \tab\tab\tab\tab tests.\par
\par
\par
\fs28\tab Contributing:\fs22\par
\tab\tab\tab Contributions are welcome! If you find any issues or want to add new \tab\tab\tab\tab features,please submit a pull request or open an issue on GitHub.\par
\par
\tab\fs28 Project Structure:\line\par
\fs22 src\par
\f1\u9500?\u9472?\u9472?\f0  main\par
\f1\u9474?\f0  \f1\u9492?\u9472?\u9472?\f0  java\par
\f1\u9474?\f0  \f1\u9500?\u9472?\u9472?\f0  com\par
\f1\u9474?\f0  \f1\u9474?\f0  \f1\u9492?\u9472?\u9472?\f0  Saucedemo\par
\f1\u9474?\f0  \f1\u9474?\f0  \f1\u9500?\u9472?\u9472?\f0  base\par
\f1\u9474?\f0  \f1\u9474?\f0  \f1\u9474?\f0  \f1\u9500?\u9472?\u9472?\f0  BaseTest.java\par
\f1\u9474?\f0  \f1\u9474?\f0  \f1\u9474?\f0  \f1\u9492?\u9472?\u9472?\f0  BasePage.java\par
\f1\u9474?\f0  \f1\u9474?\f0  \f1\u9500?\u9472?\u9472?\f0  Pages\par
\f1\u9474?\f0  \f1\u9474?\f0  \f1\u9474?\f0  \f1\u9500?\u9472?\u9472?\f0  Login.java\par
\f1\u9474?\f0  \f1\u9474?\f0  \f1\u9474?\f0  \f1\u9500?\u9472?\u9472?\f0  Products.java\par
\f1\u9474?\f0  \f1\u9474?\f0  \f1\u9474?\f0  \f1\u9500?\u9472?\u9472?\f0  Cart.java\par
\f1\u9474?\f0  \f1\u9474?\f0  \f1\u9474?\f0  \f1\u9492?\u9472?\u9472?\f0  Checkout.java\par
\f1\u9474?\f0  \f1\u9474?\f0  \f1\u9500?\u9472?\u9472?\f0  Config\par
\f1\u9474?\f0  \f1\u9474?\f0  \f1\u9474?\f0  \f1\u9492?\u9472?\u9472?\f0  production.properties\par
\f1\u9474?\f0  \f1\u9474?\f0  \f1\u9500?\u9472?\u9472?\f0  dataDriven\par
\f1\u9474?\f0  \f1\u9474?\f0  \f1\u9500?\u9472?\u9472?\f0  factory\par
\f1\u9474?\f0  \f1\u9474?\f0  \f1\u9500?\u9472?\u9472?\f0  utils\par
\f1\u9474?\f0  \f1\u9474?\f0  \f1\u9492?\u9472?\u9472?\f0  stepDefinitions\par
\f1\u9474?\f0  \f1\u9474?\f0  \f1\u9492?\u9472?\u9472?\f0  StepDefinitions.java\par
\f1\u9492?\u9472?\u9472?\f0  test\par
\f1\u9500?\u9472?\u9472?\f0  java\par
\f1\u9474?\f0  \f1\u9492?\u9472?\u9472?\f0  com\par
\f1\u9474?\f0  \f1\u9492?\u9472?\u9472?\f0  Saucedemo\par
\f1\u9474?\f0  \f1\u9500?\u9472?\u9472?\f0  Pages\par
\f1\u9474?\f0  \f1\u9474?\f0  \f1\u9492?\u9472?\u9472?\f0  Overview.java\par
\f1\u9474?\f0  \f1\u9500?\u9472?\u9472?\f0  Config\par
\f1\u9474?\f0  \f1\u9474?\f0  \f1\u9492?\u9472?\u9472?\f0  production.properties\par
\f1\u9474?\f0  \f1\u9500?\u9472?\u9472?\f0  dataDriven\par
\f1\u9474?\f0  \f1\u9500?\u9472?\u9472?\f0  factory\par
\f1\u9474?\f0  \f1\u9500?\u9472?\u9472?\f0  utils\par
\f1\u9474?\f0  \f1\u9492?\u9472?\u9472?\f0  stepDefinitions\par
\f1\u9474?\f0  \f1\u9492?\u9472?\u9472?\f0  StepDefinitions.java\par
\f1\u9492?\u9472?\u9472?\f0  resources\par
\f1\u9500?\u9472?\u9472?\f0  allure\par
\f1\u9492?\u9472?\u9472?\f0  features\par
\par
Github Link: {{\field{\*\fldinst{HYPERLINK https://github.com/AhmedElsayed810 }}{\fldrslt{https://github.com/AhmedElsayed810\ul0\cf0}}}}\f0\fs22\par
\par
\par
\par
\par
\par
}
 