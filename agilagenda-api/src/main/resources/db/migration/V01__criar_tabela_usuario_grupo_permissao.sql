CREATE TABLE usuario
(
	codigo bigserial NOT NULL,
    nome character varying(50) NOT NULL,
    sobrenome character varying(50) NOT NULL,
    email character varying(50) NOT NULL,
    senha character varying(120) NOT NULL,
    ativo BOOLEAN NOT NULL DEFAULT true,
    data_nascimento DATE,
    CONSTRAINT codigo_usuario PRIMARY KEY (codigo)
);



CREATE TABLE grupo (
    codigo  bigserial NOT NULL,
    nome character varying(50) NOT NULL,
    CONSTRAINT codigo_grupo PRIMARY KEY (codigo)
);



CREATE TABLE permissao (
    codigo bigserial NOT NULL,
    nome character varying(50) NOT NULL,
    CONSTRAINT codigo_permissao PRIMARY KEY (codigo)
);



CREATE TABLE usuario_grupo (
    codigo_usuario bigint NOT NULL,
    codigo_grupo bigint NOT NULL,
    CONSTRAINT  codigo_uduatio_grupo PRIMARY KEY (codigo_usuario, codigo_grupo),
    CONSTRAINT codigo_usuario FOREIGN KEY (codigo_usuario)
        REFERENCES usuario (codigo) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
      CONSTRAINT codigo_grupo FOREIGN KEY (codigo_grupo)
        REFERENCES grupo (codigo) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
); 



CREATE TABLE grupo_permissao (
    codigo_grupo bigint NOT NULL,
    codigo_permissao bigint NOT NULL,
	CONSTRAINT codigo_grupo_permissao PRIMARY KEY  (codigo_grupo, codigo_permissao),
      CONSTRAINT codigo_grupo FOREIGN KEY (codigo_grupo)
        REFERENCES grupo (codigo) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
          CONSTRAINT codigo_permissao FOREIGN KEY (codigo_permissao)
        REFERENCES permissao (codigo) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
); 
