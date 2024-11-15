# Restaurant Review & Reservation App

This project is a platform dedicated to showcasing Japan's local gourmet culture. It allows users to explore restaurants, write reviews, and make reservations.

## Features

### User Side
- **Restaurant Discovery**:
  Search by name, area, or category. Filter by budget and sort by rating or date.
- **Membership Options**:
  - Free: Limited features.
  - Premium: Full access to reviews, favorites, and reservations.
- **Account Management**:
  Email verification, profile editing, subscription management, and more.
- **Other Features**:
  Save favorite restaurants, post reviews, and manage reservations.

### Admin Side
- **Platform Management**:
  Manage restaurant listings, user accounts, and categories.
- **Analytics**:
  Monitor user counts, reservations, and revenue.


## Technologies

- Java 21
- Spring Boot 3
- Bootstrap
- MySQL
- Stripe integration

## Local Setup

1. Clone the repository and navigate to the project folder:
   ```bash
   git clone git@github.com:yukaty/restaurant-review-app.git
   cd restaurant-review-app
   ```

2. Create a MySQL database and update credentials in `application.properties`.

3. Build and run the project:
   ```bash
   ./mvnw clean install
   ./mvnw spring-boot:run
   ```

4. Access the app at `http://localhost:8080`.


## Future Plans

- Full English localization
- Docker containerization
- UI/UX improvements
