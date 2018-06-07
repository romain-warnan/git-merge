<!-- .slide: data-background-image="images/git-logo.png" data-background-size="600px" class="chapter" -->
## 2
### Interagir avec le dépôt distant


===


<!-- .slide: class="slide" -->
### Partager son travail

```bash
git push
```
 - tous les commits du dépôt local sont envoyés vers le dépôt distant

Cas le plus simple car :
 - on a clôné le dépôt distant
 - il existe une branche master distante
 - il n’y a pas eu de modifications dans la branche distante

Gérer les droits d’accès :
 - échange de clés SSH
 - identifiant / mot de passe
 - `credential.helper`


%%%


<!-- .slide: data-background-image="images/eclipse-logo.png" data-background-size="700px" class="slide" -->
### Partager ses *commits* (1)

La copie de travail doit être à jour : voir `git pull`

<div class="center">
    <img src="egit/push-0.png" class="boxed-img" />
</div>


%%%


<!-- .slide: data-background-image="images/eclipse-logo.png" data-background-size="700px" class="slide" -->
### Partager ses *commits* (2)

Récapitulatifs des *commits* envoyés

<div class="center">
    <img src="egit/push-1.png" class="boxed-img" />
</div>


===

 
<!-- .slide: class="slide" -->
### Mettre à jour sa copie locale
#### État initial

Des commits ont été envoyés vers le serveur par d’autres développeurs :

<div class="center">
    <img src="images/rebase-1.png" />
</div>


===


<!-- .slide: class="slide" -->
### Mettre à jour sa copie locale
#### Option 1 – Fusion

```bash
git pull
```
Génère un commit résultant de la fusion :
 - branche distante -> branche locale

<div class="center">
    <img src="images/rebase-2.png" />
</div>


%%%


<!-- .slide: data-background-image="images/eclipse-logo.png" data-background-size="700px" class="slide" -->
### Fusion d’une branche distante (1)

<div class="center">
    <img src="egit/pull-0.png" class="boxed-img" />
</div>


%%%


<!-- .slide: data-background-image="images/eclipse-logo.png" data-background-size="700px" class="slide" -->
### Fusion d’une branche distante (2)

<div class="center">
    <img src="egit/pull-1.png" class="boxed-img" />
</div>


%%%


<!-- .slide: data-background-image="images/eclipse-logo.png" data-background-size="700px" class="slide" -->
### Fusion d’une branche distante (3)

Création d’un *commit* de fusion à deux parents

<div class="center">
    <img src="egit/pull-2.png" class="boxed-img" />
</div>


===


<!-- .slide: class="slide" -->
### Mettre à jour sa copie locale
#### Option 2 – Rebasage

```bash
git pull --rebase
```
Pas de commit de fusion :
 - l’historique de la branche locale est réécrit
 
<div class="center">
    <img src="images/rebase-3.png" />
</div>


%%%


<!-- .slide: data-background-image="images/eclipse-logo.png" data-background-size="700px" class="slide" -->
### Rebasage d’une branche distante (1)

Choisir *Fetch*

 - pas *Pull* car cela fait une fusion par défaut

<div class="center">
    <img src="egit/fetch-rebase-0.png" class="boxed-img" />
</div>


%%%


<!-- .slide: data-background-image="images/eclipse-logo.png" data-background-size="700px" class="slide" -->
### Rebasage d’une branche distante (2)

Liste des *commits* qui vont être récupérés
<div class="center">
    <img src="egit/fetch-rebase-1.png" class="boxed-img" />
</div>


%%%

<!-- .slide: data-background-image="images/eclipse-logo.png" data-background-size="700px" class="slide" -->
### Rebasage d’une branche distante (3)

Choisir *Rebase*
<div class="center">
    <img src="egit/fetch-rebase-2.png" class="boxed-img" />
</div>


%%%

<!-- .slide: data-background-image="images/eclipse-logo.png" data-background-size="700px" class="slide" -->
### Rebasage d’une branche distante (4)

Choisir la branche distante adéquate
<div class="center">
    <img src="egit/fetch-rebase-3.png" class="boxed-img" />
</div>


%%%


<!-- .slide: data-background-image="images/eclipse-logo.png" data-background-size="700px" class="slide" -->
### Rebasage d’une branche distante (5)

Les commits locaux ont été réécrits et l’historique est linéaire
<div class="center">
    <img src="egit/fetch-rebase-4.png" class="boxed-img" />
</div>