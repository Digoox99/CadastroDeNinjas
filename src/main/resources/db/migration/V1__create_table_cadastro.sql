CREATE TABLE TB_CADASTRO (
                             id BIGINT AUTO_INCREMENT PRIMARY KEY,
                             nome VARCHAR(255) NOT NULL,
                             email VARCHAR(255) UNIQUE NOT NULL,
                             idade INT,
                             img_url VARCHAR(255)
);