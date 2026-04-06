def main():
    print("--- Smart Warehouse Monitoring System ---")

    while True:
        anzahl_sensoren_str = input("Geben Sie die Anzahl der installierten Sensoren ein: ")
        anzahl_sensoren = int(anzahl_sensoren_str)
        if anzahl_sensoren >= 1:
            break
        else:
            print("Fehler: Es muss mindestens 1 Sensor vorhanden sein.")

    for i in range(anzahl_sensoren):
        print(f"\n--- Erfassung für Sensor {i + 1} ---")
        sensor_id = input("Geben Sie die Sensor-ID ein: ")

        messwerte = []
        for tag in range(1, 6):
            while True:
                temp = float(input(f"  Temperatur Tag {tag} (10.0 - 60.0 °C): "))
                if 10.0 <= temp <= 60.0:
                    messwerte.append(temp)
                    break
                else:
                    print(f"  Ungültig! Der Wert muss zwischen 10.0 und 60.0 liegen.")

        durchschnitt = sum(messwerte) / len(messwerte)
        maximalwert = max(messwerte)

        kritische_tage = 0
        for wert in messwerte:
            if wert > 35.0:
                kritische_tage += 1

        print(f"\nErgebnisse für Sensor: {sensor_id}")
        print(f"Wochendurchschnitt: {durchschnitt:.2f} °C")
        print(f"Maximalwert: {maximalwert:.2f} °C")
        print(f"Kritische Tage (> 35 °C): {kritische_tage}")

        if kritische_tage >= 3:
            print("!!! WARNUNG: Sensor hat an 3 oder mehr Tagen kritische Werte gemeldet! !!!")

    print("\n--- Monitoring abgeschlossen ---")


if __name__ == "__main__":
    main()