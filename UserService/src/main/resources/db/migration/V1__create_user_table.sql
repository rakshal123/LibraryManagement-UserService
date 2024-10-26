--  create user table

CREATE TABLE Users (
    UserId CHAR(36) PRIMARY KEY,
    UserName VARCHAR(255) NOT NULL,
    ContactNumber INT,
    EmailId VARCHAR(255),
    Address VARCHAR(255),
    Status ENUM('ACTIVE','INACTIVE','SUSPENDED') NOT NULL,
    RegisteredDate DATETIME,
    ExpiredDate DATETIME,
    MembershipType VARCHAR(50)
);