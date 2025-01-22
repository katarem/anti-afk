# Anti-AFK

A Java-based tool to simulate activity and prevent inactivity detection in monitoring software like Microsoft Teams. Designed for personal use during short breaks.

## Index

- [Description](#description)
- [Features](#features)
- [Requirements](#requirements)
- [Installation](#installation)
- [Usage](#usage)
- [Contributions](#contributions)
- [License](#license)
- [Disclaimer](#disclaimer)
- [Contact](#contact)

## Description

Anti-AFK Tool is a Java-based application designed to simulate user activity to prevent inactivity detection by monitoring software (e.g., Microsoft Teams). It helps users keep their sessions active during short breaks, ensuring uninterrupted availability during remote work or study sessions.

**Note**: This tool is intended for personal use only and must be used ethically and in compliance with your organization's or institution's policies. Users are responsible for adhering to applicable rules and guidelines.

## Features

- Simulates periodic keyboard usage
- Customizable delay
- Simple to start and stop
- Compatible with Windows, MacOS and Linux

## Requirements
- **Java JDK** 11 Minimum
- **Maven**

## Installation

Instructions to compile the project.

```bash
# Clone the repository
git clone https://github.com/katarem/anti-afk.git

# Navigate to the project's folder
cd anti-afk

# Create the ejecutable jar
mvn clean package

# Execute and enjoy
java -jar target/anti-afk-1.0.0.jar
```

## Usage

Launch the JAR you can download on the [releases](https://github.com/katarem/anti-afk/releases) page, or [compile it yourself](#installation).

To exit the program, just press the **ESC** key.


## Contributing
Contributions are welcome! If you'd like to contribute:

Fork the repository.
Create a new branch
```git
git checkout -b feature/new-feature
```
Commit your changes.
```
git commit -m 'Add a new feature'
```
Push your branch
```
git push origin feature/new-feature
```
Open a pull request.

## License

This project is licensed under the GNU License. See the [LICENSE](./LICENSE) file for details.

## Disclaimer

You can check the disclaimer [here](https://www.termsfeed.com/live/030ad99e-8df1-484b-97c8-ea2bee0bad24).

## Contact

For questions or feedback, feel free to reach out at crismigesp@gmail.com or open an issue in this repository.