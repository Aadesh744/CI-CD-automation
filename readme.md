# Integrating DevSecOps into CI/CD Pipelines for Enhanced Security
This is a **DevSecOps project** that demonstrates how to integrate **SonarQube**, **Trivy**, and **OWASP Dependency-Check** into a GitHub Actions pipeline. The project includes a simple Java application, a Dockerfile, and a GitHub Actions workflow that scans the code and dependencies for vulnerabilities and code quality issues.

---

## Features

- **SonarQube**: Static code analysis for code quality and security vulnerabilities.
- **Trivy**: Vulnerability scanning for Docker images.
- **OWASP Dependency-Check**: Identifies vulnerable dependencies in the project.
- **GitHub Actions**: Automated CI/CD pipeline with artifact uploads for reports.

---

## Project Structure
<pre>
devsecops-java-project/
│
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── example/
│                   └── App.java
├── test/
│   └── java/
│       └── com/
│           └── example/
│               └── AppTest.java
├── .github/
│   └── workflows/
│       └── devsecops-pipeline.yml
├── pom.xml
├── Dockerfile
└── README.md
</pre>

---

## Tools Used

1. **SonarQube**:
   - Scans the code for quality issues, bugs, and vulnerabilities.
   - Provides a detailed report in the SonarQube dashboard.

2. **Trivy**:
   - Scans the Docker image for vulnerabilities.
   - Generates a report in the console and saves it as an artifact.

3. **OWASP Dependency-Check**:
   - Scans the project dependencies for known vulnerabilities.
   - Generates an HTML report uploaded as an artifact.

---

## How to Run

### Prerequisites

- **GitHub Account**: To host the repository and run GitHub Actions.
- **SonarQube Server**: To analyze the code. You can use the [SonarQube Community Edition](https://www.sonarqube.org/).
- **Docker**: To build and scan the Docker image.

### Steps

1. **Fork/Clone the Repository**:
   - Fork or clone this repository to your GitHub account.

2. **Set Up Secrets**:
   - Add the following secrets in your GitHub repository settings:
     - `SONAR_HOST_URL`: URL of your SonarQube server.
     - `SONAR_TOKEN`: Token for accessing SonarQube.

3. **Push Changes**:
   - Push changes to the `main` branch to trigger the GitHub Actions workflow.

4. **View Reports**:
   - Go to the **Actions** tab in your GitHub repository.
   - Click on the workflow run to view the logs and download the artifacts.

---

## GitHub Actions Workflow

The workflow is defined in `.github/workflows/devsecops-pipeline.yml`. It performs the following steps:

1. **Checkout Code**: Fetches the code from the repository.
2. **Set Up JDK**: Configures the Java environment.
3. **Build with Maven**: Compiles the Java application.
4. **Run OWASP Dependency-Check**: Scans the project dependencies for vulnerabilities.
5. **Run SonarQube Scan**: Analyzes the code for quality and security issues.
6. **Build Docker Image**: Builds the Docker image for the application.
7. **Install Trivy**: Installs Trivy for Docker image scanning.
8. **Scan Docker Image with Trivy**: Scans the Docker image for vulnerabilities.
9. **Upload Reports**: Uploads the OWASP Dependency-Check and Trivy reports as artifacts.

---

## Example Reports

### **OWASP Dependency-Check Report**
- Identifies vulnerable dependencies (e.g., `commons-collections-3.2.1`).
- Provides details about the vulnerability (e.g., CVE-2015-7501).

### **SonarQube Report**
- Highlights code quality issues (e.g., code smells, bugs).
- Provides security vulnerabilities (e.g., SQL injection, XSS).

### **Trivy Report**
- Lists vulnerabilities in the Docker image (e.g., `CVE-2023-1234` in `libssl1.1`).

---

## Artifacts

The following artifacts are uploaded after the workflow runs:
- **OWASP Dependency-Check Report**: `dependency-check-report.html`
- **Trivy Report**: `trivy-image-report.txt`

You can download these artifacts from the **Actions** tab in your GitHub repository.

---

## Extending the Project

- Add more tools like **Snyk** or **Checkmarx** for additional security scanning.
- Deploy the application to a cloud platform (e.g., AWS, Azure, GCP).
- Integrate with a container registry (e.g., Docker Hub) to push the Docker image.

---

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

## Acknowledgments

- [SonarQube](https://www.sonarqube.org/) for code quality and security analysis.
- [Trivy](https://github.com/aquasecurity/trivy) for container image scanning.
- [OWASP Dependency-Check](https://owasp.org/www-project-dependency-check/) for dependency vulnerability scanning.

---
