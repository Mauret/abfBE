-- companies
INSERT INTO af.company (id_company, name, address, zipcode, city, phone, email, description)
VALUES (1, 'azienda1', 'via delle prove 1', '12345', 'Città delle prove', '1234567890', 'mail@example.com',
        'descrizione azienda1');

INSERT INTO af.company (id_company, name, address, zipcode, city, phone, email, description)
VALUES (2, 'azienda2', 'via delle prove 2', '12345', 'Città delle prove', '1234567890', 'mail@example.com',
        'descrizione azienda2');

INSERT INTO af.company (id_company, name, address, zipcode, city, phone, email, description)
VALUES (3, 'azienda3', 'via delle prove 3', '12345', 'Città delle prove', '1234567890', 'mail@example.com',
        'descrizione azienda3');

INSERT INTO af.company (id_company, name, address, zipcode, city, phone, email, description)
VALUES (4, 'azienda4', 'via delle prove 4', '12345', 'Città delle prove', '1234567890', 'mail@example.com',
        'descrizione azienda4');

INSERT INTO af.company (id_company, name, address, zipcode, city, phone, email, description)
VALUES (5, 'azienda5', 'via delle prove 5', '12345', 'Città delle prove', '1234567890', 'mail@example.com',
        'descrizione azienda5');

-- menu entries
INSERT INTO af.menu_entry (id_menu_entry, name)
VALUES (1, 'menuentry1');

INSERT INTO af.menu_entry (id_menu_entry, name)
VALUES (2, 'menuentry2');

INSERT INTO af.menu_entry (id_menu_entry, name)
VALUES (3, 'menuentry3');

-- menus
INSERT INTO af.menu (id_menu, name)
VALUES (1, 'menu1');

INSERT INTO af.menu (id_menu, name)
VALUES (2, 'menu2');

-- menu_companies
INSERT INTO af.menu_companies (menu, companies)
VALUES (1, 1);

INSERT INTO af.menu_companies (menu, companies)
VALUES (1, 2);

INSERT INTO af.menu_companies (menu, companies)
VALUES (1, 3);

INSERT INTO af.menu_companies (menu, companies)
VALUES (2, 4);

INSERT INTO af.menu_companies (menu, companies)
VALUES (2, 5);

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

-- menu_entry_menus
INSERT INTO af.menu_entry_menus (menu_entry, menus)
VALUES (1, 1);

INSERT INTO af.menu_entry_menus (menu_entry, menus)
VALUES (1, 2);

INSERT INTO af.menu_entry_menus (menu_entry, menus)
VALUES (2, 1);

INSERT INTO af.menu_entry_menus (menu_entry, menus)
VALUES (2, 2);

INSERT INTO af.menu_entry_menus (menu_entry, menus)
VALUES (3, 1);