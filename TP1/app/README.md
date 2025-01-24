QUESTION 1 : Où se trouve ce fichier ? Donnez son nom et son emplacement dans l'aborescence du projet.

Le fichier s'apelle activity_main.xml et se trouve dans /app/res/layout.

QUESTION 2 : Qu'avez vous modifié ?

J'ai modifié la TextView dans le fichier activity_main.xml (android:text="Coucou j'ai trouvé comment faire") 

QUESTION 3 : Qu'avez vous modifier pour chager l'icone ? 

J'ai modifié la balise android:icon du fichier AndroidManifest.xml 

QUESTION 4 : Est ce nécéssaire de cliquer sur le bouton valider pour afficher le texte saisi sur la seconde activité ? Pourquoi ?

Non, parce que le texte est automatiquement changé quand on clique sur le bouton next.

QUESTION 5 : Le comportement de la question4 vous semble-t-il normal ? 

Oui tout à fait

QUESTION 6 : Comment faire pour ne pas afficher le nouveau texte sur la deuxième activité tant que le bouton valider n'a pas été cliqué ?

Il faut attribuer l'action à ce bouton, puis prendre un booleén dans l'instance pour vérifier que l'utilisateur à bien cliquer sur le bouton valider avant.