-- Todas Pessoa que não possuem relação com Fisica
SELECT * FROM teste.pessoa p LEFT JOIN teste.fisica f ON p.pess_id = f.fisc_pessoa WHERE f.fisc_id IS NULL;

-- Todas Fisica que não possuem relação com Pessoa
SELECT * FROM teste.pessoa p RIGHT JOIN teste.fisica f ON p.pess_id = f.fisc_pessoa WHERE p.pess_id IS NULL;

-- Todas Pessoa que possuem relação com Fisica e CPF está nulo
SELECT * FROM teste.pessoa p RIGHT JOIN teste.fisica f ON p.pess_id = f.fisc_pessoa WHERE f.fisc_cpf IS NULL;