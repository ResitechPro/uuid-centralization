# UUID Centralisation Service

A simple service for generating unique UUIDs.

## Getting Started

These instructions will help you set up and run the UUID generation service.

### Prerequisites

- Docker or maven (locally) or intellij.

### Running the Service

1. Clone the repository:

   ```bash
   git clone https://github.com/ResitechPro/uuid-centralizatio
   cd uuid-generation-service
    ```
#### Running with Docker
- pckage / build / run :

   ```bash
   mvn clean package -DskipTests
   docker build -t uuid .
   docker compose up
   ```
#### Running with Maven

   ```bash
   mvn spring:boot run
   ```