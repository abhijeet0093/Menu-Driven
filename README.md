# Team Member

1.Abhijit Ashok Jadhav
2.Om Bharat Babar

# College Name

S.E.S Polytechnic 

## 📦 Features

- Add a new user
- List all users
- Uses Hibernate 7.x and JPA 3.1
- In-memory H2 database for testing/demo

## 🛠 Requirements

- Java 17+
- Maven

## 🚀 How to Run

1. Open terminal in the project root folder.
2. Compile the project:
   ```bash
   mvn compile
   ```
3. Run the application:
   ```bash
   mvn exec:java -Dexec.mainClass="com.example.menuapp.Main"
   ```

> Note: If `exec:java` doesn't work, add `exec-maven-plugin` in `pom.xml`.

## 🗂 Structure

```
menu-app/
├── pom.xml
├── README.md
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/menuapp/
│       │       ├── Main.java
│       │       ├── MenuService.java
│       │       ├── entity/User.java
│       │       └── util/HibernateUtil.java
│       └── resources/
│           └── META-INF/persistence.xml
```

## 🧪 Sample Output

```
=== Menu ===
1. Add User
2. List Users
0. Exit
```

Enjoy coding!
