# kotlin-spring-aop-example
Simple test example using spring and kotlin to learn aspect oriented programming. Solutions are not good, just descriptive.

- LogExecutionTime aspect logs execution time for all functions annotated with @LogExecutionTime
- `/hello` path has random execution time
- SaveName aspect and annotation saves the name passed to api `/hello/<name>` in a h2 repository
- `/dudes` returns list of names saved via aspect
