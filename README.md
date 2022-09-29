# IES_102491

## Notes

When trying to run the MyWeatherRadar program I received a warning about threads. In order to resolve it I used the command

```bash
mvn exec:java -Dexec.mainClass="main.java.com.raquelparadinha.WeatherStarter" -Dexec.cleanupDaemonThreads=false
```

With the parameter `cleanupDaemonThreads` set to `false`, maven does nothing about the daemon threads. When maven has no more work to do, the VM will normally terminate any remaining daemon threads.

------



## Review questions

A) Maven has three lifecycles: clean, site and default. Explain the main phases in the default lifecycle.

- `validate` - validate the project is correct and all necessary information is available
- `compile` - compile the source code of the project
- `test` - test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
- `package` - take the compiled code and package it in its distributable format, such as a JAR.
- `verify` - run any checks on results of integration tests to ensure quality criteria are met
- `install` - install the package into the local repository, for use as a dependency in other projects locally
- `deploy` - done in the build environment, copies the final package to the remote repository for sharing with other developers and projects.

B) Maven is a build tool; is it appropriate to run your project to?

Yes, we even used Maven for that purpose in exercise 1_2.

C) What would be a likely sequence of Git commands required to contribute with a new feature to a given project? (i.e., get a fresh copy, develop some increment, post back the added functionality)

```bash
git pull
git add *
git commit -m "commit message"
git push
```

D) There are strong opinions on how to write Git commit messages… Find some best practices online and give your own informed recommendations on how to write good commit messages (in a team project).

- Specify the type of commit
- Separate the subject from the body with a blank line
- Your commit message should not contain any whitespace errors
- Remove unnecessary punctuation marks
- Do not end the subject line with a period
- Capitalize the subject line and each paragraph
- Use the imperative mood in the subject line
- Use the body to explain what changes you have made and why you made them
- Do not assume the reviewer understands what the original problem was, ensure you add it
- Do not think your code is self-explanatory
- Follow the commit convention defined by your team

Guidelines according to the website https://www.freecodecamp.org/news/writing-good-commit-messages-a-practical-guide/.

E) Docker automatically prepares the required volume space as you start a container. Why is it important that you take an extra step configuring the volumes for a (production) database?

When configuring volumes we're going to make the data persist in the database. This way if the container is deleted ou a system reboot the data will remain there.
