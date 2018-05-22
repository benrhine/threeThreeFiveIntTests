# threeThreeFiveIntTests

From local install grails 3.3.5 `grails create-app NAME` and create 3 integration specs.

- A base integration test created by `grails create-integration-test DefaultTest`
- A integration test using Gorm Rollback `grails create-integration-test GormRollbackTest`
- Integration test exactly as described in ticket

Running all 3 test variants pass without issue when using the default gradle wrapper of 3.5

Upgrade gradle wrapper to 4.6

- update gradle.properties to gradleWrapperVersion=4.6
- execute `./gradlew wrapper --gradle-version 4.6`

Running all 3 test variants pass without issue when using the upgraded gradle wrapper of 4.6

Testing Issue https://github.com/grails/grails-core/issues/10999
Reference Issue https://github.com/grails/grails-core/issues/10959