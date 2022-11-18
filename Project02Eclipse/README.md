Sample project for OpenClassroom's fundamentals of Java

# Description du refactoring: 


* Une interface IsymptomReader implémentée par la classe ReadSymptomDataFromFile : lit le fichier et retourne une liste des symptômes

* Une interface ICountOccurences implémentée par la classe CountSymptoms :
  lit dans la liste des symptômes et retourne une Map dans l'ordre alphabétique avec le symptôme en clef et son nombre d'occurrence en valeur)

* Une interface ISymptomWriter implémentée par la classe WriteSymtpomDataToFile : itère sur la Map et écrit dans le fichier de sortie.

* refactorisation de AnalyticsCounter qui au final à une seule méthode publique qui enchaîne la lecture, le comptage et l'écriture dans le fichier(analyticsCounterStart()).

* Création d'une classe Main qui contient la méthode main, dans laquelle je crée une instance d'AnalyticsCounter et j'appelle juste la méthode analyticsCounterStart().

