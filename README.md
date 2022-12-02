## Sample project to reproduce alias inside constructors [IntelliJ IDEA bug](https://youtrack.jetbrains.com/issue/IDEA-307244/Aliases-inside-POJO-class-constructors-ar-not-recognised-in-JPQL-HQL)
#### Description:

SpringBoot app with an in memory H2 database.

The issue is located in the `CustomerRepository.java` file.

Run the `CustomerRepositoryTest.findCustomers()` test to be sure that the JPQL query is correct.