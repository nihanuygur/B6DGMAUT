
Batch6 Automation Project
# B6DGMAUT dgMarkt Automation Project  - BDD Framework With Cucumber - By 

### Codes and Tests Prepared By:

euroTech Study SDET Course Batch6 Students

This Sprint's name is Fox which will be automation. Our PO Ali İhsan Deveci, SM Seda Ozleblebici and Team Lead Nihan Tasci Uygur. 
We will use Java Programming Language, IntelliJ as IDE, Maven as build management tool, Jira as Project Management Tool, 
Git as Version Control System and GitHub as Remote Repository. We will test 20 USs in this Sprint, our team lead will build our 
framework which will be Cucumber, JUnit, Maven, BDD, DDF, Page Object Model Design Pattern. 
First, we will test every function manually, then If there is a bug in a test case, we will create a Bug Report and will NOT write 
any test code for unfixed bugs. But if there is NO bug we will write our automation code.

### Getting Started
To get started with this framework, you will need to have the following software on your system.

• Java 8 or later\
• Maven 3 or later\
• Chrome or Firefox Web Browser

1. Open the terminal or command prompt and navigate to the root directory of the project.\
2. Run the following command to download the required dependencies:\

mvn clean install\
3. Run the following command to run the tests:

mvn verify\
4. Open the project with IntelliJ IDEA\
-- Go to Cukes Runner inside the project\
-- Click the Run button

### This framework is Cucumber (BDD)
•  We built our framework using Java Programming Language.\
•  We used Maven as a build automation tool for our Java project.\
•  We used Cucumber-Junit and Cucumber Runner to orchestrate tests.\
•  Inside the Cucumber runner, We used glues to connect feature files to step definitions.\
•  We added the report plugin to Cucumber Runner to generate JSON and HTML reports.\
•  We have a utilities package, which contains utility classes such as Configuration Reader.\
•  We are using Page Object Modelling to enhance test maintenance and reduce code duplication. This is one of the most famous Selenium approaches.\
•  We use Page Object Classes to store and identify the elements that We work on.\
•  We use the PageFactory class and initElements method to initialize them.\
•  We are using Cucumber and Gherkin language for non-technical people to understand what is going on in testing.\
•  To interact with browsers, We are utilizing Selenium WebDriver.\
•  We used the Singleton pattern by declaring the constructor of the class as private so that no one instantiates the class outside of it. And declared a static method with return type as the object of the class which should check if the class is already instantiated once.\
•  We used a Cucumber Scenario outline and example feature.\
•  We have created my test cases in the feature files as-is.\
•  In the Feature folder, We store our feature files separately, and it helps in the usability of the codes.\
•  We use hook class as pre-and post-test implementations.\
•  Step Definitions folder is the place where my actual test scripts are.\
•  We added a screenshot interface; when the scenario fails, it takes a screenshot.\
•  For assertions/verifications, to compare expected and actual results We utilize Junit assertions.\
•  We also use tags for tests that We want to run in bulk.\
•  Our framework is easy to maintain since We have elements stored in one centralized place. If any changes happen in the application about the elements, WE know where to go and how to fix it to run test scripts correctly.

