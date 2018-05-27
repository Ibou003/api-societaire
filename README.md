# api-societaire
Gestion des données sociétaire

## Configuration de notre application sur Eclipse IDE 

1. How to create github repository
2. How to clone repository in eclipse
3. How to add eclipse project to github repository
4. How to commit, push and pull the changes


Step 1 : Create GitHub account and SignIn

Step 2 : Start a Project = Create a repository

Step 3 : Start Eclipse

Step 4 : Goto Perspective - Git Repositories and click on Add Git Repo

Step 5 : Create a project in Eclipse

Step 6 : Do a right click on Project - Team - Share - Add to git repo

Step 7 : Commit and Push the project to the repo

Step 8 : Commit and Push every change to the repo

## Spring Data et ElasticSearc
## Test d'intégration sur les projets
"Test d'intégration" signifie ici que l'on teste le fonctionnement de l'API en bouchonnant tous les éléments extérieurs (APIs, source de données, ...).

Ce projet présente donc les deux manières les plus courantes de bouchonner les éléments extérieurs :
 * L'utilisation de WireMock pour bouchonner les appels http
 * L'utilisation de Mockito pour tous les autres cas


### WireMock pour le bouchonnage des appels http

WireMock est un serveur de mock qui permet de bouchonner les appels http de manière transparente pour l'application.

#### Configuration et lancement

Pour pouvoir utiliser WireMock dans les tests, il est nécessaire d'avoir la dépendance suivante :

```xml
<dependency>
    <groupId>com.github.tomakehurst</groupId>
    <artifactId>wiremock-standalone</artifactId>
    <version>2.12.0</version>
    <scope>test</scope>
</dependency>
```
