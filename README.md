# Hibernate CRUD using HQL(Modular Approach) 🧩

This is a modular Java project demonstrating **CRUD operations using Hibernate HQL** with an **Employee** data model.  
The project follows a clean package structure (DAO, Entity, Service, Controller) and uses **Hibernate ORM** to interact with a relational database.

---

## 🚀 Features

- ✅ Insert new Employee (using Hibernate `NativeMutationQuery()`)
- 📖 Read all Employees or by ID (HQL `FROM`)
- 📝 Update Employee salary (HQL `UPDATE`)
- 🗑️ Delete Employee record (HQL `DELETE`)
- 💡 Modular structure with clean separation of concerns

---

## 🧾 Technologies Used

- Java (JDK 8+)
- Hibernate ORM (6.x)
- HQL (Hibernate Query Language)
- MySQL or any JDBC-supported DB
- Maven
- Eclipse / IntelliJ IDEA

---

## 📂 Project Structure


```
hibernate-crud-usingHQL/
│
├── src/
│ └── com/
│ ├── entity/ --> Employee.java
│ ├── dao/ --> EmployeeDao.java (Session setup)
│ ├── service/ --> InsertEmployee.java, ReadEmployee.java, UpdateEmployee.java, DeleteEmployee.java
│ └── controller/ --> MainController.java (to test all operations)
│
├── resources/
│ └── hibernate.cfg.xml --> Hibernate DB configuration
│
└── README.md
```


---

## 🧑‍💼 Employee Fields

```java
private int emp_id;
private String empName;
private String empDept;
private String gender;
private double salary;
```
