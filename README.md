# **ROLL THE DICE**

Un gioco Android sviluppato tramite l'utilizzo dell'IDE Android Studio, pensato per mettere in pratica i concetti fondamentali della programmazione Android: gestione delle activity, passaggio di dati tramite `Intent` e interazione con l'interfaccia grafica realizzata nell'activity.

## **SCOPO DEL PROGETTO**

L’obiettivo del progetto è realizzare una piccola applicazione che simula il lancio di un dado. Il gioco è pensato per comprendere:

- Come creare e collegare più activity in un'app Android.
- Come trasferire dati tra activity usando gli `Intent`.
- Come associare risorse grafiche dinamicamente a seconda dei dati ricevuti.
- Come utilizzare i componenti base dell’interfaccia utente (pulsanti, immagini, testo).

## **STRUTTURA DELL'APPLICAZIONE**

L’applicazione è composta da **tre activity principali**, ognuna con uno scopo specifico:

1. **MainActivity**: schermata iniziale dove l’utente può premere un pulsante per “lanciare” un dado virtuale. Viene generato un numero casuale da 1 a 6 e questo viene passato alla schermata successiva.
   
2. **SecondActivity**: mostra il numero estratto e visualizza l’immagine del dado corrispondente. Da qui, l’utente può premere un altro pulsante per scoprire se ha vinto o perso.
   
3. **ThirdActivity**: determina il risultato del gioco in base alla **parità** del numero. Se il numero è **dispari**, l’utente vince; se è **pari**, perde. Assieme ad essa, inoltre, viene visualizzata a schermo un’immagine coerente con l’esito.

Ogni activity è indipendente e riceve le informazioni necessarie tramite `Intent`.

## **FUNZIONALITÀ**

- **Generazione di un numero casuale** da 1 a 6 al lancio del dado.
- **Visualizzazione dinamica** dell’immagine del dado corrispondente al numero estratto.
- **Determinazione dell’esito** in base alla parità del numero.
- **Transizione fluida tra activity** tramite `Intent` e `putExtra`.

## **NAVIGAZIONE TRA LE ACTIVITY**

1. `MainActivity`: punto di partenza con il pulsante “LANCIO DEI DADI”.
2. `SecondActivity`: mostra il risultato numerico e grafico del dado.
3. `ThirdActivity`: comunica la vittoria o sconfitta e mostra l’immagine relativa.

## **RISORSE GRAFICHE**

Le immagini del dado e degli esiti devono essere inserite nella cartella `res/drawable/`:

- `dice_face_1.png` … `dice_face_6.png`: le sei facce del dado.
- `victory.png`: immagine per indicare la vittoria.
- `lose.png`: immagine per indicare la sconfitta.
- `dices.png`: immagine di generica.

## **REQUISITI**

- Android Studio
- SDK Android 21 o superiore
- Linguaggio Kotlin

## **AVVIO DELL'APP**

1. Clonare il repository sul proprio ambiente di sviluppo.
2. Aprire il progetto con Android Studio.
3. Avviare un emulatore o collegare un dispositivo fisico.
4. Compilare ed eseguire l'app (`Run > Run 'app'` oppure `Shift+F10`).

## **DA MIGLIORARE**

- Inserimento di **animazioni** per il lancio del dado.
- Aggiunta di uno **storico dei risultati** o di una classifica.
- Introduzione di **modalità multiplayer** o livelli di difficoltà.
- Miglioramento dell’**interfaccia utente** e della responsività.

## **LICENZA**

Progetto realizzato da ***TOMMASO PIGNATTA***
