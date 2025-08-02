INSERT INTO box (id, name, type, capacity, address) VALUES
(1, 'Box A1', 'Individuelle', 1, 'Zone Nord'),
(2, 'Box B2', 'Collective', 5, 'Zone Est'),
(3, 'Box C3', 'Individuelle', 1, 'Zone Sud');

INSERT INTO animal (id, name, type, race, sex, birth_date, arrival_date, behaviour, health, picture, box_id_id) VALUES
(1, 'Rex', 'Chien', 'Berger Allemand', 'M', '2018-04-12', '2025-06-01', 'Protecteur', 'Bon', 'rex.jpg', 1),
(2, 'Mia', 'Chat', 'Siamois', 'F', '2020-08-20', '2025-06-15', 'Calme', 'Allergie légère', 'mia.jpg', 2),
(3, 'Oscar', 'Chien', 'Labrador', 'M', '2017-11-05', '2025-05-10', 'Joueur', 'Surpoids', 'oscar.jpg', 2),
(4, 'Nala', 'Chat', 'Maine Coon', 'F', '2021-02-14', '2025-07-01', 'Curieuse', 'Bon', 'nala.jpg', 3);