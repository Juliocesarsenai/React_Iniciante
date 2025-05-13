package com.example.senai.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    @NotBlank(message = "Nome é obrigatorio")
    private String nome;

    @Column(nullable = false)
    @NotBlank(message = "Telefone é obrigatorio")
    private String telefone;
    
    @Column(nullable = false)
    @NotBlank(message = "Email é obrigatorio")
    @Email(message = "Deve ser um email válido.")
    private String email;
    
    @Column(nullable = false)
    @NotBlank(message = "CPF obrigatorio")
    private String cpf;
    
    @Column(nullable = false)
    @NotBlank(message = "CEP é obrigatorio")
    private String cep;
    
    @Column(nullable = false)
    @NotBlank(message = "Senha é obrigatoria")
    @Size(min = 3, message = "A senha deve ter no minimo 3 caracteres.")
    private String senha;

    public Usuario() {
    }

    public Usuario(long id, String nome, String telefone, String email, String cpf, String cep, String senha) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.cep = cep;
        this.senha = senha;
    }

    public @NotBlank(message = "Nome é obrigatorio") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome é obrigatorio") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "Senha é obrigatoria") @Size(min = 3, message = "A senha deve ter no minimo 3 caracteres.") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "Senha é obrigatoria") @Size(min = 3, message = "A senha deve ter no minimo 3 caracteres.") String senha) {
        this.senha = senha;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public @NotBlank(message = "Telefone é obrigatorio") String getTelefone() {
        return telefone;
    }

    public void setTelefone(@NotBlank(message = "Telefone é obrigatorio") String telefone) {
        this.telefone = telefone;
    }

    public @NotBlank(message = "Email é obrigatorio") @Email(message = "Deve ser um email válido.") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email é obrigatorio") @Email(message = "Deve ser um email válido.") String email) {
        this.email = email;
    }

    public @NotBlank(message = "CEP é obrigatorio") String getCep() {
        return cep;
    }

    public void setCep(@NotBlank(message = "CEP é obrigatorio") String cep) {
        this.cep = cep;
    }

    public @NotBlank(message = "CPF obrigatorio") String getCpf() {
        return cpf;
    }

    public void setCpf(@NotBlank(message = "CPF obrigatorio") String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Usuario2{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cep='" + cep + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
