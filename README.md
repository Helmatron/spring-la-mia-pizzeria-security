# la-mia-pizzzeria-Security_MySQL DataBase

## Index
![Copertina del progetto](./readme_img/index.png)

## Index
![Copertina del progetto](./readme_img/gestione_pizze.png)

## Index
![Copertina del progetto](./readme_img/gestione_offerte.png)

## Index
![Copertina del progetto](./readme_img/gestione_ingredienti.png)

## Index
![Copertina del progetto](./readme_img/nuova_pizza.png)

## Index
![Copertina del progetto](./readme_img/nuova_offerta.png)

## Index
![Copertina del progetto](./readme_img/nuovo_ingrediente.png)

## Index
![Copertina del progetto](./readme_img/modifica_pizza.png)

## Index
![Copertina del progetto](./readme_img/modifica_offerta.png)


## Esercizio di oggi: Spring La Mia Pizzeria Security
___________________________________________________________________________________________________

### proteggiamo la nostra applicazione!

Abbiamo sviluppato tutte le pagine per gestire la nostra pizzeria (elenco pizze, dettagli singola pizza, creazione, modifica, cancellazione, offerte speciali, ingredienti)…
ma vogliamo che chiunque possa effettuare queste operazioni?

Sicuramente no!

Quindi inseriamo l’autenticazione in modo che solo gli utenti registrati possano accedere a queste pagine.
Creiamo le entity necessarie e popoliamo a mano i dati degli utenti nel database.

### Sono previsti due ruoli : USER e ADMIN

Gli utenti con ruolo USER possono accedere solo alla pagina index e a quella di dettaglio.
Gli utenti ADMIN possono fare tutto.