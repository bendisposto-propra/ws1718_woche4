# Alkoholrechner

Implementieren Sie eine Webanwendung mit Spring Boot zur Berechnung der Alkoholkonzentration im Blut. Formeln zur Berechnung finden Sie bei [Wikipedia](https://de.wikipedia.org/wiki/Blutalkoholkonzentration#Berechnung_der_BAK).

Ein Skelett für eine solche Anwendung finden Sie in diesem Projekt, Sie müssen die Vorlage aber nicht verwenden. Wenn Sie eine neue Spring Boot Anwendung schreiben, ist es ziemlich hilfreich den [Spring Initializr](http://start.spring.io/) zu verwenden, der automatisch Gradle bzw. Maven Projekte konfigurieren kann. Klicken Sie auf `Switch to the full version.` um eine Liste der konfigurierbaren Komponenten zu sehen. Die Vorgabe beinhaltet die Komponenten `Web`, `DevTools` und `Thymeleaf`.

# Vorgehen
Sie könnten zunächst eine einfache Version schreiben, die alle benötigten Werte als Input entgegennimmt und die Blutalkoholkonzentration anzeigt.

Verbessern Sie diese Version dann, folgende Features könnten Sie zum Beispiel einbauen:

* Berechnung der Alkoholmenge mit Hilfe von Menge und Alkoholgehalt
* Einbinden einer Datenbank mit alkoholischen Getränken
* Anzeige des Verlaufs der Blutalkoholkonzentration (graphisch oder als Tabelle)

Es gibt eine ganze Reihe von solchen Anwendungen im Netz, an denen Sie sich orienteren können.

__Implementieren Sie die Berechnung als Java Serveranwendung, nicht als JavaScript Anwendung, die im Browser läuft. Zweck der Übung ist es, den Umgang mit Spring Webanwendungen zu üben.__
