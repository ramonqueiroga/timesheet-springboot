package br.com.timesheet.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * Created by ramon on 04/06/16.
 */
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String nome;
    @NotNull
    private String senha;
    @NotNull
    private boolean habilitado = true;
    @NotNull
    private boolean credencialExpirada = false;
    @NotNull
    private boolean expirado = false;
    @NotNull
    private boolean bloqueado = false;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "UsuarioRegra",
            joinColumns = @JoinColumn(name="usuarioId", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name="regraId", referencedColumnName = "id"))
    private Set<Regra> regras;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public boolean isCredencialExpirada() {
        return credencialExpirada;
    }

    public void setCredencialExpirada(boolean credencialExpirada) {
        this.credencialExpirada = credencialExpirada;
    }

    public boolean isExpirado() {
        return expirado;
    }

    public void setExpirado(boolean expirado) {
        this.expirado = expirado;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public Set<Regra> getRegras() {
        return regras;
    }

    public void setRegras(Set<Regra> regras) {
        this.regras = regras;
    }
}
