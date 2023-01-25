package br.com.dio.collection.map.exercicioProposto03;

import java.util.Objects;

public class Contato {
    private String nome;
    private Integer numero;

    public Contato(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return this.nome;
    }

    public Integer getNumero() {
        return this.numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return this.nome.equals(contato.nome) && this.numero.equals(contato.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.nome, this.numero);
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + this.nome + '\'' +
                ", numero='" + this.numero + '\'' +
                '}';
    }
}