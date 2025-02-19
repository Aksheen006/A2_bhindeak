CREATE TABLE IF NOT EXISTS passwords (
                                         id BIGINT PRIMARY KEY AUTO_INCREMENT,
                                         title VARCHAR(255) NOT NULL,
                                         username VARCHAR(255) NOT NULL,
                                         password VARCHAR(255) NOT NULL,
                                         url VARCHAR(500),
                                         email VARCHAR(255),
                                         notes TEXT
);
