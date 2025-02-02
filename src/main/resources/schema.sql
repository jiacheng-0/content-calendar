CREATE TABLE IF NOT EXISTS Content (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    status VARCHAR(20) NOT NULL,
    content_type VARCHAR(50) NOT NULL,
    date_created TIMESTAMP NOT NULL,
    date_updated TIMESTAMP,
    url VARCHAR(255)
);


-- generate insert 1 row
INSERT INTO Content (title, description, status, content_type, date_created, date_updated, url)
VALUES ('Title 1', 'Description 1', 'ACTIVE', 'ARTICLE', '2021-01-01 00:00:00', '2021-01-01 00:00:00', 'https://www.google.com');
