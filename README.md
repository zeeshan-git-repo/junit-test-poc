# junit-test-poc

A proof‑of‑concept Spring Boot project showcasing JUnit testing strategies and best practices.

Repository: [zeeshan-git-repo/junit-test-poc](https://github.com/zeeshan-git-repo/junit-test-poc)

---

## What is in this repository (as currently present)

- Maven project with wrapper:
  - mvnw, mvnw.cmd, .mvn/
- Build descriptor:
  - pom.xml (Java 17, dependencies: spring-boot-starter-web, spring-boot-starter-test; JaCoCo configured)
- Tests:
  - src/test/java/com/zeeshan/junit/JUnitTestProjectApplicationTests.java
  - src/test/java/com/zeeshan/junit/UserServiceTest.java
  - src/test/java/com/zeeshan/junit/controller/UserControllerTest.java
- Misc:
  - .gitignore, .gitattributes

Note: I did not find Java source files under src/main/java when inspecting the repository; the project currently contains test classes but no application classes under src/main/java (only package directories). The repository view used for this analysis may be incomplete — view the repository on GitHub to confirm: [zeeshan-git-repo/junit-test-poc](https://github.com/zeeshan-git-repo/junit-test-poc).

---

## Requirements

- Java 17 (project pom sets java.version to 17)
- Maven (wrapper included — use the wrapper to run builds without a local Maven install)

---

## Build & test

From the repository root:

- Run tests with the Maven wrapper:
  - Unix/macOS: ./mvnw test
  - Windows: mvnw.cmd test

- Or with an installed Maven:
  - mvn test

JaCoCo is configured in the pom and will generate a coverage report during the test phase.

---

## Notes

- This README reflects only items currently present in the repository (build files, the test classes listed above, and basic repo metadata). It does not add features or assumptions (for example, there is no main application class to run).
- If you want the README to include summaries of what each test verifies, or want me to open specific files and extract their contents into the README, tell me which files and I will include concise descriptions. 
