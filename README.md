# Devoir Libre Java

Ce projet Java consiste en une application de gestion bancaire simplifiée, développée en tant que devoir libre. Il met en œuvre des concepts fondamentaux de la programmation orientée objet et l'utilisation de bibliothèques externes pour la conversion JSON.

## Structure du Projet

Le projet inclut les classes principales suivantes :

* `Banque` : représente une banque avec un identifiant et un pays.
* `Compte` : représente un compte bancaire avec un numéro de compte, une date d’ouverture, une date de clôture, et une devise.
* `Client` : représente un client de la banque, incluant ses informations personnelles (nom, prénom, adresse, etc.) ainsi que la banque et les comptes associés.
* `Transaction` : représente une transaction entre deux clients, avec un type de transaction calculé automatiquement.

## Utilisation de Jackson

Le projet utilise la bibliothèque Lombok pour réduire le code boilerplate (constructeurs, getters, setters) et **FasterXML Jackson** pour la sérialisation et la désérialisation des objets en JSON. Cela permet de convertir les objets Java en JSON et vice-versa.

## Exemple d’Utilisation

Dans la classe `Main`, des objets `Client`, `Compte`, `Banque`, et `Transaction` sont créés, puis sérialisés et désérialisés en JSON pour illustrer leur utilisation.

## Auteur

Ce devoir a été réalisé par **Marouane EL HAMMAL**, étudiant en deuxième année génie informatique, dans le cadre d'un exercice pratique en Java.
