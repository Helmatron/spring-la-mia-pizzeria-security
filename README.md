# la-mia-pizzzeria-Security_MySQL DataBase

## Index user1 - senza privilegi ADMIN
![Copertina del progetto](./readme_img/user1_main.png)

## Dettagli Pizze user1 - senza privilegi ADMIN
![Copertina del progetto](./readme_img/user1_detail.png)

## Index admin1 - con privilegi ADMIN (compare la voce "Dashboard" sulla Navbar)
![Copertina del progetto](./readme_img/admin1_main.png)

## Login
![Copertina del progetto](./readme_img/login.png)

## Logout
![Copertina del progetto](./readme_img/logout.png)

## Gestione Pizze
![Copertina del progetto](./readme_img/gestione_pizze.png)

## Gestione Offerte
![Copertina del progetto](./readme_img/gestione_offerte.png)

## Gestione Ingredienti
![Copertina del progetto](./readme_img/gestione_ingredienti.png)

## Nuova Pizza
![Copertina del progetto](./readme_img/nuova_pizza.png)

## Nuova Offerta
![Copertina del progetto](./readme_img/nuova_offerta.png)

## Nuovo Ingrediente
![Copertina del progetto](./readme_img/nuovo_ingrediente.png)

## Modifica Pizza
![Copertina del progetto](./readme_img/modifica_pizza.png)

## Modifica offerta
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