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
### Généralités

La fusion est toujours locale
 - aucun risque de casser quoique ce soit

On peut toujours annuler l'opération
 - `git merge --abort`
 - `git rebase --abort`

Il est toujours préférable d'avoir une copie de travail propre
 - valider : `git commit`
 - ou remiser : `git stash`


===


<!-- .slide: data-background-image="images/merge-logo.png" data-background-size="600px" class="slide table-code" -->
### Conflits de fusion

La __même ligne__ du __même fichier__ a été modifée différemment  

Sans conflit :
```shell
git tag ici
git diff ex1a..ex1b
git diff ex1a..bex1
git reset --hard ex1b
git merge bex1
git reset --hard ici
git tag -d ici
```


===


<!-- .slide: data-background-image="images/merge-logo.png" data-background-size="600px" class="slide" -->
### Une image
<div class="center">
    <img src="git-logo.png" class="boxed-img" />
</div>