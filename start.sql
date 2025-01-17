CREATE TABLE person (
                        id SERIAL PRIMARY KEY,
                        FirstName VARCHAR(50) NOT NULL,
                        LastName VARCHAR(50) NOT NULL,
                        gender CHAR(1) CHECK (gender IN ('M', 'F')),
                        email VARCHAR(100) UNIQUE,
                        PhoneNumber VARCHAR(15)
);
