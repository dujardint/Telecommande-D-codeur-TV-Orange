# Telecommande-Décodeur-TV-Orange
Appli pour piloter en IP le décodeur TV orange en JavaFX

Crée par Thomas Dujardin car il en avait marre de prendre sa télécommande ducoup il a décidé de recréer une télécommande en javaFx
se base sur l'adresse ip privé du décodeur sur le port 8080

# Nouveauté : changement du dernier octet de l'@IP depuis l'interface
Si le décodeur a une adresse IP commencant par 192.168.1, l'utilisateur peut changer le dernier octet par l'adresse de chez lui
par défaut le dernier octet est .34 (ce que j'ai chez moi 😉) ) 


# Description : 
* A gauche, nous avons les bouttons de commandes + quelques accès rapide pour les chaines (tf1, france 2, tmc et bfmtv)
* A droite, nous avons la page html de status du décodeur
* tout en haut, une barre affichant l'adresse du décodeur et la possibilité de changer le dernier octet avec un boutton de validation, si l'entrée est correct, alors l'affichage de l'adresse du décodeur change

![photo](/app.jpg)