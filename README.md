# Test Plan

## 1. Project Specifications

**Project Name:** Selenium – Java Web Test Automation Portfolio

**Project Description:**

This project consists of a web test automation portfolio developed using Java and Selenium WebDriver, showcasing software testing practices and automation skills.

**Project Objective:**

To demonstrate the ability to plan, design, develop, and execute automated web tests, applying industry best practices throughout the testing lifecycle.

**Application Under Test (AUT):**

[The Internet](https://the-internet.herokuapp.com/), a web application that provides multiple features and scenarios for practicing and demonstrating web test automation.

## 2. Test Scope

### 2.1 In Scope

The following web application functionalities will be covered by the automation testing project:

- Login (valid and invalid credentials).
- Form Authentication.
- Checkboxes.
- Dropdown.
- Dynamic Controls.
- Dynamic Loading.
- JavaScript Alerts.
- File Upload.
- File Download.
- Add/Remove Elements.
- Frames and Nested Frames.
- Hovers.
- Multiple Windows.
- Tables.

### 2.2 Out of Scope

The following activities are not included in the scope of this project:

- Performance testing.
- Security and penetration testing.
- Mobile application testing.
- Cross-browser testing beyond the browsers explicitly selected for the project.
- Backend and database testing.
- Unit and component testing.

## 3. Test Strategy

### 3.1 Testing Approach

The project will focus on web application testing, validating functionalities through user interactions with the web interface.

The testing approach will include:

- End-to-End (E2E) testing: validating complete user workflows through the web interface.
- Positive testing: validating functionalities with valid inputs and expected conditions.
- Negative testing: validating application behavior with invalid inputs and unexpected conditions.
- Functional testing: verifying whether each feature behaves according to its expected functionality.
- Regression testing: ensuring that existing automated tests continue to pass after changes to the test framework or scripts.

### 3.2 Test Design Techniques

The following test design techniques will be applied where appropriate:

- Equivalence Partitioning.
- Boundary Value Analysis.
- Decision Table Testing.
- State Transition Testing.
- Exploratory Testing.

### 3.3 Test Automation Strategy

Automated web tests will be developed using Java and Selenium WebDriver, following maintainable coding practices and a structured framework architecture.

The automation strategy will include:

- Page Object Model (POM) design pattern.
- Reusable methods and components.
- Explicit waits for synchronization.
- Assertions to validate expected results.
- Separation of test logic and page interactions.
- Automated test execution and reporting.

### 3.4 Test Execution

- Automated web tests will be executed locally and through GitHub Actions.
- The CI/CD pipeline will be triggered manually.
- Test execution results will be documented.
- Failures will be analyzed and reported.
- Regression tests will be executed to validate existing functionalities.
- Test reports and execution evidence will be generated and made available as workflow artifacts.

## 4. Test Environment

### 4.1 Execution Environments

The automated tests will be executed in the following environments:

**Local Environment:**
- Operating System: Windows 11.
- Execution: Local machine.
- Browser: Google Chrome.

**CI/CD Environment:**
- Platform: GitHub Actions.
- Execution Environment: GitHub-hosted runner.
- Operating System: Ubuntu (Linux).
- Browser: Google Chrome.
- Browser Execution Mode: Headless.
- Execution Trigger: Manual workflow dispatch.

### 4.2 Software and Tools

| Tool / Technology | Purpose |
|---|---|
| Java | Programming language |
| Selenium WebDriver | Web browser automation |
| Maven | Dependency and project management |
| TestNG / JUnit | Test execution framework |
| Google Chrome | Web browser |
| Selenium Manager | Browser driver management |
| IntelliJ IDEA | Development environment |
| Git | Version control |
| GitHub | Source code repository |
| GitHub Actions | CI/CD pipeline execution |

### 4.3 Environment Configuration

- Java Development Kit (JDK) version: 17.
- Selenium WebDriver version: Defined in pom.xml.
- Maven version: Defined by the pipeline configuration.
- Test framework version: Defined in pom.xml.
- Chrome version: Compatible with the execution environment.
- Browser configuration: Headless mode in GitHub Actions.
- Dependencies: Managed through Maven.

### 4.4 Application Environment

- Application: The Internet.
- URL: https://the-internet.herokuapp.com/
- Environment: Public web environment.
- Access: Publicly accessible application.

### 4.5 CI/CD Pipeline Configuration

GitHub Actions will be used to automate the execution of the test suite through a manually triggered workflow.

The pipeline will be responsible for:

1. Checking out the source code from the GitHub repository.
2. Setting up the Java 17 environment.
3. Installing project dependencies using Maven.
4. Configuring Google Chrome for headless execution.
5. Executing the automated test suite using Maven.
6. Publishing test execution results.
7. Uploading test reports and execution evidence as workflow artifacts.
