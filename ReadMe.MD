
h1> Compte rendu — TP : Injection de dépendances (DAO / Métier)</h1>

<p><strong>Nom :</strong> Ikram Mouhsine<br>
<strong>Université :</strong> Mundiapolis<br>
<strong>Objectif :</strong> Comprendre et appliquer les différents types d’injection de dépendances en Java 
(instanciation statique, dynamique et utilisation de Spring).</p>

<hr>
<h2>1 Travail réalisé</h2>

<ul>
  <li>Création de l’interface <strong><code>IDao</code></strong> avec la méthode <code>getData()</code>.</li>
  <li>Création de la classe <strong><code>DaoImpl</code></strong> qui implémente <code>IDao</code> et retourne une donnée simulée.</li>
  <li>Création de l’interface <strong><code>IMetier</code></strong> avec la méthode <code>calcul()</code>.</li>
  <li>Création de la classe <strong><code>MetierImpl</code></strong> qui dépend d’un objet <code>IDao</code> injecté (couplage faible).</li>
</ul>

<hr>

<h2>2 Types d’injection utilisés</h2>

<h3> a) Instanciation statique</h3>
<p>Les objets sont créés directement dans la classe principale <code>Presentation</code>.</p>

<h3> b) Instanciation dynamique</h3>
<p>Utilisation de la <strong>réflexion Java</strong> pour charger les classes depuis un fichier <code>config.txt</code>.</p>
<hr>

<h2>3 Résultats obtenus</h2>

<ul>
  <li><strong>Injection statique :</strong> fonctionne mais le couplage reste fort.</li>
  <li><strong>Injection dynamique :</strong> plus flexible grâce à la réflexion Java.</li>
</ul>

<hr>

<h2>4  Conclusion</h2>

<p>Ce TP m’a permis de bien comprendre la notion de <strong>couplage faible</strong> et le principe 
de l’<strong>injection de dépendances</strong> en Java.  
Grâce à ce travail, j’ai aussi découvert comment le framework <strong>Spring</strong> facilite la gestion 
des objets et rend le code plus propre et modulable.</p>

<p><strong>Fait par :</strong> Ikram Mouhsine<br>
<strong>Université :</strong> Mundiapolis — 2ACI-GB</p>