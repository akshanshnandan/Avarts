# RunLog

RunLog is a Java-based web application that allows runners to track their workouts, analyze their progress, and work toward personal running goals.

## The Problem

As someone who runs regularly, I find it difficult to keep track of my running progress and see how much I've improved over time. I want to make it easier for runners to organize their workouts, monitor their weekly mileage, and understand their progress without having to calculate everything manually.

## How It Works

RunLog will allow users to enter their runs through a website and view their running history and statistics in one place.

The MVP will include:
- Logging runs with dates, distances, and times
- Saving workout information in a database
- Automatically calculating pace and weekly mileage
- Displaying workout history and running statistics
- Showing mileage trends through interactive charts
- Setting weekly mileage goals and tracking progress

The system will use a Java backend to process workout data and a website to display the results.

## Tech Stack

- Language: Java, HTML, CSS, and JavaScript
- Backend: Spring Boot and Spring MVC
- Frontend: Thymeleaf and Chart.js
- Database: H2 with Spring Data JPA
- Build Tool: Maven
- Development Tools: VS Code, Git, and GitHub
- External APIs: None for the MVP

## Setup

RunLog is currently in development, so the application is not yet runnable.

Once the initial Spring Boot application is implemented, the planned setup process will be:

1. Clone the GitHub repository.
2. Open the project folder in VS Code.
3. Make sure Java and Maven are installed.
4. Run the application using Maven.

```bash
mvn spring-boot:run
```

5. Open `http://localhost:8080` in a browser.

These instructions will be tested and updated as development progresses.

## Usage

Once completed, users will be able to open the RunLog website and enter information about their runs. The application will calculate statistics automatically and display workout history, mileage trends, and progress toward weekly goals.

## Roadmap

The following features are planned for future versions:

      User accounts and authentication
      Integration with Strava or other fitness tracking services
      Advanced analytics, including personal records and pace predictions

## Author

Akshansh Nandan

GitHub: https://github.com/akshanshnandan
