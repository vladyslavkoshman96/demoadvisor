How to run tests:

- Run test from command line with maven

1. Go to project directory
2. Run command line(windows) or terminal(mac os)
3. Type command:
    # Run all tests:
    - mvn clean test

    # Run a single test class.
    - mvn clean -Dtest=YourClassName test

     # Run a single test package.
    - mvn clean -Dtest=yourPackage.*Test test

    # Headless mode
    - mvn -Dheadless=true test

Example:
    - mvn clean -Dheadless=true -Dbrowser=chrome -Dtest=com.demo.tests.*Test test