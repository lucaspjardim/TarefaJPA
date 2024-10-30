package org.br.lucaspjardim.domain;

import javax.persistence.*;


/**
 * Author: Lucas Jardim
 */
@Entity
@Table(name = "Produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produtos_seq")
    @SequenceGenerator(name = "produtos_seq", sequenceName = "sq_produtos", initialValue = 1, allocationSize = 1)
    private Long Id;

    @Column(name = "CODIGO", length = 10, nullable = false, unique = true)
    private String codigo;

    @Column(name = "NOME", length = 50, nullable = false)
    private String nome;

    @Column(name = "PRECO", nullable = false)
    private Double preco;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
