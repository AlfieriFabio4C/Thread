Esercizio Hi Hello:

Ho creato tre classi chiamate Hi Hello e Say che estendevano la classe Thread.
In tutte le tre classi ho creato un metodo run() che scriverà
10 volte "ciao" nella classe Say;
10 volte "Hi" nella classe Hi;
10 volte "Hello" la classe Hello;


Nel main si creano 3 oggetti delle 3 rispettive classi, e ad ogni oggetto
si fa partire il metodo run con nomeOggetto.start(); che ti creerà un Thread,
nel nostro caso ne farà tre uno per ogni oggetto.


Esercizio conflitto tra Thread:

Ho creato una classe Inc1000 che estende la classe Thread, creato una 
variabile statica di classe chiamata count. Al suo interno c'è un metodo run() 
che incrementa di 1000 la variabile count attraverso un ciclo for.


Nel main ho creato due oggetti Inc1000 e ho fatto partire il metodo run() 
con nomeOggetto.start che crea il thread e lo avvia. Per sapere il valore di count si 
usa System.out.println(Inc1000.count); che lo restituirà in output. 


La variabile count è una variabile di classe, e quindi si crea appena viene creata la 
classe quindi si fa riferimento nel main con nomeClasse.variabileOggetto.


Il main essendo static non si può far riferimento alla variabile count a meno che 
anch'essa non sia static.
