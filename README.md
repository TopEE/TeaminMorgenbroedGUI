TeaminMorgenbroedGUI
====================

Dette projekt indeholder GUI-delen til backend-projektet TeaminMorgenBroedBatch.
GUI-koden er skrevet i AngularJS.
Indledningsvis er der en login-side. Her kan følgende brugere logge ind:
JHL, JMN, HVE samt admin-bruger.
Hvis det er enten JHL, JMN eller HVE, som er logget på, har de mulighed for at
checke deres saldo på siden med brugerens betalingsstatus.
Hvis det er admin-bruger, som er logget på, har denne mulighed for at vælge en
csv-fil, som skal opdatere databasen - denne fil skal indeholde data, som passer
i tabellen MORGENBROED - se projektet TeaminMorgenBroedBatch.
Data sendes til databasen via en servlet, når der trykkes på knappen Send data.
Er der ugyldige data i csv-filen, kan filen rettes til, hvorefter jobbet kan genstartes
vha. knappen Genstart. For begge disse knappers vedkommende vises jobbets kørselsstatus
samt jobbets executionId.
