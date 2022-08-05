
CREATE TABLE `colaboradores` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) NOT NULL,
  `cargo` varchar(255) NOT NULL,
  `remuneraçao` varchar(255) NOT NULL,
  `endereço` varchar(255) NOT NULL,
  `telefone` bigint NOT NULL,
  `email` varchar(255) NOT NULL,
  `cpf` bigint NOT NULL,
  PRIMARY KEY (`id`)
) ;