# Evaly App End-to-End Automation

This project automates the testing of the Evaly Android application using Appium. The framework is built using Java, TestNG, Maven, and integrates with Allure for reporting. It provides a robust, scalable solution for functional testing.

---

## Features

- **Automated Test Cases**: Covers critical features of the Evaly app.
- **Framework**: Built with **Appium** for Android automation.
- **Reporting**: Integrated with **Allure** for detailed and visual test reports.
- **Maven Support**: Dependency management and build configuration.
- **TestNG**: Test suite management and parallel execution support.

---

## Prerequisites

Before starting, ensure the following are installed on your system:

1. **Java Development Kit (JDK)** - Version 8 or later.
2. **Apache Maven** - Version 3.6 or later.
3. **Appium** - Latest version.
4. **Android SDK** - Ensure the required platform tools and emulator are installed.
5. **Allure Command-line Tool** - For generating reports.

---

## Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/Evaly-App-Automation.git
   cd Evaly-App-Automation
'''
## 2. Install Dependencies: 
- Run the following Maven command to download and install required dependencies:
   ```bash
  mvn clean install
'''
## 3. Configure the Project:
- Update testng.xml for your testing preferences.
- Ensure your device/emulator is connected and Appium server is running.

# How to Execute Tests
### Start Appium Server: Launch the Appium server:
```bash
Appium
```
## Run Test Suite
### Execute the test cases using Maven:
```bash
mvn test
```
$#Generate Allure Report
After tests execution, generate the Allure report:
```bash
allure serve allure-results

```
# Project Structure
```bash
Evaly-App-Automation/
├── src/                     # Source code and test scripts
├── allure-results/          # Raw results for Allure reporting
├── allure-report/           # Final Allure report (auto-generated)
├── pom.xml                  # Maven configuration file
├── testng.xml               # TestNG configuration file
├── target/                  # Compiled code and test output

```
# Reporting
This project uses Allure to generate rich test reports. After executing the tests, you can view the report by running:
```bash
allure serve allure-results

```
# Tools and Technologies
- Java: Programming language for the framework.
- Appium: For mobile app automation.
- Maven: Build tool for dependency and lifecycle management.
- TestNG: Test suite management.
- Allure: Test reporting framework.

  ## _Screenshots_
![image](https://github.com/user-attachments/assets/38fccfcd-19e9-4309-a21c-dd0e757ad04c)
![image](https://github.com/user-attachments/assets/4cfa4faa-555a-4117-8461-d60c2c0825c0)
![image](https://github.com/user-attachments/assets/3660d143-820d-4112-81f4-302bf64ba322)
![image](https://github.com/user-attachments/assets/ce9d6f94-4a14-40b0-a23b-eb353eb77688)


## Authors

- [@abutalha](https://github.com/md-abutalha)


## 🔗 Links
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/md-abutalha)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/abu-talha1/)
[![twitter](https://img.shields.io/badge/twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://x.com/abu_talha0x)







