<!-- .slide: data-background-image="images/merge-logo.png" data-background-size="600px" class="slide" -->
### Quelques précisions : *merge*, *rebase* et *pull*

Les fusions se produisent dans trois cas :
 - intégration d'une branche
  - `git merge <branche_name>`
 - récupération des modifications distantes
  - `git pull`
 - réécriture de l'historique local
  - `git rebase master`

Les techniques présentées ici sont valables dans les trois cas
 - `git pull` =
  - `git fetch`
  - `git merge origin/master` 


===


<!-- .slide: data-background-image="images/merge-logo.png" data-background-size="600px" class="slide" -->
### Une image
<div class="center">
    <img src="git-logo.png" class="boxed-img" />
</div>