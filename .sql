CREATE TABLE product (
                         id INT NOT NULL AUTO_INCREMENT,
                         name VARCHAR(100) NOT NULL,
                         price INT NOT NULL,
                         description VARCHAR(500),
                         PRIMARY KEY (id)
)

    INSERT INTO product VALUES (NULL, "pen", 2000, "black pen");
