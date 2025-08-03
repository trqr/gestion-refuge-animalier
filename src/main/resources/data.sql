INSERT INTO box (id, name, type, capacity, address) VALUES
(1, 'Box A1', 'Individuelle', 1, 'Zone Nord'),
(2, 'Box B2', 'Collective', 5, 'Zone Est'),
(3, 'Box C3', 'Individuelle', 1, 'Zone Sud');

INSERT INTO animal (id, name, type, race, sex, birth_date, arrival_date, behaviour, health, picture, box_id_id) VALUES
(1, 'Rex', 'Chien', 'Berger Allemand', 'M', '2018-04-12', '2025-06-01', 'Protecteur', 'Bon', 'https://www.francebleu.fr/s3/cruiser-production/2024/01/ad705aba-0194-404b-8de9-b7c70f5bdced/1200x680_sc_maxstockworld419083.jpg', 1),
(2, 'Mia', 'Chat', 'Siamois', 'F', '2020-08-20', '2025-06-15', 'Calme', 'Allergie légère', 'https://www.la-spa.fr/app/app/uploads/2023/07/prendre-soin_duree-vie-chat.jpg', 2),
(3, 'Oscar', 'Chien', 'Labrador', 'M', '2017-11-05', '2025-05-10', 'Joueur', 'Surpoids', 'https://images.ctfassets.net/denf86kkcx7r/2Ghp9VQgpJxmXD14Bb3mva/43352c7e00f45cf55c464ef46f8d44ac/quelle-est-esperance-vie-chiens-13', 2),
(4, 'Nala', 'Chat', 'Maine Coon', 'F', '2021-02-14', '2025-07-01', 'Curieuse', 'Bon', 'https://cdn.shopify.com/s/files/1/0265/1327/7008/files/nom-de-chat.jpg?v=1727441136', 3);