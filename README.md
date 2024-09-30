# SchoolMouv App - README (Partie Réalisée)

## Introduction

**SchoolMouv App** est une application Android permettant aux parents et aux élèves de s'inscrire et de se connecter pour bénéficier de services éducatifs. Cette version implémente la partie inscription et connexion avec des fonctionnalités spécifiques aux parents et aux élèves.

## Fonctionnalités Réalisées

### 1. **Inscription**

L'application permet à l'utilisateur de s'inscrire en tant que **Parent** ou **Élève** :
- **Parent**: 
  - Saisie des informations personnelles (nom, prénom, email, login, mot de passe).
  - Ajout d'élèves avec leurs informations (nom, prénom, lien de parenté, niveau scolaire).
  - Choix d'une formule d'abonnement et d'un mode de paiement.
- **Élève**:
  - Saisie des informations personnelles directement sans ajout de parent.

### 2. **Connexion**

L'application propose un formulaire de connexion permettant de se connecter en fonction du profil sélectionné (**Parent** ou **Élève**) :
- Après connexion :
  - **Parent**: Accès à un tableau de bord pour suivre les activités de ses enfants (non implémenté dans cette version).
  - **Élève**: Accès à un tableau de bord pour consulter des cours et exercices (non implémenté dans cette version).

### 3. **Retour à l'Accueil après Inscription**

Après l'inscription réussie, l'utilisateur est redirigé vers l'écran principal de l'application.

## Technologies Utilisées

- **Langage**: Java
- **Environnement**: Android Studio
- **Version Android**: API 21 (Lollipop) et supérieure

## Prérequis

- **JDK 8+**
- **Android Studio 4.0+**
- **Un appareil ou émulateur Android avec Android 5.0 (Lollipop) ou supérieur**

## Installation

### 1. Clonez le projet

```bash
git clone https://github.com/kawthar-dad-had/SchoolMouv.git

