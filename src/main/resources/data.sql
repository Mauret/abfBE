-- companies
INSERT INTO af.company (id_company, name, address, zipcode, city, phone, email, description)
VALUES (1, 'azienda1', 'via delle prove 1', '12345', 'Città delle prove', '1234567890',
        'mail@example.com',
        'descrizione azienda1');

INSERT INTO af.company (id_company, name, address, zipcode, city, phone, email, description)
VALUES (2, 'azienda2', 'via delle prove 2', '12345', 'Città delle prove', '1234567890',
        'mail@example.com',
        'descrizione azienda2');

INSERT INTO af.company (id_company, name, address, zipcode, city, phone, email, description)
VALUES (3, 'azienda3', 'via delle prove 3', '12345', 'Città delle prove', '1234567890',
        'mail@example.com',
        'descrizione azienda3');

INSERT INTO af.company (id_company, name, address, zipcode, city, phone, email, description)
VALUES (4, 'azienda4', 'via delle prove 4', '12345', 'Città delle prove', '1234567890',
        'mail@example.com',
        'descrizione azienda4');

INSERT INTO af.company (id_company, name, address, zipcode, city, phone, email, description)
VALUES (5, 'azienda5', 'via delle prove 5', '12345', 'Città delle prove', '1234567890',
        'mail@example.com',
        'descrizione azienda5');

-- menu entries
INSERT INTO af.menu_entry (id_menu_entry, name)
VALUES (1, 'menuentry1');

INSERT INTO af.menu_entry (id_menu_entry, name)
VALUES (2, 'menuentry2');

INSERT INTO af.menu_entry (id_menu_entry, name)
VALUES (3, 'menuentry3');

-- menus
INSERT INTO af.menu (id_menu, name, company)
VALUES (1, 'menu1', 1);

INSERT INTO af.menu (id_menu, name, company)
VALUES (2, 'menu2', 2);

INSERT INTO af.menu (id_menu, name, company)
VALUES (3, 'menu3', 3);

INSERT INTO af.menu (id_menu, name, company)
VALUES (4, 'menu4', 4);

INSERT INTO af.menu (id_menu, name, company)
VALUES (5, 'menu5', 5);

-- menus in companies
UPDATE af.company
SET menu = 1
WHERE id_company = 1;

UPDATE af.company
SET menu = 2
WHERE id_company = 2;

UPDATE af.company
SET menu = 3
WHERE id_company = 3;

UPDATE af.company
SET menu = 4
WHERE id_company = 4;

UPDATE af.company
SET menu = 5
WHERE id_company = 5;

-- menu_menu_entries
INSERT INTO af.menu_menu_entries (menu, menu_entries)
VALUES (1, 1);

INSERT INTO af.menu_menu_entries (menu, menu_entries)
VALUES (1, 2);

INSERT INTO af.menu_menu_entries (menu, menu_entries)
VALUES (1, 3);

INSERT INTO af.menu_menu_entries (menu, menu_entries)
VALUES (2, 1);

INSERT INTO af.menu_menu_entries (menu, menu_entries)
VALUES (2, 2);

INSERT INTO af.menu_menu_entries (menu, menu_entries)
VALUES (3, 1);

INSERT INTO af.menu_menu_entries (menu, menu_entries)
VALUES (3, 2);

INSERT INTO af.menu_menu_entries (menu, menu_entries)
VALUES (4, 1);

INSERT INTO af.menu_menu_entries (menu, menu_entries)
VALUES (4, 2);

INSERT INTO af.menu_menu_entries (menu, menu_entries)
VALUES (5, 1);

INSERT INTO af.menu_menu_entries (menu, menu_entries)
VALUES (5, 2);

-- menu_entry_menus
INSERT INTO af.menu_entry_menus (menu_entry, menus)
VALUES (1, 1);

INSERT INTO af.menu_entry_menus (menu_entry, menus)
VALUES (1, 2);

INSERT INTO af.menu_entry_menus (menu_entry, menus)
VALUES (1, 3);

INSERT INTO af.menu_entry_menus (menu_entry, menus)
VALUES (1, 4);

INSERT INTO af.menu_entry_menus (menu_entry, menus)
VALUES (1, 5);

INSERT INTO af.menu_entry_menus (menu_entry, menus)
VALUES (2, 1);

INSERT INTO af.menu_entry_menus (menu_entry, menus)
VALUES (2, 2);

INSERT INTO af.menu_entry_menus (menu_entry, menus)
VALUES (2, 3);

INSERT INTO af.menu_entry_menus (menu_entry, menus)
VALUES (2, 4);

INSERT INTO af.menu_entry_menus (menu_entry, menus)
VALUES (2, 5);

INSERT INTO af.menu_entry_menus (menu_entry, menus)
VALUES (3, 1);

-- check_point
INSERT INTO af.check_point (id_check_point, name, longitude, latitude, company)
VALUES (1, 'checkpoint1', '13.345333', '46.1483958', 1);

INSERT INTO af.check_point (id_check_point, name, longitude, latitude, company)
VALUES (2, 'checkpoint2', '13.344453', '46.149659', 2);

INSERT INTO af.check_point (id_check_point, name, longitude, latitude, company)
VALUES (3, 'checkpoint3', '13.347500', '46.148738', 3);

INSERT INTO af.check_point (id_check_point, name, longitude, latitude, company)
VALUES (4, 'checkpoint4', '13.336085', '46.139966', 4);

INSERT INTO af.check_point (id_check_point, name, longitude, latitude, company)
VALUES (5, 'checkpoint5', '13.335999', '46.137171', 5);

-- check_point in company
UPDATE af.company
SET check_point = 1
WHERE id_company = 1;

UPDATE af.company
SET check_point = 2
WHERE id_company = 2;

UPDATE af.company
SET check_point = 3
WHERE id_company = 3;

UPDATE af.company
SET check_point = 4
WHERE id_company = 4;

UPDATE af.company
SET check_point = 5
WHERE id_company = 5;