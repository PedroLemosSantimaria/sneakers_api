INSERT INTO sneaker_store.category (id, name, description) VALUES
(1, 'Running', 'Tênis voltados para corrida, com amortecimento e suporte para impacto'),
(2, 'Casual', 'Tênis para uso casual, confortável para o dia a dia'),
(3, 'Skate', 'Tênis desenhados para praticantes de skate, com solado resistente e aderente'),
(4, 'Basquete', 'Tênis específicos para prática de basquete, com suporte de tornozelo e tração'),
(5, 'Caminhada', 'Tênis leves e confortáveis para longas caminhadas e uso recreativo'),
(6, 'Treino', 'Tênis para academia e exercícios físicos variados, oferecendo estabilidade e suporte'),
(7, 'Outdoor', 'Tênis para trilhas e atividades ao ar livre, com resistência à água e tração extra'),
(8, 'Futebol', 'Tênis para futebol indoor ou society, com solado adequado para quadras e grama sintética'),
(9, 'Esportes Radicais', 'Tênis especializados para esportes de alta intensidade, como parkour ou BMX'),
(10, 'Estilo Retro', 'Tênis com design retrô inspirado em clássicos, populares para moda urbana');


INSERT INTO sneaker_store.brand (id, name, description) VALUES
(1, 'Nike', 'Marca americana conhecida pelos seus tênis esportivos, incluindo modelos para corrida, basquete e uso casual'),
(2, 'Adidas', 'Marca alemã com foco em calçados esportivos e casuais, famosa pela sua linha de tênis para futebol e streetwear'),
(3, 'Puma', 'Marca alemã que oferece uma variedade de tênis para esportes e lifestyle, com forte presença no futebol e no running'),
(4, 'Asics', 'Marca japonesa especializada em tênis para corrida e atividades esportivas, conhecida por seu foco em tecnologia de amortecimento'),
(5, 'New Balance', 'Marca americana que oferece tênis para corrida, caminhada e uso casual, com ênfase em conforto e suporte'),
(6, 'Reebok', 'Marca global que oferece tênis voltados para crossfit, corrida e estilo de vida ativo, parte do grupo Adidas'),
(7, 'Converse', 'Famosa pelos tênis Chuck Taylor All Star, a marca americana é icônica no estilo casual e urbano'),
(8, 'Vans', 'Marca californiana voltada para o público skatista e urbano, com foco em tênis resistentes e de estilo casual'),
(9, 'Mizuno', 'Marca japonesa com forte presença em tênis para corrida e esportes de alta performance, conhecida pela sua tecnologia de amortecimento'),
(10, 'Fila', 'Marca italiana que oferece tênis esportivos e de lifestyle, popular no running, no treino e na moda casual');


INSERT INTO sneaker_store.sneaker (id, name, price, unity_measure, size, color, category_id, brand_id) VALUES
(1, 'Nike Air Max 270', 150.00, 'USD', 42.5, 'Preto/Vermelho', 1, 1),
(2, 'Adidas Ultraboost 21', 180.00, 'USD', 43.0, 'Branco/Preto', 1, 2),
(3, 'Puma RS-X3', 120.00, 'USD', 42.0, 'Azul/Verde', 2, 3),
(4, 'Asics Gel-Kayano 27', 160.00, 'USD', 41.5, 'Cinza/Azul', 1, 4),
(5, 'New Balance 574', 90.00, 'USD', 44.0, 'Verde/Branco', 2, 5),
(6, 'Reebok Nano X', 130.00, 'USD', 42.0, 'Preto/Branco', 6, 6),
(7, 'Converse Chuck Taylor All Star', 60.00, 'USD', 40.5, 'Branco', 2, 7),
(8, 'Vans Old Skool', 70.00, 'USD', 41.0, 'Preto/Branco', 3, 8),
(9, 'Mizuno Wave Rider 24', 140.00, 'USD', 43.5, 'Azul/Cinza', 1, 9),
(10, 'Fila Disruptor II', 85.00, 'USD', 42.0, 'Branco', 2, 10);