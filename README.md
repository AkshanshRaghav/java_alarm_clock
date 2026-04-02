# ⏰ Java Alarm Clock

A simple and functional **Alarm Clock application** built using **Java**, featuring a real-time digital clock, alarm scheduling, and sound notifications.

---

## 📌 Features

- 🕐 Real-time digital clock display
- ⏰ Set one time 
- 🔔 Sound notification when alarm triggers
- ✅ Enable / Disable alarms
- 🖥️ Simple and clean GUI (Swing / JavaFX)

---

## 🛠️ Technologies Used

| Technology | Purpose |
|------------|---------|
| Java (JDK 8+) | Core programming language |
| Java Swing / JavaFX | Graphical User Interface |
| javax.sound.sampled | Audio playback for alarm sound |
| java.util.Timer / Thread | Background time tracking |

---

## 📁 Project Structure
```
JavaAlarmClock/
│
├── src/
│   ├── Main.java            # Entry point
│   ├── AlarmClock.java      # Core clock logic
│   ├── AlarmManager.java    # Manages alarm list
│   └── SoundPlayer.java     # Handles alarm audio
│
├── assets/
│   └── alarm.wav            # Alarm sound file
│
├── README.md
└── AlarmClock.jar           # Executable JAR (optional)
```

---

## 🚀 Getting Started

### Prerequisites

- Java JDK 8 or higher installed
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

### Installation & Running

1. **Clone the repository**
```bash
   git clone https://github.com/your-username/java-alarm-clock.git
   cd java-alarm-clock
```

2. **Compile the project**
```bash
   javac src/*.java -d out/
```

3. **Run the application**
```bash
   java -cp out/ Main
```

4. **Or run the JAR file directly** *(if available)*
```bash
   java -jar AlarmClock.jar
```

---

## 🖼️ Screenshots
![image alt](https://github.com/AkshanshRaghav/java_alarm_clock/blob/5d2cb8f2c1c29afc64ede60f1d25ca628ac2bd1e/Screenshot%202026-04-03%20001411.png)

## 📖 How to Use

1. Launch the application.
2. The current time will be displayed on the main screen.
3. Enter the desired alarm time in `HH:MM` format.
4. Click **"Set Alarm"** to schedule it.
5. When the time matches, the alarm will ring with a sound.
6. Click **"Stop"** or **"Snooze"** to control the alarm.

---

## 🔧 Customization

- Replace `assets/alarm.wav` with any `.wav` audio file of your choice.
- Modify the UI theme in `AlarmClock.java` to change colors or fonts.

---

## 🤝 Contributing

Contributions are welcome! Feel free to:

1. Fork this repository
2. Create a new branch (`git checkout -b feature/your-feature`)
3. Commit your changes (`git commit -m 'Add some feature'`)
4. Push to the branch (`git push origin feature/your-feature`)
5. Open a Pull Request

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).

---

## 👤 Author

**Akshansh Raghav**   

---

> ⭐ If you found this project helpful, please give it a star!
