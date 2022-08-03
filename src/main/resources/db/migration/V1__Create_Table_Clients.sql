
CREATE TABLE `clients` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) NOT NULL,
  `endereço` varchar(255) NOT NULL,
  `telefone` bigint NOT NULL,
  `email` varchar(255) NOT NULL,
  `cpf` bigint NOT NULL,
  `observacao` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ;