# Exercise: classes-and-objects-2
* create a Java class called `Programmer` that has:
    * the *instance variable* `name` as string
    * the *instance variable* `programmingLanguage` as string
    * the *instance variable* `yearsOfExperience` as integer
    * the method `printProgrammerDetails()` that prints all the *state* of the `Programmer` object
* create a Java class called `Team` that has:
  * an *instance variable* `teamName` as string
  * 2 `Programmer` objects called `p1` and `p2`
  * the method `printTeamDetails()` that prints:
    * on one line the `teamName`
    * on one line the details of programmer `p1`
    * on one line the details of programmers `p2`
* create a *singleton* class called `CompetitionRules` that has:
  * a private variable `competitionRule1` as string, initialised with `"Do not copy and paste from StackOverflow!"` value
  * a private variable `competitionRule2` as string, initialised with `"Learn every day!"` value
  * a private variable `competitionRule3` as string, initialised with `"Be the best team!"` value
  * a method `printRules()` that prints the 3 rules
* create a class with the `main` method called `Competition` where you:
  * print all the rules
  * create 2 teams called `teamA` and `teamB`
  * assign random values to `teamA`'s and `teamB`'s names
  * assign random values to `teamA`'s programmers `p1` and `p2` *instance variables*
  * assign random values to `teamB`'s programmers `p1` and `p2` *instance variables*
  * print `teamA` and `teamB` details
