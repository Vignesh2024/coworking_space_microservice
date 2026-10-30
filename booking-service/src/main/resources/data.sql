INSERT INTO bookings
(member_name, booking_status, total_price)
VALUES
    ('Arun Kumar', 'CONFIRMED', 100.00),
    ('Vignesh', 'PENDING', 150.00),
    ('Karthik', 'CONFIRMED', 200.00),
    ('Priya', 'CONFIRMED', 350.00),
    ('Rahul', 'CANCELLED', 100.00),
    ('Sanjay', 'CONFIRMED', 280.00),
    ('Divya', 'PENDING', 150.00),
    ('Suresh', 'CONFIRMED', 300.00),
    ('Harish', 'CONFIRMED', 400.00),
    ('Naveen', 'PENDING', 200.00),
    ('Ajay', 'CONFIRMED', 500.00),
    ('Deepak', 'CANCELLED', 150.00),
    ('Praveen', 'CONFIRMED', 250.00),
    ('Ramesh', 'PENDING', 350.00),
    ('Manoj', 'CONFIRMED', 450.00),
    ('Anitha', 'CONFIRMED', 100.00),
    ('Keerthana', 'PENDING', 200.00),
    ('Gokul', 'CONFIRMED', 300.00),
    ('Surya', 'CONFIRMED', 400.00),
    ('Bala', 'PENDING', 500.00);

INSERT INTO booking_items
(desk_id, hours, booking_id)
VALUES
    (1, 2, 1),
    (2, 3, 2),
    (3, 4, 3),
    (4, 5, 4),
    (5, 2, 5),
    (6, 4, 6),
    (7, 3, 7),
    (8, 5, 8),
    (9, 6, 9),
    (10, 2, 10),
    (11, 5, 11),
    (12, 3, 12),
    (13, 4, 13),
    (14, 5, 14),
    (15, 6, 15),
    (16, 2, 16),
    (17, 4, 17),
    (18, 3, 18),
    (19, 4, 19),
    (20, 5, 20);