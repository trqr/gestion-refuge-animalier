INSERT INTO box (id, name, type, capacity, address) VALUES
(1, 'Box A1', 'Individuelle', 1, 'Zone Nord'),
(2, 'Box B2', 'Collective', 4, 'Zone Est'),
(3, 'Box C3', 'Individuelle', 1, 'Zone Sud'),
(4, 'Box D4', 'Petit Chien - Collective', 3, 'Zone Ouest'),
(5, 'Box E5', 'Individuelle', 1, 'Zone Centrale'),
(6, 'Box F6', 'Collective', 5, 'Zone Est'),
(7, 'Box G7', 'Collective', 4, 'Zone Nord'),
(8, 'Box H8', 'Individuelle', 1, 'Zone Sud'),
(9, 'Box I9', 'Collective', 3, 'Zone Ouest'),
(10, 'Box J10', 'Individuelle', 1, 'Zone Centrale'),
(11, 'Box K11', 'Chat Collective', 10, 'Zone Centrale');



INSERT INTO animal (id, name, type, race, sex, birth_date, arrival_date, behaviour, health, picture, box_id, is_adopted) VALUES
(1, 'Rex', 'Chien', 'Berger Allemand', 'M', '2018-04-12', '2025-06-01', 'Protecteur', 'Bon', 'https://images.unsplash.com/photo-1619983081563-d5ef2de763b7', null, 1),
(2, 'Mia', 'Chat', 'Siamois', 'F', '2020-08-20', '2025-06-15', 'Calme', 'Allergie légère', 'https://images.unsplash.com/photo-1592194996308-7b43878e84a6', 2, 0),
(3, 'Oscar', 'Chien', 'Labrador', 'M', '2017-11-05', '2025-05-10', 'Joueur', 'Surpoids', 'https://images.unsplash.com/photo-1560743641-3914f2c45636', 2, 0),
(4, 'Nala', 'Chat', 'Maine Coon', 'F', '2021-02-14', '2025-07-01', 'Curieuse', 'Bon', 'https://images.unsplash.com/photo-1592194996308-7b43878e84a6', null, 1),
(5, 'Toby', 'Chien', 'Golden Retriever', 'M', '2019-06-23', '2025-06-20', 'Affectueux', 'Bon', 'https://images.unsplash.com/photo-1558788353-f76d92427f16', 4, 0),
(6, 'Luna', 'Chat', 'Persan', 'F', '2022-01-12', '2025-07-15', 'Discrète', 'Asthme léger', 'https://images.unsplash.com/photo-1555685812-4b943f1cb0eb', 4, 0),
(7, 'Max', 'Chien', 'Border Collie', 'M', '2016-08-09', '2025-05-30', 'Hyperactif', 'Bon', 'https://images.unsplash.com/photo-1601758123927-1969082b3b26', 5, 0),
(8, 'Chloé', 'Chat', 'Chartreux', 'F', '2019-12-11', '2025-06-25', 'Paisible', 'Bon', 'https://images.unsplash.com/photo-1574158622682-e40e69881006', 11, 0),
(9, 'Milo', 'Chien', 'Shiba Inu', 'M', '2021-04-01', '2025-06-05', 'Indépendant', 'Bon', 'https://images.unsplash.com/photo-1601758003122-58e5fca11dd1', 6, 0),
(10, 'Bella', 'Chat', 'Bengal', 'F', '2020-03-22', '2025-06-10', 'Joueuse', 'Bon', 'https://images.unsplash.com/photo-1592194996308-7b43878e84a6', 6, 0),
(11, 'Rocky', 'Chien', 'Rottweiler', 'M', '2015-07-14', '2025-07-02', 'Protecteur', 'Arthrose', 'https://images.unsplash.com/photo-1596495577886-d920f1fb7238', 7, 0),
(12, 'Lily', 'Chat', 'Abyssin', 'F', '2021-10-05', '2025-06-30', 'Vive', 'Bon', 'https://images.unsplash.com/photo-1543852786-1cf6624b9987', 7, 0),
(13, 'Diesel', 'Chien', 'Dobermann', 'M', '2018-09-18', '2025-06-11', 'Calme', 'Bon', 'https://images.unsplash.com/photo-1619982699969-4bcb39c5b371', 7, 0),
(14, 'Sacha', 'Chat', 'Norvégien', 'F', '2022-05-12', '2025-07-03', 'Curieuse', 'Bon', 'https://images.unsplash.com/photo-1518791841217-8f162f1e1131?fm=jpg&q=60&w=3000&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8Y2hhdHN8ZW58MHx8MHx8fDA%3D', 11, 0),
(15, 'Zeus', 'Chien', 'Malinois', 'M', '2020-11-01', '2025-07-08', 'Sportif', 'Bon', 'https://images.unsplash.com/photo-1583511655789-8c3e1c02d57f', 9, 0),
(16, 'Nino', 'Chat', 'Ragdoll', 'M', '2021-08-10', '2025-06-18', 'Affectueux', 'Bon', 'https://images.unsplash.com/photo-1610986603163-5ec24f4e1db9', 9, 0),
(17, 'Flamme', 'Chien', 'Beagle', 'F', '2016-03-09', '2025-06-09', 'Sociable', 'Otite chronique', 'https://images.unsplash.com/photo-1568572933382-74d440642117', 9, 0),
(18, 'Igor', 'Chien', 'Cane Corso', 'M', '2019-01-20', '2025-07-05', 'Docile', 'Bon', 'https://images.unsplash.com/photo-1587486913044-d6389c565b1f', 6, 0),
(19, 'Gipsy', 'Chat', 'Sphynx', 'F', '2020-09-01', '2025-06-12', 'Pot-de-colle', 'Peau fragile', 'https://images.unsplash.com/photo-1574158622682-e40e69881006', 6, 0),
(20, 'Jazz', 'Chien', 'Husky', 'M', '2017-12-25', '2025-06-28', 'Très énergique', 'Yeux irrités', 'https://images.unsplash.com/photo-1574158622682-e40e69881006', 4, 0),
(21, 'Nemo', 'Chat', 'Devon Rex', 'M', '2021-06-30', '2025-07-01', 'Joueur', 'Bon', 'https://images.unsplash.com/photo-1600843381414-47c2b9fce7b5', null, 1),
(22, 'Ruby', 'Chien', 'Staffie', 'F', '2018-02-10', '2025-06-17', 'Fidèle', 'Allergie cutanée', 'https://images.unsplash.com/photo-1583337130417-3346a1be7dee', 2, 0),
(23, 'Canelle', 'Chat', 'Angora Turc', 'F', '2022-09-11', '2025-07-04', 'Douce', 'Bon', 'https://images.unsplash.com/photo-1574158622682-e40e69881006', 2, 0),
(24, 'Thor', 'Chien', 'Akita Inu', 'M', '2016-06-22', '2025-06-21', 'Calme', 'Bon', 'https://images.unsplash.com/photo-1561037404-61cd46aa6152', 8, 0),
(25, 'Olympe', 'Chat', 'British Shorthair', 'F', '2020-02-29', '2025-06-30', 'Indépendante', 'Bon', 'https://images.unsplash.com/photo-1583337130417-3346a1be7dee', 1, 0);

INSERT INTO food (id, type, quantity, frequency, description, animal_id) VALUES
(1, 'Croquettes', 500, '2 fois par jour', 'Croquettes premium pour chien adulte', 1),
(2, 'Pâtée', 300, '1 fois par jour', 'Pâtée pour chat sensible', 2),
(3, 'Croquettes', 450, '2 fois par jour', 'Croquettes light pour chien en surpoids', 3),
(4, 'Croquettes', 400, '2 fois par jour', 'Alimentation pour chat stérilisé', 4),
(5, 'Croquettes', 600, '2 fois par jour', 'Croquettes riches en protéines pour chien actif', 5),
(6, 'Pâtée', 250, '1 fois par jour', 'Pâtée au poisson pour chat', 6),
(7, 'Croquettes', 550, '2 fois par jour', 'Croquettes sans céréales pour chien', 7),
(8, 'Croquettes', 350, '2 fois par jour', 'Alimentation légère pour chat senior', 8),
(9, 'Croquettes', 480, '2 fois par jour', 'Croquettes pour chien de petite taille', 9),
(10, 'Croquettes', 400, '1 fois par jour', 'Croquettes pour chatons en croissance', 10),
(11, 'Pâtée', 300, '2 fois par jour', 'Pâtée pour chien en convalescence', 11),
(12, 'Croquettes', 370, '2 fois par jour', 'Croquettes digestes pour chats', 12),
(13, 'Croquettes', 600, '2 fois par jour', 'Alimentation énergie + pour chien sportif', 13),
(14, 'Pâtée', 220, '1 fois par jour', 'Pâtée fine pour chat difficile', 14),
(15, 'Croquettes', 500, '2 fois par jour', 'Croquettes hypoallergéniques', 15);

INSERT INTO veterinarian (address, name, speciality) VALUES
("45, rue Charles Edouard à 37000 Tours", "Dr Pichot G", "anesthésie et analgésie"),
("2, rue du Leclerc à 37230 St-Cyr-sur-Loire", "Dr Scridon A", "chirurgie"),
("20, place du grand marché à 37000 Tours", "Dr Dhérouville X", "dermatologie et nutrition");

INSERT INTO health_care (animal_id, veterinarian_id, date, description, type) VALUES
(1, 1, "2025-06-15", "Vaccination annuelle contre la rage et la leptospirose", "Vaccination"),
(2, 3, "2025-07-03", "Traitement antiparasitaire externe et interne", "Traitement"),
(3, 2, "2025-05-22", "Détartrage complet sous anesthésie", "Soins dentaires"),
(5, 1, "2025-06-28", "Vérification post-adoption et rappel vaccins", "Consultation"),
(6, 3, "2025-07-12", "Contrôle et traitement contre l'asthme", "Suivi médical"),
(7, 2, "2025-05-30", "Suture de plaie suite à une coupure", "Chirurgie"),
(10, 3, "2025-06-18", "Stérilisation et suivi post-opératoire", "Chirurgie"),
(11, 1, "2025-07-02", "Traitement de l'arthrose par anti-inflammatoires", "Traitement"),
(14, 3, "2025-07-05", "Examen complet après adoption", "Consultation"),
(17, 3, "2025-06-14", "Nettoyage et traitement de l’otite chronique", "Traitement"),
(19, 2, "2025-06-25", "Soins dermatologiques pour peau fragile", "Dermatologie"),
(20, 1, "2025-06-29", "Contrôle ophtalmologique pour yeux irrités", "Consultation"),
(22, 3, "2025-06-21", "Allergie cutanée : traitement antihistaminique", "Traitement"),
(24, 1, "2025-07-01", "Bilan de santé complet et vaccins annuels", "Consultation"),
(1, 1, "2025-09-15", "Rappel de vaccination contre la rage", "Vaccination"),
(3, 2, "2025-08-20", "Contrôle du poids et bilan sanguin", "Consultation"),
(5, 3, "2025-08-10", "Détartrage préventif", "Soins dentaires"),
(7, 1, "2025-08-25", "Bilan annuel et test d’agilité", "Consultation"),
(10, 3, "2025-09-10", "Contrôle post-stérilisation", "Chirurgie"),
(14, 2, "2025-08-22", "Vérification de la vue", "Consultation"),
(17, 3, "2025-09-18", "Nettoyage régulier de l’oreille gauche", "Traitement"),
(19, 2, "2025-08-28", "Contrôle dermatologique", "Dermatologie"),
(20, 1, "2025-09-05", "Contrôle des yeux et traitement anti-irritations", "Consultation"),
(22, 3, "2025-09-12", "Injection antihistaminique", "Traitement");

INSERT INTO adopter (address, email, name, phone) VALUES
("40, rue jean reno 37390 CHANCEAU",  "jean@reno.com", "Jean Reno", "0603040506"),
("22, rue Jean Luc 37390 CHARENTILLY",  "jean@luc.com", "Jean Luc", "0603040706"),
("3, rue Jean Robert 37390 CAMEMBERT",  "jean@robert.com", "Jean Robert", "0603040516");

INSERT INTO adoption (adopter_id, animal_id, status, date) VALUES
(1,1, "terminé", "2025-08-09"),
(2,4,"terminé", "2025-08-01"),
(3,21,"terminé", "2025-08-08");